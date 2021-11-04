package com.example.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setiap_saat_dzikir)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvSetiapSaatDzikirActivity = findViewById<RecyclerView>(R.id.rv_dzikir_setiap_saat)
        rvSetiapSaatDzikirActivity.layoutManager = LinearLayoutManager(this)
        rvSetiapSaatDzikirActivity.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
    }
}