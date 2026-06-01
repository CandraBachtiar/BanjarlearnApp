package com.example.banjarlearn.home

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import android.content.Intent
import com.example.banjarlearn.materi.KosakataActivity
import com.example.banjarlearn.materi.CeritaRakyatActivity
import com.example.banjarlearn.materi.KesenianActivity
import com.example.banjarlearn.materi.MateriDetailActivity

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    private lateinit var tvGreeting: TextView
    private lateinit var tvUserName: TextView
    private lateinit var tvUserInitial: TextView
    private lateinit var tvProfileName: TextView
    private lateinit var tvLevel: TextView

    private lateinit var pageHome: View
    private lateinit var pageMateri: View
    private lateinit var pageKuis: View
    private lateinit var pageProfil: View

    private lateinit var navHome: LinearLayout
    private lateinit var navMateri: LinearLayout
    private lateinit var navKuis: LinearLayout
    private lateinit var navProfil: LinearLayout
    private lateinit var cardKosakata: LinearLayout
    private lateinit var cardCerita: LinearLayout
    private lateinit var cardKesenian: LinearLayout
    private lateinit var cardPercakapan: LinearLayout
    private lateinit var cardKosakataDasar: LinearLayout
    private lateinit var cardMateriKosakata: LinearLayout
    private lateinit var cardTempatBersejarah: LinearLayout
    private lateinit var cardBudayaBanjar: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()
        cardKosakata = findViewById(R.id.cardKosakata)

        cardKosakata.setOnClickListener {
            startActivity(Intent(this, KosakataActivity::class.java))
        }
        cardCerita = findViewById(R.id.cardCerita)

        cardCerita.setOnClickListener {
            startActivity(Intent(this, CeritaRakyatActivity::class.java))
        }
        cardKesenian = findViewById(R.id.cardKesenian)
        cardKesenian.setOnClickListener {
            startActivity(Intent(this, KesenianActivity::class.java))
        }
        cardMateriKosakata = findViewById(R.id.cardMateriKosakata)
        cardTempatBersejarah = findViewById(R.id.cardTempatBersejarah)
        cardBudayaBanjar = findViewById(R.id.cardBudayaBanjar)



        tvGreeting = findViewById(R.id.tvGreeting)
        tvUserName = findViewById(R.id.tvUserName)
        tvUserInitial = findViewById(R.id.tvUserInitial)
        tvProfileName = findViewById(R.id.tvProfileName)
        tvLevel = findViewById(R.id.tvLevel)

        pageHome = findViewById(R.id.pageHome)
        pageMateri = findViewById(R.id.pageMateri)
        pageKuis = findViewById(R.id.pageKuis)
        pageProfil = findViewById(R.id.pageProfil)

        navHome = findViewById(R.id.navHome)
        navMateri = findViewById(R.id.navMateri)
        navKuis = findViewById(R.id.navKuis)
        navProfil = findViewById(R.id.navProfil)
        cardPercakapan = findViewById(R.id.cardPercakapan)
        cardKosakataDasar = findViewById(R.id.cardKosakataDasar)

        loadUserData()
        showPage("home")


        navHome.setOnClickListener { showPage("home") }
        navMateri.setOnClickListener { showPage("materi") }
        navKuis.setOnClickListener { showPage("kuis") }
        navProfil.setOnClickListener { showPage("profil") }
        cardPercakapan.setOnClickListener {
            bukaMateri(
                "Percakapan Sehari-hari",
                """
Apa habar?
= Apa kabar?

Ulun baik haja.
= Saya baik saja.

Pian handak kamana?
= Kamu mau ke mana?

Ulun handak tulak ka pasar.
= Saya mau pergi ke pasar.
        """.trimIndent()
            )
        }

        cardKosakataDasar.setOnClickListener {
            bukaMateri(
                "Kosakata Dasar Banjar",
                """
Ulun = Saya
Ikam = Kamu
Pian = Anda
Banyu = Air
Tulak = Pergi
Bulik = Pulang
Handak = Mau
Lauk = Ikan
        """.trimIndent()
            )
        }

        cardMateriKosakata.setOnClickListener {
            bukaMateri(
                "Kosakata Bahasa Banjar",
                """
Bahasa Banjar memiliki banyak kosakata unik yang digunakan dalam kehidupan sehari-hari.

Contoh:
Ulun = Saya
Ikam = Kamu
Banyu = Air
Handak = Mau
Tulak = Pergi
Bulik = Pulang
        """.trimIndent()
            )
        }

        cardTempatBersejarah.setOnClickListener {
            bukaMateri(
                "Tempat Bersejarah",
                """
Kalimantan Selatan memiliki berbagai tempat bersejarah yang menjadi bagian penting budaya Banjar.

Contohnya:
• Museum Wasaka
• Masjid Sultan Suriansyah
• Makam Sultan Suriansyah
• Candi Agung Amuntai

Tempat-tempat ini menjadi saksi perkembangan masyarakat Banjar dari masa ke masa.
        """.trimIndent()
            )
        }

        cardBudayaBanjar.setOnClickListener {
            bukaMateri(
                "Budaya Banjar",
                """
Budaya Banjar mencerminkan kehidupan masyarakat Kalimantan Selatan.

Contohnya:
• Tradisi Baayun Anak
• Pasar Terapung
• Madihin
• Mamanda
• Tari Baksa Kembang

Budaya Banjar diwariskan secara turun-temurun dan masih dilestarikan hingga sekarang.
        """.trimIndent()
            )
        }
        }
    private fun bukaMateri(judul: String, isi: String) {
        val intent = Intent(this, MateriDetailActivity::class.java)

        intent.putExtra("judul", judul)
        intent.putExtra("isi", isi)

        startActivity(intent)
    }

    private fun loadUserData() {
        val uid = auth.currentUser?.uid

        if (uid == null) {
            setDefaultUserData()
            return
        }

        db.collection("users")
            .document(uid)
            .get()
            .addOnSuccessListener { document ->
                val name = document.getString("name") ?: "Pengguna"
                val level = document.getString("Level") ?: "Pemula"

                tvGreeting.text = "Halo, selamat datang 👋"
                tvUserName.text = name
                tvProfileName.text = name
                tvLevel.text = "⭐ Level $level"

                tvUserInitial.text = name.firstOrNull()
                    ?.uppercaseChar()
                    ?.toString() ?: "P"
            }
            .addOnFailureListener {
                setDefaultUserData()
            }
    }

    private fun setDefaultUserData() {
        tvGreeting.text = "Halo, selamat datang 👋"
        tvUserName.text = "Pengguna"
        tvProfileName.text = "Pengguna"
        tvLevel.text = "⭐ Level Pemula"
        tvUserInitial.text = "P"
    }

    private fun showPage(page: String) {
        pageHome.visibility = View.GONE
        pageMateri.visibility = View.GONE
        pageKuis.visibility = View.GONE
        pageProfil.visibility = View.GONE

        navHome.alpha = 0.45f
        navMateri.alpha = 0.45f
        navKuis.alpha = 0.45f
        navProfil.alpha = 0.45f

        when (page) {
            "home" -> {
                pageHome.visibility = View.VISIBLE
                navHome.alpha = 1f
            }

            "materi" -> {
                pageMateri.visibility = View.VISIBLE
                navMateri.alpha = 1f
            }

            "kuis" -> {
                pageKuis.visibility = View.VISIBLE
                navKuis.alpha = 1f
            }

            "profil" -> {
                pageProfil.visibility = View.VISIBLE
                navProfil.alpha = 1f
            }
        }
    }
}