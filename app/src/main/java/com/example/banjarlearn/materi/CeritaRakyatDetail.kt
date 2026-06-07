package com.example.banjarlearn.materi

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class CeritaRakyatDetail : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var tvJudulCerita: TextView
    private lateinit var tvIsiCerita: TextView
    private lateinit var imgCerita: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_detail)

        BacksoundManager.play(this, R.raw.backsound_cerita)

        btnBack = findViewById(R.id.btnBack)
        tvJudulCerita = findViewById(R.id.tvJudulCerita)
        tvIsiCerita = findViewById(R.id.tvIsiCerita)
        imgCerita = findViewById(R.id.imgCerita)

        val judul = intent.getStringExtra("judul") ?: "Cerita Rakyat Banjar"
        val isi = intent.getStringExtra("isi") ?: "Isi cerita belum tersedia."
        val gambar = intent.getIntExtra(
            "gambar",
            R.drawable.putri_junjung_buih
        )

        tvJudulCerita.text = judul
        tvIsiCerita.text = isi
        imgCerita.setImageResource(gambar)

        btnBack.setOnClickListener {
            finish()
        }
    }
}