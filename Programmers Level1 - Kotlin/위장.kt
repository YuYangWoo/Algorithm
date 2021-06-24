fun main() {

solutions(arrayOf(arrayOf("yellowhat", "headgear"),arrayOf("bluesunglasses", "eyewear"),arrayOf("green_turban", "headgear")))
}
fun solutions(clothes: Array<Array<String>>) =
    clothes.groupBy { it[1] }.values.fold(1) { acc, list -> acc * (list.size + 1) } - 1






