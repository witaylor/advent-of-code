import day.Day
import day.dayone.DayOne
import java.io.File

fun main(args: Array<String>) {
    val days: List<Day> = listOf(DayOne())

    days.forEach { day ->
        val dayClassName = day.javaClass.toString().split(".").last()
        val inputLines = File("src/main/kotlin/day/$dayClassName/input.txt").readLines()

        println("""
        Day ${dayClassName.split(Regex("(?=\\p{Upper})")).last()}
        1. ${day.partOne(inputLines)}
        2. ${day.partTwo(inputLines)}
        
        """.trimIndent())
    }
}
