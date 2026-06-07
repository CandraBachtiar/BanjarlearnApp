package com.example.banjarlearn.profile

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R
import com.google.firebase.auth.FirebaseAuth

class DataPenggunaActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var tvNama: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvLevel: TextView
    private lateinit var tvKosakata: TextView
    private lateinit var tvKuis: TextView
    private lateinit var tvNilai: TextView

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_pengguna)

        auth = FirebaseAuth.getInstance()

        btnBack = findViewById(R.id.btnBack)
        tvNama = findViewById(R.id.tvNama)
        tvEmail = findViewById(R.id.tvEmail)
        tvLevel = findViewById(R.id.tvLevel)
        tvKosakata = findViewById(R.id.tvKosakata)
        tvKuis = findViewById(R.id.tvKuis)
        tvNilai = findViewById(R.id.tvNilai)

        val prefs = getSharedPreferences("progress_kuis", MODE_PRIVATE)

        val nama = intent.getStringExtra("nama") ?: "Pengguna"
        val email = auth.currentUser?.email ?: "-"
        val totalKosakata = prefs.getInt("totalKosakata", 0)
        val totalKuis = prefs.getInt("totalKuis", 0)
        val nilaiTerakhir = prefs.getInt("nilaiTerakhir", 0)

        val level = when {
            totalKosakata <= 25 -> "Pemula"
            totalKosakata <= 50 -> "Menengah"
            else -> "Master"
        }

        tvNama.text = nama
        tvEmail.text = email
        tvLevel.text = level
        tvKosakata.text = "$totalKosakata / 100"
        tvKuis.text = totalKuis.toString()
        tvNilai.text = nilaiTerakhir.toString()

        btnBack.setOnClickListener {
            finish()
        }
    }
}