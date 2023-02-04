package projects.kotlin.quizzapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia", "Armenia", "Austria",
            2
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "France", "China", "Belgium", "Portugal",
            3
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "South Africa", "North Korea", "USA",
            1
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "Germany", "New Zealand", "India",
            1
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Fiji", "Armenia", "Austria",
            2
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Denmark", "Germany", "New Zealand", "India",
            2
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Denmark", "Germany", "New Zealand", "India",
            4
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Australia", "Armenia", "Austria",
            1
        )
        questionsList.add(que9)

        // 10
        val que10 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Denmark", "Germany", "New Zealand", "India",
            3
        )
        questionsList.add(que10)

        return questionsList
    }
}