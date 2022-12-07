package day.day03

import day.Day

class Day03 : Day() {

    override fun partOne(inputLines: List<String>) = inputLines.sumOf { line ->
        val firstHalf = line.subSequence(0, line.length / 2).split("")
        val secondHalf = line.subSequence(line.length / 2, line.length).split("")

        firstHalf.intersect(secondHalf.toSet())
            .filter { it.isNotEmpty() }.sumOf {
                it.toCharArray().sumOf { char ->
                    (if (char.isUpperCase()) char - 38 else char - 96).code
                }
            }
    }

    override fun partTwo(inputLines: List<String>) = inputLines.windowed(3, 3).map { group ->
        group[0].toSet().intersect(group[1].toSet()).intersect(group[2].toSet())
    }.sumOf {
        it.toCharArray().sumOf { c -> prioritiseChar(c) }
    }

    private fun prioritiseChar(char: Char): Int = (if (char.isUpperCase()) char - 38 else char - 96).code
}
