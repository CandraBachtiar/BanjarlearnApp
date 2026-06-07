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
    private lateinit var btnKesenian4: Button
    private lateinit var btnKesenian5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kesenian)

        btnBack = findViewById(R.id.btnBack)
        btnKesenian1 = findViewById(R.id.btnKesenian1)
        btnKesenian2 = findViewById(R.id.btnKesenian2)
        btnKesenian3 = findViewById(R.id.btnKesenian3)
        btnKesenian4 = findViewById(R.id.btnKesenian4)
        btnKesenian5 = findViewById(R.id.btnKesenian5)

        btnBack.setOnClickListener {
            finish()
        }

        btnKesenian1.setOnClickListener {
            bukaDetail(
                "Tari Baksa Kembang",
                """
Tari Baksa Kembang adalah tarian tradisional Banjar yang biasanya digunakan untuk menyambut tamu kehormatan.

Tarian ini dibawakan oleh penari perempuan dengan gerakan yang lembut, anggun, dan penuh makna. Penari membawa rangkaian bunga sebagai simbol penghormatan, keramahan, dan rasa bahagia masyarakat Banjar kepada tamu yang datang.

Kesenian ini menjadi salah satu identitas budaya Banjar yang masih sering ditampilkan dalam acara adat, penyambutan tamu, dan kegiatan kebudayaan.
                """.trimIndent(),
                R.drawable.tari_baksa_kembang
            )
        }

        btnKesenian2.setOnClickListener {
            bukaDetail(
                "Madihin",
                """
Madihin merupakan seni bertutur khas Banjar yang disampaikan melalui syair, pantun, humor, dan nasihat.

Biasanya Madihin dibawakan oleh seorang pamadihinan dengan iringan alat musik tarbang. Isi Madihin dapat berupa pesan moral, kritik sosial, hiburan, hingga cerita kehidupan sehari-hari masyarakat Banjar.

Kesenian ini sangat menarik karena menggabungkan kemampuan berbicara, berpantun, bernyanyi, dan menghibur penonton secara spontan.
                """.trimIndent(),
                R.drawable.madihin
            )
        }

        btnKesenian3.setOnClickListener {
            bukaDetail(
                "Mamanda",
                """
Mamanda adalah seni teater tradisional Banjar yang mengangkat kisah kerajaan, kehidupan masyarakat, dan nilai-nilai budaya.

Pertunjukan Mamanda biasanya menampilkan tokoh raja, perdana menteri, putri, pengawal, dan rakyat. Ceritanya sering berisi pesan tentang keadilan, kebijaksanaan, dan kehidupan sosial.

Mamanda menjadi salah satu bentuk kesenian panggung masyarakat Banjar yang diwariskan secara turun-temurun.
                """.trimIndent(),
                R.drawable.mamanda
            )
        }

        btnKesenian4.setOnClickListener {
            bukaDetail(
                "Musik Panting",
                """
Musik Panting adalah kesenian musik tradisional Banjar yang menggunakan alat musik petik bernama panting.

Musik ini biasanya dimainkan bersama alat musik lain seperti babun, biola, gong, dan tamborin. Lagu yang dibawakan dalam musik panting umumnya menggunakan bahasa Banjar dan menceritakan kehidupan masyarakat.

Musik Panting sering ditampilkan dalam acara adat, hiburan rakyat, dan kegiatan budaya Banjar.
                """.trimIndent(),
                R.drawable.musik_panting
            )
        }

        btnKesenian5.setOnClickListener {
            bukaDetail(
                "Sinoman Hadrah",
                """
Sinoman Hadrah adalah kesenian Banjar yang bernuansa Islami dan biasanya ditampilkan dalam acara keagamaan maupun penyambutan.

Pertunjukan ini memadukan lantunan syair, tabuhan rebana, dan gerakan yang kompak. Sinoman Hadrah sering digunakan untuk memeriahkan acara seperti pernikahan, maulid, dan kegiatan masyarakat.

Kesenian ini menunjukkan perpaduan antara budaya Banjar, nilai kebersamaan, dan tradisi keagamaan.
                """.trimIndent(),
                R.drawable.sinoman_hadrah
            )
        }
    }

    private fun bukaDetail(judul: String, isi: String, gambar: Int) {
        val intent = Intent(this, KesenianDetailActivity::class.java)
        intent.putExtra("judul", judul)
        intent.putExtra("isi", isi)
        intent.putExtra("gambar", gambar)
        startActivity(intent)
    }
}