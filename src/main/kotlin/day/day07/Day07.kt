package day.day07

import day.Day
import util.isNumber

class Day07 : Day() {

    override fun partOne(inputLines: List<String>): Any = buildDirectories(inputLines).filter {
        it.size < 100000
    }.sumOf {
        it.size
    }

    override fun partTwo(inputLines: List<String>): Any {
        val fileSystemSize = 70000000
        val unusedSpaceNeeded = 30000000

        val directories = buildDirectories(inputLines)

        val baseDir = directories.find { it.name == "/" }
        val availableSpace = fileSystemSize - baseDir!!.size

        return directories.filter {
            availableSpace + it.size >= unusedSpaceNeeded
        }.minByOrNull { it.size }!!.size
    }

    private fun buildDirectories(inputLines: List<String>): MutableList<Directory> {
        var currentDirectory: Directory? = null
        val directories = mutableListOf<Directory>()

        inputLines.forEach { line ->
            val command = line.split(" ")
            // cd in to a new directory
            if (command[1] == "cd" && command[2] != "..") {
                val newDir = Directory(command[2], currentDirectory)
                directories.add(newDir)
                currentDirectory?.subDirs?.add(newDir)
                currentDirectory = newDir
            }

            // cd out of current directory
            if (command[1] == "cd" && command[2] == "..") {
                currentDirectory = currentDirectory?.parentDir
            }

            // is a file outputted by ls
            if (command[0] != "$" && command[0].isNumber()) {
                currentDirectory!!.files.add(File(command[1], command[0].toInt()))
            }
        }

        return directories
    }
}

data class File(
    val name: String,
    val size: Int
)

data class Directory(
    val name: String,
    val parentDir: Directory?,
    val subDirs: MutableList<Directory> = mutableListOf(),
    val files: MutableList<File> = mutableListOf()
) {
    val size: Int
        get() = files.sumOf { it.size } + subDirs.sumOf { it.size }
}
