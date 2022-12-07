package day.day06

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day06Test {

    @Test
    fun testPartOne() {
        Assertions.assertEquals(7, Day06().partOne(listOf("mjqjpqmgbljsphdztnvjfqwrcgsmlb")))
        Assertions.assertEquals(5, Day06().partOne(listOf("bvwbjplbgvbhsrlpgdmjqwftvncz")))
        Assertions.assertEquals(6, Day06().partOne(listOf("nppdvjthqldpwncqszvftbrmjlhg")))
        Assertions.assertEquals(10, Day06().partOne(listOf("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg")))
        Assertions.assertEquals(11, Day06().partOne(listOf("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw")))
    }

    @Test
    fun testPartTwo() {
        Assertions.assertEquals(19, Day06().partTwo(listOf("mjqjpqmgbljsphdztnvjfqwrcgsmlb")))
        Assertions.assertEquals(23, Day06().partTwo(listOf("bvwbjplbgvbhsrlpgdmjqwftvncz")))
        Assertions.assertEquals(23, Day06().partTwo(listOf("nppdvjthqldpwncqszvftbrmjlhg")))
        Assertions.assertEquals(29, Day06().partTwo(listOf("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg")))
        Assertions.assertEquals(26, Day06().partTwo(listOf("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw")))
    }
}
