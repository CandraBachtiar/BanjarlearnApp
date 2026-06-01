package com.example.banjarlearn.materi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class CeritaDetailActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var tvJudulCerita: TextView
    private lateinit var tvIsiCerita: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_detail)

        btnBack = findViewById(R.id.btnBack)
        tvJudulCerita = findViewById(R.id.tvJudulCerita)
        tvIsiCerita = findViewById(R.id.tvIsiCerita)

        val judul = intent.getStringExtra("judul") ?: "Cerita Rakyat"
        val isi = intent.getStringExtra("isi") ?: "Isi cerita belum tersedia."

        tvJudulCerita.text = judul
        tvIsiCerita.text = isi

        btnBack.setOnClickListener {
            finish()
        }
    }
}