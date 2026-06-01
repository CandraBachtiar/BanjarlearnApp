package com.example.banjarlearn.materi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class CeritaRakyatActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var btnCerita1: Button
    private lateinit var btnCerita2: Button
    private lateinit var btnCerita3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_rakyat)

        btnBack = findViewById(R.id.btnBack)
        btnCerita1 = findViewById(R.id.btnCerita1)
        btnCerita2 = findViewById(R.id.btnCerita2)
        btnCerita3 = findViewById(R.id.btnCerita3)

        btnBack.setOnClickListener {
            finish()
        }

        btnCerita1.setOnClickListener {
            bukaDetail(
                "Putri Junjung Buih",
                "Putri Junjung Buih adalah salah satu cerita rakyat yang dikenal dalam budaya Banjar. Kisah ini menceritakan tentang sosok putri yang memiliki kedudukan penting dalam legenda masyarakat Banjar. Cerita ini mengandung nilai tentang asal-usul, kepemimpinan, dan penghormatan terhadap tokoh perempuan dalam tradisi Banjar."
            )
        }

        btnCerita2.setOnClickListener {
            bukaDetail(
                "Datu Sanggul",
                "Datu Sanggul dikenal sebagai salah satu tokoh dalam cerita masyarakat Banjar yang memiliki nilai religius dan keteladanan. Kisahnya sering dikaitkan dengan kebijaksanaan, ilmu agama, serta kehidupan masyarakat yang menjunjung tinggi akhlak dan kebaikan."
            )
        }

        btnCerita3.setOnClickListener {
            bukaDetail(
                "Legenda Sungai Barito",
                "Sungai Barito memiliki peran penting dalam kehidupan masyarakat Kalimantan Selatan. Dalam cerita rakyat, sungai sering digambarkan sebagai sumber kehidupan, jalur perdagangan, dan bagian dari identitas masyarakat Banjar yang dekat dengan budaya sungai."
            )
        }
    }

    private fun bukaDetail(judul: String, isi: String) {
        val intent = Intent(this, CeritaDetailActivity::class.java)
        intent.putExtra("judul", judul)
        intent.putExtra("isi", isi)
        startActivity(intent)
    }
}