fun day2() {
    println("Advent of Code: Day 2")
    val inputList = readInputFileAsString("src/main/resources/day2/input.txt")
    println("Part 1: ${checkContains(inputList)}")
    println("Part 2: ${checkContainsPart2(inputList)}")
    println()
    println()
}

fun checkContains(inputList: MutableList<String>): Int {
    var horizontalIncrease: Int = 0
    var depthIncrease: Int = 0
    var depthDecrease: Int = 0
    var depthTotal: Int = 0
    var product: Int = 0
    inputList.forEach {
        if (it.contains("forward")) {
            horizontalIncrease += it.last().digitToInt()
        } else if (it.contains("down")) {
            depthIncrease += it.last().digitToInt()
        } else {
            depthDecrease += it.last().digitToInt()
        }
    }
    depthTotal = depthIncrease - depthDecrease
    product = depthTotal * horizontalIncrease
    return product
}

fun checkContainsPart2(inputList: MutableList<String>): Int {
    var horizontalIncrease: Int = 0
    var depthTotal: Int = 0
    var aim: Int = 0
    var product: Int = 0
    inputList.forEach {
        if (it.contains("forward")) {
            //for part 2 this increases horizontal position
            //and increase depth by aim x current forward int
            horizontalIncrease += it.last().digitToInt()
            depthTotal += it.last().digitToInt() * aim
        } else if (it.contains("down")) {
            //increase aim by current down int
            //no longer increases depth
            aim += it.last().digitToInt()
        } else {
            //decreases aim by current up int
            //no longer decreases depth
            aim -= it.last().digitToInt()
        }
    }
    product = depthTotal * horizontalIncrease
    return product
}
