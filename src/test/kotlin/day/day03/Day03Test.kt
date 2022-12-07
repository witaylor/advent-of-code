package day.day03

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day03Test {
    private val testInput = File("src/test/kotlin/day/day03/input.txt").readLines()

    @Test
    fun testPartOne() = Assertions.assertEquals(157, Day03().partOne(testInput))

    @Test
    fun testPartTwo() = Assertions.assertEquals(70, Day03().partTwo(testInput))
}
