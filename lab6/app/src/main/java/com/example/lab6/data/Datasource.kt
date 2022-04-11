package com.example.lab6.data

import com.example.lab6.R
import com.example.lab6.model.Affirmation

class Datasource {
    fun loadAffirmations(i: Int): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}