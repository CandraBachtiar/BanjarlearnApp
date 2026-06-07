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

                """
Pada zaman dahulu, Lambung Mangkurat melakukan pertapaan untuk mencari pemimpin bagi Kerajaan Negara Dipa.

Dari tengah buih sungai muncullah seorang putri cantik yang kemudian dikenal sebagai Putri Junjung Buih.

Putri tersebut dipercaya membawa kejayaan bagi kerajaan dan kemudian menikah dengan Pangeran Suryanata.

Dari keturunan mereka lahirlah para raja Banjar.

Cerita ini mengajarkan pentingnya kebijaksanaan, kepemimpinan, dan penghormatan terhadap budaya leluhur.
                """.trimIndent(),

                R.drawable.putri_junjung_buih
            )
        }

        btnCerita2.setOnClickListener {

            bukaDetail(
                "Datu Sanggul",

                """
Datu Sanggul merupakan ulama terkenal di Kalimantan Selatan.

Beliau dikenal sebagai sosok yang sederhana, bijaksana, dan memiliki pengetahuan agama yang luas.

Masyarakat Banjar menghormatinya karena keteladanan serta dedikasinya dalam menyebarkan ajaran Islam.

Kisah beliau mengajarkan pentingnya ilmu, kesabaran, dan akhlak yang baik.
                """.trimIndent(),

                R.drawable.datu_sanggul
            )
        }

        btnCerita3.setOnClickListener {

            bukaDetail(
                "Legenda Sungai Barito",

                """
Sungai Barito merupakan salah satu sungai terbesar yang menjadi bagian penting kehidupan masyarakat Banjar.

Sejak dahulu sungai ini digunakan sebagai jalur perdagangan, transportasi, dan sumber kehidupan.

Budaya sungai melahirkan berbagai tradisi khas seperti pasar terapung dan kehidupan masyarakat bantaran sungai.

Cerita ini menunjukkan eratnya hubungan masyarakat Banjar dengan alam dan lingkungan sekitarnya.
                """.trimIndent(),

                R.drawable.sungai_barito
            )
        }
    }

    private fun bukaDetail(
        judul: String,
        isi: String,
        gambar: Int
    ) {

        val intent = Intent(this, CeritaRakyatDetail::class.java)

        intent.putExtra("judul", judul)
        intent.putExtra("isi", isi)
        intent.putExtra("gambar", gambar)

        startActivity(intent)
    }
}