package com.example.banjarlearn.materi

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class KesenianDetailActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var tvJudulKesenian: TextView
    private lateinit var tvIsiKesenian: TextView
    private lateinit var imgKesenian: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kesenian_detail)

        btnBack = findViewById(R.id.btnBack)
        tvJudulKesenian = findViewById(R.id.tvJudulKesenian)
        tvIsiKesenian = findViewById(R.id.tvIsiKesenian)
        imgKesenian = findViewById(R.id.imgKesenian)

        val judul = intent.getStringExtra("judul") ?: "Kesenian Banjar"
        val isi = intent.getStringExtra("isi") ?: "Isi kesenian belum tersedia."
        val gambar = intent.getIntExtra("gambar", R.drawable.tari_baksa_kembang)

        tvJudulKesenian.text = judul
        tvIsiKesenian.text = isi
        imgKesenian.setImageResource(gambar)

        btnBack.setOnClickListener {
            finish()
        }
    }
}