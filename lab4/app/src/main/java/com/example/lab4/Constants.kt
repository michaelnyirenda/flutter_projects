package com.example.lab4

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "The Cartoon Network first launched in?",
            R.drawable.question1,
            "1989", "1992",
            "1975", "1980", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which of these is NOT a Cartoon Network show?",
            R.drawable.question2,
            "The Sym-Bionic Titan", "My Life as a Teenage Robot",
            "The Life and Times of Juniper Lee", "The Secret Saturdays", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "In which fictional city does the series \"Chowder\" take place?",
            R.drawable.question3,
            "Chocolate Town", "Marzipan City",
            "Pasta Village", "Greasy Grove", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Which of these is the oldest original Cartoon Network show?",
            R.drawable.question4,
            "Samurai Jack", "Evil Con Carne",
            "Dexter's Laboratory", "The Moxy Show", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "\"The Tom and Jerry Show\" was the first cartoon to air on the Cartoon Network.",
            R.drawable.question5,
            "True", "False",
            "", "", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is the name of the character who creates the crime-fighting team in \"The Powerpuff Girls\"?",
            R.drawable.question6,
            "The Professor", "Professor Uranium",
            "Professor Utonium", "Professor Kryptonian", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Which Looney Tunes character is known for stuttering?",
            R.drawable.question7,
            "Daffy Duck", "Bugs Bunny",
            "Porky Pig", "Elmer Fudd", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "In The Amazing World of Gumball, Gumball's adopted goldfish brother is named what? ",
            R.drawable.question8,
            "Darwin", "Merlin",
            "Richard", "None of the Above", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What job do Mordecai and Rigby share on Cartoon Network's \"Regular Show\"?",
            R.drawable.question9,
            "Housekeepers", "Park Rangers",
            "Groundskeepers", "Janitors", 3
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What is the name of the summer camp in the series \"Camp Lazlo\"?",
            R.drawable.question10,
            "Camp Lazlo", "Camp Lumpus",
            "Camp Kidney", "Camp Wawanakwa", 3
        )

        questionsList.add(que10)


        return questionsList
    }
}