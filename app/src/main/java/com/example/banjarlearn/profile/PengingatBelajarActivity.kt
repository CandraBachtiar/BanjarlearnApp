package com.example.banjarlearn.profile

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class PengingatBelajarActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var switchPengingat: Switch
    private lateinit var tvStatusPengingat: TextView
    private lateinit var btnSimpan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengingat_belajar)

        btnBack = findViewById(R.id.btnBack)
        switchPengingat = findViewById(R.id.switchPengingat)
        tvStatusPengingat = findViewById(R.id.tvStatusPengingat)
        btnSimpan = findViewById(R.id.btnSimpan)

        val prefs = getSharedPreferences("pengingat_belajar", MODE_PRIVATE)
        val aktif = prefs.getBoolean("aktif", false)

        switchPengingat.isChecked = aktif
        updateStatus(aktif)

        switchPengingat.setOnCheckedChangeListener { _, isChecked ->
            updateStatus(isChecked)
        }

        btnSimpan.setOnClickListener {
            prefs.edit()
                .putBoolean("aktif", switchPengingat.isChecked)
                .apply()

            Toast.makeText(this, "Pengingat belajar berhasil disimpan", Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun updateStatus(aktif: Boolean) {
        tvStatusPengingat.text = if (aktif) {
            "Status: Aktif"
        } else {
            "Status: Tidak Aktif"
        }
    }
}