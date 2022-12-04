package day.day04

import day.day03.Day03
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day04Test {
    private val testInput = File("src/test/kotlin/day/day04/input.txt").readLines()

    @Test
    fun testPartOne() = Assertions.assertEquals(2, Day04().partOne(testInput))

    @Test
    fun testPartTwo() = Assertions.assertEquals(4, Day04().partTwo(testInput))
}
