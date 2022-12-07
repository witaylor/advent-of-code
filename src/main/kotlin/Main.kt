import day.Day
import day.day01.Day01
import day.day02.Day02
import day.day03.Day03
import day.day04.Day04
import day.day05.Day05
import day.day06.Day06
import day.day07.Day07
import java.io.File

fun main() {
    val days: List<Day> = listOf(Day01(), Day02(), Day03(), Day04(), Day05(), Day06(), Day07())

    days.forEach { day ->
        val dayClassName = day.javaClass.toString().split(".").last()
        val inputLines = File("src/main/kotlin/day/$dayClassName/input.txt").readLines()

        println("""
        Day ${dayClassName.replace("Day", "")}
        1. ${day.partOne(inputLines)}
        2. ${day.partTwo(inputLines)}
        
        """.trimIndent())
    }
}
