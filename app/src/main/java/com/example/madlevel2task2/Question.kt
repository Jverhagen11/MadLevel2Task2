package com.example.madlevel2task2

import androidx.recyclerview.widget.ItemTouchHelper

data class Question(
    var questionText: String,
    var answer: Int
) {
    companion object {
        private const val correct = ItemTouchHelper.RIGHT
        private const val incorrect = ItemTouchHelper.LEFT

        val QUESTION_TEXT = arrayOf(
            "A 'val' and 'var' are the same",
          "Mobile android development grants 8 ECTS",
        "An emulator is an virtual android device"
        )

        val QUESTIONS_ANSWER = arrayOf(
            incorrect,
            correct,
            correct
        )

    }
}

