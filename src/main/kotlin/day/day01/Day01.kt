package day.day01

import day.Day

class Day01: Day() {
    private var calorieTotals: List<Int> = emptyList()

    override fun partOne(inputLines: List<String>): Int = getCalorieTotals(inputLines).max()

    override fun partTwo(inputLines: List<String>): Int = getCalorieTotals(inputLines)
        .sortedDescending()
        .take(3)
        .sum()

    private fun getCalorieTotals(inputLines: List<String>): List<Int> {
        if (calorieTotals.isNotEmpty()) return calorieTotals

        val totals: MutableList<Int> = mutableListOf()
        var currentCalories = 0

        inputLines.forEach {
            if (it.isEmpty()) {
                totals.add(currentCalories)
                currentCalories = 0
            } else {
                currentCalories += it.toInt()
            }
        }

        calorieTotals = totals
        return totals
    }
}
