import java.io.File

fun readInputFileAsInt(fileName: String): MutableList<Int> {
    var inputMutableList = mutableListOf<Int>()
    File(fileName).forEachLine {
        inputMutableList.add(it.toInt())
    }
    return inputMutableList
}

fun readInputFileAsString(inputFileName: String): MutableList<String>{
    val inputMutableList = mutableListOf<String>()
    File(inputFileName).forEachLine {
        inputMutableList.add(it)
    }
    return inputMutableList
}