package day.day02

import day.Day

class Day02: Day() {

    override fun partOne(inputLines: List<String>): Int = inputLines.sumOf {
        when (it) {
            // you lose
            "A Z" -> 3
            "B X" -> 1
            "C Y" -> 2
            // you draw
            "A X" -> 4
            "B Y" -> 5
            "C Z" -> 6
            // you win
            "A Y" -> 8
            "B Z" -> 9
            "C X" -> 7
            else -> 0
        }.toInt()
    }

    override fun partTwo(inputLines: List<String>): Int = inputLines.sumOf {
        when (it) {
            // you lose
            "A X" -> 3
            "B X" -> 1
            "C X" -> 2
            // you draw
            "A Y" -> 4
            "B Y" -> 5
            "C Y" -> 6
            // you win
            "A Z" -> 8
            "B Z" -> 9
            "C Z" -> 7
            else -> 0
        }.toInt()
    }
}
