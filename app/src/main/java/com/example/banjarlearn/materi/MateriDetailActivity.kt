package com.example.banjarlearn.materi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class MateriDetailActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var tvJudulMateri: TextView
    private lateinit var tvIsiMateri: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_detail)

        btnBack = findViewById(R.id.btnBack)
        tvJudulMateri = findViewById(R.id.tvJudulMateri)
        tvIsiMateri = findViewById(R.id.tvIsiMateri)

        val judul = intent.getStringExtra("judul")
        val isi = intent.getStringExtra("isi")

        tvJudulMateri.text = judul
        tvIsiMateri.text = isi

        btnBack.setOnClickListener {
            finish()
        }
    }
}