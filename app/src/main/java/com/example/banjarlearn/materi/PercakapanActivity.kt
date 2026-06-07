package com.example.banjarlearn.materi

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class PercakapanActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var cardPerkenalan: LinearLayout
    private lateinit var cardMakanan: LinearLayout
    private lateinit var cardSekolah: LinearLayout
    private lateinit var cardKabar: LinearLayout
    private lateinit var cardJalanJalan: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_percakapan)

        btnBack = findViewById(R.id.btnBack)
        cardPerkenalan = findViewById(R.id.cardPerkenalan)
        cardMakanan = findViewById(R.id.cardMakanan)
        cardSekolah = findViewById(R.id.cardSekolah)
        cardKabar = findViewById(R.id.cardKabar)
        cardJalanJalan = findViewById(R.id.cardJalanJalan)

        btnBack.setOnClickListener {
            finish()
        }

        cardPerkenalan.setOnClickListener {
            bukaDetail("Perkenalan", getPercakapanPerkenalan())
        }

        cardMakanan.setOnClickListener {
            bukaDetail("Membeli Makanan", getPercakapanMakanan())
        }

        cardSekolah.setOnClickListener {
            bukaDetail("Pergi ke Sekolah", getPercakapanSekolah())
        }

        cardKabar.setOnClickListener {
            bukaDetail("Menanyakan Kabar", getPercakapanKabar())
        }

        cardJalanJalan.setOnClickListener {
            bukaDetail("Mengajak Jalan-jalan", getPercakapanJalanJalan())
        }
    }

    private fun bukaDetail(judul: String, isi: String) {
        val intent = Intent(this, PercakapanDetailActivity::class.java)
        intent.putExtra("judul", judul)
        intent.putExtra("isi", isi)
        startActivity(intent)
    }

    private fun getPercakapanPerkenalan(): String {
        return """
A: Assalamualaikum, pian siapa ngaran pian?
B: Waalaikumsalam, ulun ngaran Rina. Pian siapa?
A: Ulun ngaran Budi. Pian asal mana?
B: Ulun asal Banjarmasin. Kalau pian?
A: Ulun asal Martapura. Sanang bakawan lawan pian.
B: Ulun jua sanang bakawan lawan pian.
        """.trimIndent()
    }

    private fun getPercakapanMakanan(): String {
        return """
A: Paman, berapa harga wadai ini?
B: Nang itu lima ribu haja satu bungkus.
A: Ulun handak nukar dua bungkus, Paman.
B: Inggih, jadi sapuluh ribu lah.
A: Ini duitnya, Paman.
B: Inggih, terima kasih. Mudahan nyaman dimakan.
        """.trimIndent()
    }

    private fun getPercakapanSekolah(): String {
        return """
A: Pian sudah siap ka sakulah?
B: Sudah, tinggal memakai sepatu haja lagi.
A: Jangan lambat, kena guru sudah masuk kelas.
B: Inggih, ulun lakasi. Buku sudah ulun masukkan ka tas.
A: Ayo kita tulak sama-sama.
B: Ayo, supaya kada terlambat.
        """.trimIndent()
    }

    private fun getPercakapanKabar(): String {
        return """
A: Apa habar pian hari ini?
B: Alhamdulillah baik haja. Pian kayapa?
A: Ulun jua baik, cuma agak uyuh sedikit.
B: Uyuh kenapa? Banyak tugas kah?
A: Inggih, tugas kuliah banyak banar.
B: Sabar haja, dicicil sedikit-sedikit supaya kada berat.
        """.trimIndent()
    }

    private fun getPercakapanJalanJalan(): String {
        return """
A: Pian handak tulak jalan-jalan sore ini kah?
B: Handak pang, tulak ka mana?
A: Kita tulak ka siring haja, sambil mencari angin.
B: Boleh jua, jam berapa tulaknya?
A: Habis asar kita tulak lah.
B: Inggih, kena ulun siap-siap dulu.
        """.trimIndent()
    }
}