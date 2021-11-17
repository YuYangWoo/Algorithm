fun main() {
    val input = readLine()!!
    //abcdefghijklmnopqrstuvwxyz
    var sb = StringBuilder()
    //65 91 98
   //abcdefghijklmnopqrstuvwxyz
    for(value in input) {
        when (value) {
            in 'a'..'m' -> {
                sb.append(value+13)
            }
            in 'n'..'z' -> {
                sb.append(value-13)
            }
            in 'A'..'M' -> {
                sb.append(value+13)
            }
            in 'N'..'Z' -> {
                sb.append(value-13)
            }
            else -> {
                sb.append(value)
            }
        }
    }
    sb.toString().forEach { print(it) }
}