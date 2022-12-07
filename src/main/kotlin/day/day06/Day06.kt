package day.day06

import day.Day

class Day06 : Day() {

    override fun partOne(inputLines: List<String>) = solve(inputLines.first(), 4)

    override fun partTwo(inputLines: List<String>) = solve(inputLines.first(), 14)

    private fun solve(input: String, windowSize: Int): Int {
        input.windowed(windowSize).forEachIndexed { index, group ->
            if (group.toSet().size == group.length) return index + group.length
        }
        return -1
    }
}
