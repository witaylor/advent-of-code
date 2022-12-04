package day.day04

import day.Day

class Day04 : Day() {

    override fun partOne(inputLines: List<String>): Int = splitToRanges(inputLines).count { pair ->
        val firstContainsSecond = pair[1].all { pair[0].contains(it) }
        val secondContainsFirst = pair[0].all { pair[1].contains(it) }

        firstContainsSecond || secondContainsFirst
    }

    override fun partTwo(inputLines: List<String>): Int = splitToRanges(inputLines).count {
        val firstOverlapsSecond = it[0].first in it[1] || it[0].last in it[1]
        val secondOverlapsFirst = it[1].first in it[0] || it[1].last in it[0]

        firstOverlapsSecond || secondOverlapsFirst
    }

    private fun splitToRanges(inputLines: List<String>) = inputLines.map { line ->
        line.split(",").map { pair ->
            pair.split("-").map(String::toInt)
        }.map { it[0]..it[1] }
    }
}
