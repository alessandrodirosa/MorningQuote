package com.alessandrodirosa.android.morningquote.data

import com.alessandrodirosa.android.morningquote.R
import com.alessandrodirosa.android.morningquote.model.Affermazione

class DataSource {

    fun caricaAffermazioni(): List<Affermazione>{
        return listOf<Affermazione>(
            Affermazione(R.string.affermazione_1,R.drawable.image1),
            Affermazione(R.string.affermazione_2,R.drawable.image2),
            Affermazione(R.string.affermazione_3,R.drawable.image3),
            Affermazione(R.string.affermazione_4,R.drawable.image4),
            Affermazione(R.string.affermazione_5,R.drawable.image5),
            Affermazione(R.string.affermazione_6,R.drawable.image6),
            Affermazione(R.string.affermazione_7,R.drawable.image7),
            Affermazione(R.string.affermazione_8,R.drawable.image8),
            Affermazione(R.string.affermazione_9,R.drawable.image9),
            Affermazione(R.string.affermazione_10,R.drawable.image10)
        )
    }
}