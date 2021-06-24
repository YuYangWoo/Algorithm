import java.lang.StringBuilder

fun main() {
    print(solutionw(intArrayOf(6,10,2)))
}

fun solutionw(numbers: IntArray): String {
    var stringBuilder = StringBuilder()
    var stringArray = ArrayList<String>()
    numbers.forEach {
        stringArray.add(it.toString())
    }
    stringArray.sortedWith(Comparator<String> { o1, o2 ->
        println(       "o1은 $o1 o2는 $o2")

        (o2 + o1).compareTo(o1 + o2)
    }).forEach {
        println(it)

        stringBuilder.append(it)
    }
    if((stringBuilder.toString())[0] == '0') {
        return "0"
    }
return stringBuilder.toString()
}
