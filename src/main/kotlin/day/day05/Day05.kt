package day.day05

import day.Day
import util.isNumber
import java.util.Stack

data class Move(
    val quantity: Int,
    val startStack: Int,
    val endStack: Int
)

data class DayInput(
    val stacks: List<Stack<String>>,
    val movements: List<Move>
)

class Day05 : Day() {

    override fun partOne(inputLines: List<String>): Any {
        val input = buildInput(inputLines)

        input.movements.forEach {
            for (i in 0 until it.quantity) {
                input.stacks[it.endStack].push(input.stacks[it.startStack].pop())
            }
        }

        return formatResult(input.stacks)
    }

    override fun partTwo(inputLines: List<String>): Any {
        val input = buildInput(inputLines)

        input.movements.forEach {
            val itemsToMove = mutableListOf<String>()

            for (i in 0 until it.quantity) {
                itemsToMove.add(input.stacks[it.startStack].pop())
            }
            input.stacks[it.endStack].addAll(itemsToMove.reversed())
        }

        return formatResult(input.stacks)
    }

    private fun buildInput(lines: List<String>): DayInput {
        val split = lines.partition { !it.startsWith("move") }

        // build the stacks
        val numOfStacks = split.first.last { it.isNotEmpty() }.split(" ").last().toInt()
        val stacks = mutableListOf<Stack<String>>()
        for (i in 0 until numOfStacks) {
            stacks.add(Stack())
        }

        split.first.dropLast(2).reversed().forEach {
            val i = it.windowed(3, 4).map(String::trim)

            for (stack in 0 until numOfStacks) {
                if (i.size > stack && i[stack].isNotBlank()) {
                    stacks[stack].add(i[stack])
                }
            }
        }

        return DayInput(
            stacks = stacks,
            movements = split.second.map { move ->
                val moves = move.split(" ").filter(String::isNumber).map(String::toInt)

                Move(quantity = moves[0], startStack = moves[1] - 1, endStack = moves[2] - 1)
            }
        )
    }

    private fun formatResult(stacks: List<Stack<String>>): String = stacks.joinToString("") {
        it.pop()
    }.replace("[", "").replace("]", "")
}
