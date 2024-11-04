package sec02

data class Money(val amount: Long) : Comparable<Money> {
    override fun compareTo(other: Money): Int {
        return this.amount.compareTo(other.amount)
    }
}