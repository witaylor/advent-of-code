package day.day07

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day07Test {
    private val testInput = File("src/test/kotlin/day/day07/input.txt").readLines()

    @Test
    fun testPartOne() = Assertions.assertEquals(95437, Day07().partOne(testInput))

    @Test
    fun testPartTwo() = Assertions.assertEquals(24933642, Day07().partTwo(testInput))
}
