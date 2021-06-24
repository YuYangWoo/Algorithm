fun main() {
    solut(intArrayOf(3,5,7,9,1))
}
fun solut(arr: IntArray) {
    arr.sort()
    var answer = ArrayList<Int>()
    var cmp = -1
    for(i in arr.indices) {
        var cnt = 1
        for(j in i+1 until arr.size) {
            if(cmp == arr[i]) {
                break
            }
            if(arr[i] == arr[j]) {
                cnt++
            }
            else {
                cmp = arr[j-1]

                if(cnt != 1) {
                    answer.add(cnt)
                }
                break
            }
            if(j == arr.size-1) {
                if(cnt!=1) {
                    cmp = arr[j-1]

                    answer.add(cnt)
                }
            }
        }
    }
    if(answer.isEmpty()) {
        answer.add(-1)
    }
    print(answer)
}