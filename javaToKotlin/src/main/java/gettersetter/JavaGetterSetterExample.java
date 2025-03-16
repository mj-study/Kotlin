package gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {

    public static void main(String[] args) {
        Student student = new Student();

//        student.setName("스티븐");
        student.name = "스티븐";
        student.setBirthDate(LocalDate.of(1995, 10, 4));

//        System.out.println(student.getName());
        System.out.println(student.name);
        System.out.println(student.getBirthDate());

        // age -> val 불변객체로 set하지 못함
        System.out.println(student.getAge());

        // 접근 x -> private 접근제어자
        // student.setGrade()
        System.out.println(student.getGrade());
        student.changeGrade("1학년"); // 메서드를 통해 수정
        System.out.println(student.getGrade());
    }

}
