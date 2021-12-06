fun main() {
    fun part1(input: List<String>): Int {
        var lastIncreasedItem: Int? = null
        var count = 0

        for (item in input) {
            if (lastIncreasedItem == null) {
                lastIncreasedItem = item.toInt()
                continue
            }

            when ( item.toInt() > lastIncreasedItem){
                true -> {
                    count++
                    println("${item.toInt()} (increased)")
                }
                false -> println("${item.toInt()} (decreased)")
            }

            lastIncreasedItem = item.toInt()
        }
        return count
    }

    fun part2(input: List<String>): Int {
        val inputInt: List<Int> = input.map { Integer.parseInt(it) }
        val sumItems = 3
        var count = 0

        for (i in 0 until inputInt.size-sumItems) {
            val first = inputInt.subList(i, i+sumItems).sum()
            val second = inputInt.subList(i+1, i+sumItems+1).sum()

            when (second > first) {
                true -> count++
            }
        }
        return count
    }

    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day01_test")
    //check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
