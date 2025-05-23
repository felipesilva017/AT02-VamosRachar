package com.fw.vamosrachar.model

class MoneyDivision(private val totalMoney: Float, private val amountOfPeopleToDivide: Int) {
    init {
        require(totalMoney >= 0) { "totalMoney must not be less than zero." }
        require(amountOfPeopleToDivide > 0) { "amountOfPeopleToDivide must be greater than zero." }
    }

    fun calcMoneyForEachPerson(): Float {
        return totalMoney / amountOfPeopleToDivide
    }

    fun formatMoneyValueToString(money: Float): String {
        return Currency(CurrencyCode.BRL).format(money)
    }

    companion object {
        fun formatMoneyToDecimal(text: String): String {
            val onlyNumbersAndCommas = text.replace(Regex("[^0-9,.]+"), "")
            val onlyNumberAndDecimal = onlyNumbersAndCommas.replace(".", "")
            return onlyNumberAndDecimal.replace(",", ".")
        }
    }
}
