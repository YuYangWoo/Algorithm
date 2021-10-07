fun main() {
    solution(arrayOf("muzi", "frodo", "apeach", "neo"), arrayOf("muzi frodo","muzi frodo","muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"), 2)
}
fun solution(id_list: Array<String>, report: Array<String>, k: Int): ArrayList<Int>  = with(System.`in`.bufferedReader()){
    var answer = ArrayList<Int>()
    var hashMap = HashMap<String, Int>()
    var reportList = report.distinct().sorted() // 중복 방지
    for(i in reportList.indices) { // 신고당한 사람의 회수를 hashmap으로 저장
        if(hashMap.containsKey(reportList[i].split(" ")[1])) {
            hashMap[reportList[i].split(" ")[1]] = hashMap[reportList[i].split(" ")[1]]!! + 1
        }
        else {
            hashMap.put(reportList[i].split(" ")[1], 1)
        }
    }
    var stopList = ArrayList<String>()
    for((key,value) in hashMap) { // k보다 크면 stopList에 담아서 이메일을 보내는 사람들 추가
        if(value >= k) {
            stopList.add(key)
        }
    }
    for(i in id_list.indices) { // 순서대로 해야하므로 id for문 돌려서
        var cnt = 0
        for (j in reportList.indices) { // 리스트 for
            if(id_list[i] == reportList[j].split(" ")[0]) { // id와 신고한 사람의 이름이 같고
                if(stopList.contains(reportList[j].split(" ")[1])) { // stopList의 정지 리스트가 포함되었다면 cnt ++
                    cnt++
                }
            }
        }
        answer.add(cnt)
    }
    answer.forEach {
        print(it)
    }
    return answer
}