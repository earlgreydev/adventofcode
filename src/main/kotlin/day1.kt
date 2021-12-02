fun day1() {
    println("Advent of Code: Day 1")
    var inputMutableList = readInputFileAsInt("src/main/resources/day1/input.txt")
    println("Part 1: ${compareIntegers(inputMutableList)}")
    println("Part 2: ${compareIntegers(combineLists(inputMutableList))}")
    println()
    println()
}

//Day 1 Part 1 Functions
fun compareIntegers(inputList: MutableList<Int>): String{
    var numberOfIncreased = 0
    for(item in inputList.indices){
        if (item == 0){
        } else {
            if(inputList[item] > inputList[item-1]){
                numberOfIncreased += 1
            }
        }
    }
    return numberOfIncreased.toString()
}

//Day 1 Part 2 Functions
fun combineLists(inputList: MutableList<Int>): MutableList<Int>{
    var combinedList = mutableListOf<Int>()
    inputList.windowed(3) {
        combinedList.add(it.sum())
    }
    return combinedList
}