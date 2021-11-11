fun main() {
    var arr = arrayOf(3,5,7)
    var hash = HashMap<String,Int>();
    hash["asdf"] = 5;
    hash["wefd"] = 7;
    if(hash.containsKey("asdf")) {
        hash["asdf"] = hash["asdf"]!! + 3
    }

    print(hash.toString())
    println(arr.distinct())
}