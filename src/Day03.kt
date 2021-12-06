fun main() {
    fun part1(input: List<String>): Int {
        var gammaRate = ""
        var epsilonRate = ""

        var bitLength = input[0].length

        val zeros:MutableList<Int> = MutableList(bitLength) { 0 }
        val ones:MutableList<Int> = MutableList(bitLength) { 0 }

        input.forEachIndexed { index, it ->
                when (it){
                    "0" -> {
                        zeros[index] += 1
                    }
                    "1" -> {
                        ones[index] += 1
                    }
                }
            }
        println(ones)

        for (i in 0 until zeros.size) {
            when (zeros[i]>ones[i]) {
                true -> {
                    gammaRate += "1"
                    epsilonRate += "0"
                }
                false -> {
                    gammaRate += "0"
                    epsilonRate += "1"
                }
            }
        }
        println(zeros)
        return gammaRate.toInt(2)*epsilonRate.toInt(2)
        }

    fun part2(input: List<String>): Int {
        return 0
    }

    val input = readInput("Day03")
    println(part1(input))
    //println(part2(input))
}
