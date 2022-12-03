package day.day01

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.File

class Day01Test {

    private val testInput = File("src/test/kotlin/day/day01/input.txt").readLines()

    @Test
    fun testPartOne() = assertEquals(24000, Day01().partOne(testInput))

    @Test
    fun testPartTwo() = assertEquals(45000, Day01().partTwo(testInput))
}
