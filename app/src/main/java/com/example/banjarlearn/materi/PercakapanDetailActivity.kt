package com.example.banjarlearn.materi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class PercakapanDetailActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var tvJudul: TextView
    private lateinit var tvIsi: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_percakapan_detail)

        btnBack = findViewById(R.id.btnBack)
        tvJudul = findViewById(R.id.tvJudul)
        tvIsi = findViewById(R.id.tvIsi)

        val judul = intent.getStringExtra("judul") ?: "Percakapan"
        val isi = intent.getStringExtra("isi") ?: "-"

        tvJudul.text = judul
        tvIsi.text = isi

        btnBack.setOnClickListener {
            finish()
        }
    }
}