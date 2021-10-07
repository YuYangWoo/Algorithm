fun main() {
    solutionz("one4seveneight")
}
fun solutionz(s: String){


     var a=  s
        .replace("one", "1")
        .replace("two", "2")
        .replace("three", "3")
        .replace("four", "4")
        .replace("five", "5")
        .replace("six", "6")
        .replace("seven", "7")
        .replace("eight", "8")
        .replace("nine", "9")
        .replace("zero", "0")
        .toInt()
    print(a)
}

//fun solutionz(s: String): Int {
//    var sb = StringBuilder()
//    var answer = StringBuilder()
//    for(i in s.indices) {
//        sb.append(i)
//        if(sb.toString() == "zero") {
//            answer.append(0)
//            sb.clear()
//        }
//        else if(sb.toString() == "one") {
//            answer.append(1)
//            sb.clear()
//        }
//        else if(sb.toString() == "two") {
//           answer.append(2)
//           sb.clear()
//        }
//        else if(sb.toString() == "three") {
//           answer.append(3)
//           sb.clear()
//        }
//        else if(sb.toString() == "four") {
//           answer.append(4)
//           sb.clear()
//        }
//        else if(sb.toString() == "five") {
//           answer.append(5)
//           sb.clear()
//        }
//        else if(sb.toString() == "six") {
//            answer.append(6)
//           sb.clear()
//        }
//        else if(sb.toString() == "seven") {
//            answer.append(7)
//            sb.clear()
//        }
//        else if(sb.toString() == "eight") {
//            answer.append(8)
//            sb.clear()
//        }
//        else if(sb.toString() == "nine") {
//            answer.append(9)
//            sb.clear()
//        }
//        else if(sb.toString() in "0".."9") {
//            answer.append(sb.toString())
//
//        }
//    }
//    print(answer)
//    return answer.toString().toInt()
//}