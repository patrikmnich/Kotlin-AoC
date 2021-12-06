fun main() {
    fun part1(input: List<String>): Int {
        var forward = 0
        var depth = 0

        input.forEach {
            val command = it.split(" ")
            when (command[0]) {
                "forward" -> forward += command[1].toInt()
                "down" -> depth += command[1].toInt()
                "up" -> depth -= command[1].toInt()
            }
        }
        return forward*depth
    }

    fun part2(input: List<String>): Int {
        var forward = 0
        var depth = 0
        var aim = 0

        input.forEach {
            val command = it.split(" ")
            when (command[0]) {
                "forward" -> {
                    forward += command[1].toInt()
                    depth += command[1].toInt() * aim
                }
                "down" -> aim += command[1].toInt()
                "up" -> aim -= command[1].toInt()
            }
        }
        return forward*depth
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
