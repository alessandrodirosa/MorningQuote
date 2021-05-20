package com.alessandrodirosa.android.morningquote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.alessandrodirosa.android.morningquote.adapter.ItemAdapter
import com.alessandrodirosa.android.morningquote.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataSet = DataSource().caricaAffermazioni()
        val recyclerView = findViewById<RecyclerView>(R.id.affermazioni_recycler_view)
        recyclerView.adapter = ItemAdapter(this,myDataSet)
        recyclerView.setHasFixedSize(true)
    }
}