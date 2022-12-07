package day.day05

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day05Test {
    private val testInput = File("src/test/kotlin/day/day05/input.txt").readLines()

    @Test
    fun testPartOne() = Assertions.assertEquals("CMZ", Day05().partOne(testInput))

    @Test
    fun testPartTwo() = Assertions.assertEquals("MCD", Day05().partTwo(testInput))
}
