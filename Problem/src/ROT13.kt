fun main() {
    val input = readLine()!!
    //abcdefghijklmnopqrstuvwxyz
    var sb = StringBuilder()
    //65 91 98
    for(i in input.indices) {
        if(input[i] in 'a'..'z' ) {
            if((input[i]+13).toString().toInt()>122 )
            sb.append(input[i]+13)
        } else if(input[i] in 'A'..'Z'){

        }
        else if(input[i] == ' ') {
            sb.append(' ')
        }
    }
    sb.toString().forEach { print(it) }
}