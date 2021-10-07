fun main() {
    var sb = StringBuilder()
    readLine()!!.split("-").forEach {
        sb.append(it[0])
    }
    print(sb)
}