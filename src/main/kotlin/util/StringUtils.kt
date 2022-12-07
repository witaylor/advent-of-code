package util

/**
 * Returns `true` if the string is any number. It matches both integers and decimals.
 */
fun String.isNumber(): Boolean = this.matches(Regex("^\\d+\\.?\\d*\$"))
