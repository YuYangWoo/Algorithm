var list = Array<Int>(10) {0}
var nn = ""
var cnt = 0
fun main() {
    nn = readLine()!!.toString()
    increase()
        for(i in nn.indices) {
            when {
                nn[i]-'0' == 6 -> {
                    when {
                        list[6] != 0 -> {
                            list[6]--
                        }
                        list[9] != 0 -> {
                            list[9]--
                        }
                        else -> {
                            increase()
                            if(list[6] !=0) {
                                list[6]--
                            }
                            else if(list[9] != 0) {
                                list[9]--
                            }
                            else {
                                list[nn[i]-'0']--
                            }
                        }
                    }
                }
                nn[i]-'0' == 9 -> {
                    when {
                        list[6] != 0 -> {
                            list[6]--
                        }
                        list[9] != 0 -> {
                            list[9]--
                        }
                        else -> {
                            increase()
                            if(list[6] !=0) {
                                list[6]--
                            }
                            else if(list[9] != 0) {
                                list[9]--
                            }
                            else {
                                list[nn[i]-'0']--
                            }
                        }
                    }
                }
                else -> {
                    if(list[nn[i]-'0'] != 0) {
                        list[nn[i]-'0']--
                    }
                    else {
                        increase()
                            list[nn[i]-'0']--
                    }
                }
            }
        }
    print(cnt)
    }

fun increase() {
    for(i in 0 until 10) {
        list[i]++
    }
    cnt++
}