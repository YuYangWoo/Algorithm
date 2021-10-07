fun main() {
    var string = ArrayList<String>()
    var answer = ArrayList<String>()
    string.add("a.x")
    string.add("t.x")
    string.add("a.x")
    string.add("t.x")
    string.add("b.x")
    var hashmap = HashMap<String, Int>()
    for(i in string.indices) {
        if(!hashmap.containsKey(string[i])) {
            hashmap[string[i]] = 1
        }
        else {
            var cnt = hashmap[string[i]]!! + 1
            hashmap[string[i]] = cnt
        }
    }
    hashmap.forEach {
        if(it.value != 1) {
            answer.add(it.key)
            answer.add(it.value.toString())
        }
    }
    print(answer)

}