package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations() : List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.item1),
            Affirmation(R.string.affirmation2, R.drawable.item2),
            Affirmation(R.string.affirmation3, R.drawable.item3),
            Affirmation(R.string.affirmation4, R.drawable.item4),
            Affirmation(R.string.affirmation5, R.drawable.item5),
            Affirmation(R.string.affirmation6, R.drawable.item6),
            Affirmation(R.string.affirmation7, R.drawable.item7),
            Affirmation(R.string.affirmation8, R.drawable.item8),
            Affirmation(R.string.affirmation9, R.drawable.item9),
            Affirmation(R.string.affirmation10, R.drawable.item10)
        )
    }
}