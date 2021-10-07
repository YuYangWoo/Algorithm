
fun main() {
//    while (true) {
//        var input = readLine()
//        if(input == "#") {
//            break
//        }
//        println(input!!.count { it in "aeiou" || it in "AEIOU" })
//    }

    var abc = "abc"
    for(i in abc.indices) {
        if(abc[i] in 'a'..'z') {
            print("빠끄")
        }
    }
}