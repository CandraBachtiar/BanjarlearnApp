package com.example.banjarlearn.materi

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class KosakataActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var containerKosakata: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kosakata)

        btnBack = findViewById(R.id.btnBack)
        containerKosakata = findViewById(R.id.containerKosakata)

        btnBack.setOnClickListener {
            finish()
        }

        tampilkanKosakataUser()
    }

    private fun tampilkanKosakataUser() {
        val prefs = getSharedPreferences("kosakata_user", MODE_PRIVATE)
        val dataKosakata = prefs.getStringSet("daftarKosakata", emptySet()) ?: emptySet()

        containerKosakata.removeAllViews()

        if (dataKosakata.isEmpty()) {
            val kosong = TextView(this)
            kosong.text = "Belum ada kosakata.\nKerjakan kuis pilihan ganda untuk membuka kosakata baru."
            kosong.textSize = 15f
            kosong.setPadding(20, 20, 20, 20)
            containerKosakata.addView(kosong)
            return
        }

        dataKosakata.sorted().forEach { item ->
            val bagian = item.split("|")
            val kata = bagian.getOrNull(0) ?: "-"
            val arti = bagian.getOrNull(1) ?: "-"

            val card = TextView(this)
            card.text = "$kata\n$arti"
            card.textSize = 16f
            card.setPadding(24, 20, 24, 20)

            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(0, 0, 0, 14)
            card.layoutParams = params

            card.setBackgroundResource(R.drawable.bg_white_round)

            containerKosakata.addView(card)
        }
    }
}