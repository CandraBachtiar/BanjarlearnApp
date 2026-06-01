package com.example.banjarlearn.materi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class KesenianActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var btnKesenian1: Button
    private lateinit var btnKesenian2: Button
    private lateinit var btnKesenian3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kesenian)

        btnBack = findViewById(R.id.btnBack)
        btnKesenian1 = findViewById(R.id.btnKesenian1)
        btnKesenian2 = findViewById(R.id.btnKesenian2)
        btnKesenian3 = findViewById(R.id.btnKesenian3)

        btnBack.setOnClickListener {
            finish()
        }

        btnKesenian1.setOnClickListener {
            bukaDetail(
                "Tari Baksa Kembang",
                "Tari Baksa Kembang adalah tarian tradisional Banjar yang biasa digunakan untuk menyambut tamu kehormatan. Penari membawa rangkaian bunga sebagai simbol penghormatan dan keramahan masyarakat Banjar."
            )
        }

        btnKesenian2.setOnClickListener {
            bukaDetail(
                "Madihin",
                "Madihin merupakan seni bertutur khas Banjar yang disampaikan dengan syair, humor, dan iringan alat musik tradisional. Madihin sering digunakan sebagai media hiburan dan penyampaian pesan moral."
            )
        }

        btnKesenian3.setOnClickListener {
            bukaDetail(
                "Mamanda",
                "Mamanda adalah seni teater tradisional Banjar yang mengangkat kisah kerajaan, kehidupan masyarakat, dan nilai-nilai budaya yang diwariskan secara turun-temurun."
            )
        }
    }

    private fun bukaDetail(judul: String, isi: String) {
        val intent = Intent(this, KesenianDetailActivity::class.java)
        intent.putExtra("judul", judul)
        intent.putExtra("isi", isi)
        startActivity(intent)
    }
}