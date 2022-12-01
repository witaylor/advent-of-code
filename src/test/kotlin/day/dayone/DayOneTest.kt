package day.dayone

import day.dayone.DayOne
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.File

class DayOneTest {

    private val testInput = File("src/test/kotlin/day/dayone/input.txt").readLines()

    @Test
    fun testPartOne() = assertEquals(24000, DayOne().partOne(testInput))

    @Test
    fun testPartTwo() = assertEquals(45000, DayOne().partTwo(testInput))
}
