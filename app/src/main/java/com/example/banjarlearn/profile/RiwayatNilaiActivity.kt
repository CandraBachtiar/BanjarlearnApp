package com.example.banjarlearn.profile

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class RiwayatNilaiActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var tvNilaiTerakhir: TextView
    private lateinit var tvTotalKosakata: TextView
    private lateinit var tvTotalKuis: TextView
    private lateinit var tvLevel: TextView
    private lateinit var tvProgress: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_nilai)

        btnBack = findViewById(R.id.btnBack)
        tvNilaiTerakhir = findViewById(R.id.tvNilaiTerakhir)
        tvTotalKosakata = findViewById(R.id.tvTotalKosakata)
        tvTotalKuis = findViewById(R.id.tvTotalKuis)
        tvLevel = findViewById(R.id.tvLevel)
        tvProgress = findViewById(R.id.tvProgress)

        val prefs = getSharedPreferences("progress_kuis", MODE_PRIVATE)

        val totalKosakata = prefs.getInt("totalKosakata", 0)
        val totalKuis = prefs.getInt("totalKuis", 0)
        val nilaiTerakhir = prefs.getInt("nilaiTerakhir", 0)

        val level = when {
            totalKosakata <= 25 -> "Pemula"
            totalKosakata <= 50 -> "Menengah"
            else -> "Master"
        }

        tvNilaiTerakhir.text = nilaiTerakhir.toString()
        tvTotalKosakata.text = "$totalKosakata / 100"
        tvTotalKuis.text = totalKuis.toString()
        tvLevel.text = level
        tvProgress.text = "$totalKosakata%"

        btnBack.setOnClickListener {
            finish()
        }
    }
}