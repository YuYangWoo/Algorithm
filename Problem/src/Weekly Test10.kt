import java.lang.Math.*
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    solutionasdz(
        arrayOf(
        intArrayOf(2,-1,4),
            intArrayOf(-2,-1,4),
            intArrayOf(0,-1,1),
            intArrayOf(5,-8,-12),
            intArrayOf(5,8,12)
        )
    )
}

var sameArray = ArrayList<IntArray>()
fun solutionasdz(line: Array<IntArray>): ArrayList<String> {
    same_point(line)
    var arr = Array((maxY - minY + 1)) { Array((maxX - minX + 1)) { '.' } }
    for (i in sameArray.indices) { //sumArray[i][0]
        arr[(maxY - sameArray[i][1])][(sameArray[i][0] - minX)] = '*' // maxy-y x-minx
    }
    var arr1 = ArrayList<String>()
    for (i in arr.indices) {
        var sb = StringBuilder()
        for (j in arr[0].indices) {
            sb.append(arr[i][j])
        }
        arr1.add(sb.toString())
    }
    return arr1
}

var maxX = Integer.MIN_VALUE
var minX = Integer.MAX_VALUE
var maxY = Integer.MIN_VALUE
var minY = Integer.MAX_VALUE
fun same_point(line: Array<IntArray>) {

    for (i in line.indices) {
        if (i + 1 < line.size) {
            for (j in i + 1 until line.size) { // i와 j비교
                var bf = (line[i][1].toLong() * line[j][2].toLong())
                var ed = (line[i][2].toLong() * line[j][1].toLong())
                var ad = (line[i][0].toLong() * line[j][1].toLong())
                var bc = (line[i][1].toLong() * line[j][0].toLong())
                var ec = (line[i][2].toLong() * line[j][0].toLong())
                var af = (line[i][0].toLong() * line[j][2].toLong())
                var bottom = (ad - bc)
                if(bottom == 0L) continue

                if((bf-ed) % bottom !=0L || (ec-af) % bottom !=0L) continue
                var x = ((bf - ed)/bottom).toInt()
                var y = ((ec - af)/bottom).toInt()
                sameArray.add(intArrayOf(x,y))
                maxX = max(x, maxX)
                maxY = max(y, maxY)
                minX = min(x, minX)
                minY = min(y, minY)
            }
        }
    }

}
