package com.group.libraryapp.service.book

import com.group.libraryapp.domain.book.Book
import com.group.libraryapp.domain.book.BookRepository
import com.group.libraryapp.domain.book.BookType
import com.group.libraryapp.domain.user.User
import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.domain.user.loanhistory.UserLoanHistory
import com.group.libraryapp.domain.user.loanhistory.UserLoanHistoryRepository
import com.group.libraryapp.domain.user.loanhistory.UserLoanStatus
import com.group.libraryapp.dto.book.request.BookLoanRequest
import com.group.libraryapp.dto.book.request.BookRequest
import com.group.libraryapp.dto.book.request.BookReturnRequest
import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BookServiceTest @Autowired constructor(
    private val bookService: BookService,
    private val bookRepository: BookRepository,
    private val userRepository: UserRepository,
    private val userLoanHistoryRepository: UserLoanHistoryRepository,
) {

    @AfterEach
    fun clean() {
        bookRepository.deleteAll()
        userRepository.deleteAll()
    }

    @Test
    @DisplayName("책 등록")
    fun saveBookTest() {
        //given
        val request = BookRequest("개미", BookType.COMPUTER)

        //when
        bookService.saveBook(request)

        //then
        val books = bookRepository.findAll()
        assertThat(books).hasSize(1)
        assertThat(books[0].name).isEqualTo("개미")
        assertThat(books[0].type).isEqualTo(BookType.COMPUTER)
    }

    @Test
    @DisplayName("책 대출 정상")
    fun loanBookTest() {
        //given
        bookRepository.save(Book.fixture("개미"))
        val savedUser = userRepository.save(
            User(
                "한강",
                30
            )
        )
        val request = BookLoanRequest("한강", "개미")

        //when
        bookService.loanBook(request)

        //then
        val results = userLoanHistoryRepository.findAll()
        assertThat(results).hasSize(1)
        assertThat(results[0].bookName).isEqualTo("개미")
        assertThat(results[0].user.id).isEqualTo(savedUser.id)
        assertThat(results[0].status).isEqualTo(UserLoanStatus.LOANED)

    }

    @Test
    @DisplayName("이미 책이 대출되어 있으면 신규 대출 실패")
    fun loanBookFailTest() {
        //given
        bookRepository.save(Book.fixture("개미"))
        val savedUser = userRepository.save(
            User(
                "한강",
                30
            )
        )
        userLoanHistoryRepository.save(
            UserLoanHistory.fixture(
                savedUser,
                "개미",
            )
        )
        val request = BookLoanRequest("한강", "개미")

        //when & then
        assertThat(
            assertThrows<IllegalArgumentException> {
                bookService.loanBook(request)
            }.message
        ).isEqualTo("진작 대출되어 있는 책입니다")
    }

    @Test
    @DisplayName("책 반납 정상")
    fun returnBook() {
        //given
        bookRepository.save(Book.fixture("개미"))
        val savedUser = userRepository.save(
            User(
                "한강",
                30
            )
        )
        userLoanHistoryRepository.save(
            UserLoanHistory.fixture(
                savedUser,
                "개미",
            )
        )
        val request = BookReturnRequest("한강", "개미")

        //when
        bookService.returnBook(request)

        //then
        val results = userLoanHistoryRepository.findAll()
        assertThat(results).hasSize(1)
        assertThat(results[0].status).isEqualTo(UserLoanStatus.RETURNED)
    }
}