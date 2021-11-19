fun main() {
    print(sol("AcZCbaBz"))
}

fun sol(S: String): Int {
    for(i in 1..S.length) {
        for(j in 0 until S.length-i+1) {
            var lowerSet = HashSet<Char>()
            var upperSet = HashSet<Char>()
            var temp = S.substring(j,j+i)
            var tempCharArr = temp.toCharArray()
            for(ch in tempCharArr) {
                if(Character.isLowerCase(ch)) {
                    lowerSet.add(ch)
                }
                else {
                    upperSet.add(ch)
                }
                if(containsElement(lowerSet,upperSet)
                    && containsElement(upperSet, lowerSet)) {
                    return temp.length
                }
            }
        }

    }
    return -1
}
fun containsElement(first: HashSet<Char>, second: HashSet<Char>): Boolean {
    var lower1 = HashSet<Char>()
    var lower2 = HashSet<Char>()
    first.forEach { lower1.add(Character.toLowerCase(it)) }
    second.forEach { lower2.add(Character.toLowerCase(it)) }
    return lower1.containsAll(lower2)
}