fun main() {
//    var map = mapOf<String, Int>("안드" to 1, "로이드" to 2) // 수정할 수 없는 UnMutable
//    var mutableMap = mutableMapOf<String, Int>("안드" to 1, "로이드" to 2) // 수정할 수 있는 Mutable
//    print(mutableMap)
//    mutableMap["앙드"] = 3
//    print(mutableMap)
//    var ma = HashMap<String,Int>()
//    ma.put("빠끄",1)
//    print(ma.count { it.value == 0 })
//    val items = HashMap<String, Int>()
//    items["A"] = 10
//    items["B"] = 20
//    items["C"] = 30
//    val filteredItems = items.filterKeys {it == "A" || it == "C"}
//    println("키가 A이고 C인 값을 찾기 $filteredItems")
//    val filteredItems2 = items.filterValues {it == 20}
//    println("Value가 20인 Map은 $filteredItems2")
//    val filteredItems3 = items.filter {it.key == "B" && it.value == 20}
//    println("Key가 B이고 Value가 20인 값 $filteredItems3")
    val items = HashMap<String, Int>()
    items["A"] = 10
    items["B"] = 20
    items["C"] = 30

// 1번 for Each
    items.forEach { key, value ->
        println("$key 이고$value 이다")
    }
    items.forEach { key, value ->
        if(key == "A") {
            println(value)
        }
    }
println("----2번----")
// 2번 for Loop
    for((key,value) in items) {
        println("$key 이고 $value 이다.")
    }

    for((key,value) in items) {
        if(key == "C") {
            println("$value")
        }
    }
}