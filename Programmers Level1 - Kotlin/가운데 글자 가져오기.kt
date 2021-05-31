fun main() {
    solutiond("abcde") // qwer
}
fun solutiond(s: String): String {
    var answer = ""
    if(s.length % 2 ==0) {
        answer += s[(s.length)/2-1]
        answer +=s[(s.length)/2]
    }
    else {
        answer = s[(s.length-1)/2].toString()
    }
    return answer
}