fun main() {
    solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5))
}

    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        val personalityTypeList = ArrayList<Pair<PersonalityType, PersonalityType>>().apply {
            add(Pair(PersonalityType("R", 0), PersonalityType("T", 0)))
            add(Pair(PersonalityType("C", 0), PersonalityType("F", 0)))
            add(Pair(PersonalityType("J", 0), PersonalityType("M", 0)))
            add(Pair(PersonalityType("A", 0), PersonalityType("N", 0)))
        }


        choices.forEachIndexed { index, item ->
            val scorePosition = getScore(item, survey, index)
            personalityTypeList.forEach {
                if(it.first.type == scorePosition.type) {
                    it.first.grade += scorePosition.score
                } else if(it.second.type == scorePosition.type) {
                    it.second.grade += scorePosition.score
                }
            }

        }
        personalityTypeList.forEach {
            answer += if (it.first.grade > it.second.grade) {
                it.first.type
            } else if (it.first.grade < it.second.grade) {
                it.second.type
            } else {
                it.first.type
            }
        }
        print(answer)
        return answer
    }

    private fun getScore(choice: Int, survey: Array<String>, index: Int): ScorePosition = when (choice) {
        1 -> ScorePosition(survey[index][0].toString(), 3)
        2 -> ScorePosition(survey[index][0].toString(), 2)
        3 -> ScorePosition(survey[index][0].toString(), 1)
        5 -> ScorePosition(survey[index][1].toString(), 1)
        6 -> ScorePosition(survey[index][1].toString(), 2)
        7 -> ScorePosition(survey[index][1].toString(), 3)
        else -> ScorePosition("", 0)
    }

    data class PersonalityType(val type: String, var grade: Int)
    data class ScorePosition(val type: String, val score: Int)
