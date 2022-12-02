package day.daytwo

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.File

class DayTwoTest {

    private val testInput = File("src/test/kotlin/day/daytwo/input.txt").readLines()

    @Test
    fun testPartOne() = assertEquals(15, DayTwo().partOne(testInput))

    @Test
    fun testPartTwo() = assertEquals(12, DayTwo().partTwo(testInput))
}
