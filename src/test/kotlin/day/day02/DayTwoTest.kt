package day.day02

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.File

class Day02Test {

    private val testInput = File("src/test/kotlin/day/day02/input.txt").readLines()

    @Test
    fun testPartOne() = assertEquals("15", Day02().partOne(testInput))

    @Test
    fun testPartTwo() = assertEquals("12", Day02().partTwo(testInput))
}
