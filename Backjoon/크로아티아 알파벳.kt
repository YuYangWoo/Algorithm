fun main() {
    var input = readLine()!!.toString()
    var cnt = 0
    var i = 0
    if (input.length == 1) {
        print("1")
        return
    } else {
        while (i < input.length) {
            if (input[i] == 'c') {
                if (i < input.length - 1) {
                    if (input[i + 1] == '=') {
                        i++
                    } else if (input[i + 1] == '-') {
                        i++
                    }
                }
            } else if (input[i] == 'd') {
                if (i < input.length - 1) {
                    if (input[i + 1] == 'z') {
                        if (i < input.length - 2) {
                            if (input[i + 2] == '=') {
                                i += 2
                            }
                        }
                    } else if (input[i + 1] == '-') {
                        i++
                    }
                }
            } else if (input[i] == 'l') {
                if (i < input.length - 1) {
                    if (input[i + 1] == 'j') {
                        i++
                    }
                }
            } else if (input[i] == 'n') {
                if (i < input.length - 1) {
                    if (input[i + 1] == 'j') {
                        i++
                    }
                }
            } else if (input[i] == 's') {
                if (i < input.length - 1) {
                    if (input[i + 1] == '=') {
                        i++
                    }
                }
            } else if (input[i] == 'z') {
                if (i < input.length - 1) {
                    if (input[i + 1] == '=') {
                        i++
                    }
                }
            }
            cnt++
            i++
        }
    }
    print(cnt)
}