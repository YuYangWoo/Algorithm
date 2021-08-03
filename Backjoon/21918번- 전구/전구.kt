fun main() {
    var (N,M) = readLine()!!.split(" ").map { it.toInt() }
    var array = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    for(i in 0 until M) {
        var command =  readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        when {
            command[0] == 1 -> {
                    array[command[1]-1] = command[2]
            }
            command[0] == 2 -> {
                for(j in command[1]-1 until command[2]) {
                    if(array[j] == 0) {
                        array[j] = 1
                    }
                    else {
                        array[j] = 0
                    }
                }
            }
            command[0] == 3 -> {
                for(j in command[1]-1 until command[2]) {
                array[j] = 0
                }
            }
            command[0] == 4 -> {
                for(j in command[1]-1 until command[2]) {
                    array[j] = 1
                }
            }
        }
    }
    for(i in array.indices) {
        print("${array[i]} ")
    }
}