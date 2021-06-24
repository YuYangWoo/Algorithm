fun main() {
    solution("...!@BaT#*..y.abcdefghijklm")
}

fun solution(new_id: String): String {
    var answer: String = ""
    answer = step1(new_id)
    answer = step2(answer)
    answer = step3(answer)
    answer = step4(answer)
    answer = step5(answer)
    answer = step6(answer)
    answer = step7(answer)
    println(answer)
    return answer
}

// 대문자를 소문자로
fun step1(new_id: String): String {
    return new_id.toLowerCase()
}

// 'a'..'z''와 같은 표현은 알아 둘 것
fun step2(new_id: String): String {
    var sb = StringBuilder()
    new_id.forEach {
        if ((it in 'a'..'z') || (it in '0'..'9') || it == '-' || it == '_' || it == '.') {
            sb.append(it)
        }
    }
    return sb.toString()
}

// contains로 포함하면 .으로 바꾸기
fun step3(new_id: String): String {
    var answer = new_id
    while (answer.contains("..")) {
        answer = answer.replace("..", ".")
    }
    return answer
}

// indexOfFirst는 람다식이 맞으면 index를 아니면 -1을 반환한다.
fun step4(new_id: String): String {
    var answer = new_id
    var result = StringBuilder()
    var first = answer.indexOfFirst { it == '.' }
    if (first == 0) {
        answer = answer.replaceFirst(".", "")
    }
    var last = answer.indexOfLast { it == '.' }
    if(last != -1 && last == answer.length-1) {
        answer = answer.substring(0, last)
    }

    return answer
}

// 비어있으면 a넣기
fun step5(new_id: String): String {
    var result = new_id
    if (result == "") {
        result += 'a'
    }
    return result
}

// substring은 a~ b-1까지 부분 분할해준다.
fun step6(new_id: String): String {
    var answer = new_id
    if (answer.length >= 16) {
        answer = answer.substring(0, 15)
    }
    if (answer[answer.length - 1] == '.') {
        answer = answer.substring(0, answer.length - 1)
    }
    return answer
}

fun step7(new_id: String): String {
    var answer = new_id
    if (answer.length <= 2) {
        var add = answer[answer.length - 1]
        while (answer.length != 3) {
            answer += add
        }
    }
    return answer
}