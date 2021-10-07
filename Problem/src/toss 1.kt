import java.lang.StringBuilder

fun main() {
solution("20210701", arrayOf("김토스,19900605", "이토스,20020701"))
}
fun solution(date: String, requests: Array<String>): Int {
    var answer: Int = 0
    var birthday = ArrayList<Int>()
    var month = ArrayList<Int>()
    var standardBirthday = 0
    var standardMonth = 0

    for(i in requests.indices) {
        var sb = StringBuilder()
        var stb = StringBuilder()
        var request = requests[i].split(",")[1]

        for(j in 0..3) {
            sb.append(request[j])
            stb.append(date[j])
        }
        standardBirthday = stb.toString().toInt()
        birthday.add(sb.toString().toInt())
        sb.clear()
        stb.clear()
        for(z in 4..7) {

            sb.append(request[z])
            stb.append(date[z])
        }
        month.add(sb.toString().toInt())
        standardMonth = stb.toString().toInt()
    }
    for(i in birthday.indices) {
        if(standardBirthday - birthday[i]+1 >=20) {
            if(standardMonth - month[i] >= 0) {
                answer++
            }
        }
    }
    print(answer)
    return answer
}
