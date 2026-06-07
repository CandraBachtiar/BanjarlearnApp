package com.example.banjarlearn.kuis

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class HasilKuisActivity : AppCompatActivity() {

    private lateinit var tvNilai: TextView
    private lateinit var tvBenar: TextView
    private lateinit var tvKosakata: TextView
    private lateinit var tvLevel: TextView
    private lateinit var btnSelesai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_kuis)

        tvNilai = findViewById(R.id.tvNilai)
        tvBenar = findViewById(R.id.tvBenar)
        tvKosakata = findViewById(R.id.tvKosakata)
        tvLevel = findViewById(R.id.tvLevel)
        btnSelesai = findViewById(R.id.btnSelesai)

        val nilai = intent.getIntExtra("nilai", 0)
        val jumlahBenar = intent.getIntExtra("jumlahBenar", 0)
        val totalKosakata = intent.getIntExtra("totalKosakata", 0)
        val level = intent.getStringExtra("level") ?: "Pemula"

        tvNilai.text = "Nilai: $nilai"
        tvBenar.text = "Jawaban benar: $jumlahBenar dari 5"
        tvKosakata.text = "Kosakata dikuasai: $totalKosakata / 100"
        tvLevel.text = "Level saat ini: $level"

        btnSelesai.setOnClickListener {
            finish()
        }
    }
}