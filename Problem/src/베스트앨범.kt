
import java.util.ArrayList


fun main() {
    solutionzxc(arrayListOf("classic", "pop", "classic", "classic", "pop"), arrayListOf(500,600,150,800,2500))
}
fun solutionzxc(genres: ArrayList<String>, plays: ArrayList<Int>): ArrayList<Int> {
    var answer = ArrayList<Int>()
    var hash = HashMap<Int, Int>()
    var genreHash = HashMap<String, Int>()
    var genreSortedMap = mutableMapOf<String,Int>()
    for(i in genres.indices) {
        if(genreHash.containsKey(genres[i])) {
            genreHash[genres[i]] = genreHash[genres[i]]!! + plays[i]
        }
        else {
            genreHash[genres[i]] = plays[i]
        }
    }
    genreSortedMap = genreHash.toList().sortedWith(compareByDescending { (it.second) }).toMap() as MutableMap<String, Int>
    for(i in plays.indices) {
        hash[i] = plays[i]
    }
    var playSortedHash = hash.toList().sortedWith(compareByDescending { (it.second) }).toMap() as MutableMap<Int, Int>
    genreSortedMap.forEach { first ->
        var cnt = 2
      playSortedHash.forEach { second ->
          if(cnt!=0) {
              if (first.key == genres[second.key]) {
                  answer.add(second.key)
                  cnt--
              }
          }
      }
  }
    return answer
}