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
import android.widget.Button
import com.example.banjarlearn.materi.KosakataActivity
import com.example.banjarlearn.materi.CeritaRakyatActivity
import com.example.banjarlearn.materi.KesenianActivity
import com.example.banjarlearn.materi.MateriDetailActivity
import com.example.banjarlearn.kuis.PilihanGandaActivity
import com.example.banjarlearn.auth.LoginActivity
import com.example.banjarlearn.profile.DataPenggunaActivity
import com.example.banjarlearn.profile.RiwayatNilaiActivity
import com.example.banjarlearn.profile.PengaturanActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.banjarlearn.materi.PercakapanActivity
import com.example.banjarlearn.profile.PengingatBelajarActivity

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    private lateinit var tvGreeting: TextView
    private lateinit var tvUserName: TextView
    private lateinit var tvProfileName: TextView
    private lateinit var tvLevel: TextView
    private lateinit var tvTotalKosakata: TextView
    private lateinit var tvTotalKuis: TextView
    private lateinit var tvNilaiTerakhir: TextView
    private lateinit var tvProgressPersen: TextView
    private lateinit var progressKosakata: android.widget.ProgressBar
    private lateinit var tvProfileInitial: TextView
    private lateinit var tvUserInitial: TextView



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
    private lateinit var cardPilihanGanda: LinearLayout
    private lateinit var cardLogout: LinearLayout
    private lateinit var cardDataPengguna: LinearLayout
    private lateinit var cardRiwayatNilai: LinearLayout
    private lateinit var cardPengaturan: LinearLayout
    private lateinit var cardPengingatBelajar: LinearLayout
    private lateinit var btnMulaiBelajar: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val prefsMode = getSharedPreferences("pengaturan_app", MODE_PRIVATE)
        val isDarkMode = prefsMode.getBoolean("darkMode", false)

        AppCompatDelegate.setDefaultNightMode(
            if (isDarkMode) {
                AppCompatDelegate.MODE_NIGHT_YES
            } else {
                AppCompatDelegate.MODE_NIGHT_NO
            }
        )

        setContentView(R.layout.activity_main)

        // Initialize Firebase
        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()

        // Initialize Views
        tvGreeting = findViewById(R.id.tvGreeting)
        tvUserName = findViewById(R.id.tvUserName)
        tvProfileInitial = findViewById(R.id.tvProfileInitial)
        tvUserInitial = findViewById(R.id.tvUserInitial)
        tvProfileName = findViewById(R.id.tvProfileName)
        tvLevel = findViewById(R.id.tvLevel)
        tvTotalKosakata = findViewById(R.id.tvTotalKosakata)
        tvTotalKuis = findViewById(R.id.tvTotalKuis)
        tvNilaiTerakhir = findViewById(R.id.tvNilaiTerakhir)
        tvProgressPersen = findViewById(R.id.tvProgressPersen)
        progressKosakata = findViewById(R.id.progressKosakata)

        pageHome = findViewById(R.id.pageHome)
        pageMateri = findViewById(R.id.pageMateri)
        pageKuis = findViewById(R.id.pageKuis)
        pageProfil = findViewById(R.id.pageProfil)

        navHome = findViewById(R.id.navHome)
        navMateri = findViewById(R.id.navMateri)
        navKuis = findViewById(R.id.navKuis)
        navProfil = findViewById(R.id.navProfil)

        cardKosakata = findViewById(R.id.cardKosakata)
        cardCerita = findViewById(R.id.cardCerita)
        cardKesenian = findViewById(R.id.cardKesenian)
        cardPercakapan = findViewById(R.id.cardPercakapan)
        cardKosakataDasar = findViewById(R.id.cardKosakataDasar)
        cardMateriKosakata = findViewById(R.id.cardMateriKosakata)
        cardTempatBersejarah = findViewById(R.id.cardTempatBersejarah)
        cardBudayaBanjar = findViewById(R.id.cardBudayaBanjar)
        cardPilihanGanda = findViewById(R.id.cardPilihanGanda)
        cardLogout = findViewById(R.id.cardLogout)
        cardDataPengguna = findViewById(R.id.cardDataPengguna)
        cardRiwayatNilai = findViewById(R.id.cardRiwayatNilai)
        cardPengaturan = findViewById(R.id.cardPengaturan)
        cardPengingatBelajar = findViewById(R.id.cardPengingatBelajar)
        btnMulaiBelajar = findViewById(R.id.btnMulaiBelajar)

        // Set Click Listeners
        cardKosakata.setOnClickListener {
            startActivity(Intent(this, KosakataActivity::class.java))
        }

        cardCerita.setOnClickListener {
            startActivity(Intent(this, CeritaRakyatActivity::class.java))
        }

        cardKesenian.setOnClickListener {
            startActivity(Intent(this, KesenianActivity::class.java))
        }

        cardMateriKosakata.setOnClickListener {
            startActivity(Intent(this, KosakataActivity::class.java))
        }

        cardBudayaBanjar.setOnClickListener {
            startActivity(Intent(this, KesenianActivity::class.java))
        }

        cardDataPengguna.setOnClickListener {
            val intent = Intent(this, DataPenggunaActivity::class.java)
            intent.putExtra("nama", tvProfileName.text.toString())
            startActivity(intent)
        }

        cardRiwayatNilai.setOnClickListener {
            startActivity(Intent(this, RiwayatNilaiActivity::class.java))
        }

        cardPengaturan.setOnClickListener {
            startActivity(Intent(this, PengaturanActivity::class.java))
        }

        cardPengingatBelajar.setOnClickListener {
            startActivity(Intent(this, PengingatBelajarActivity::class.java))
        }

        btnMulaiBelajar.setOnClickListener {
            startActivity(Intent(this, PilihanGandaActivity::class.java))
        }

        cardKosakataDasar.setOnClickListener {
            startActivity(Intent(this, KosakataActivity::class.java))
        }

        cardPilihanGanda.setOnClickListener {
            startActivity(Intent(this, PilihanGandaActivity::class.java))
        }

        navHome.setOnClickListener { showPage("home") }
        navMateri.setOnClickListener { showPage("materi") }
        navKuis.setOnClickListener { showPage("kuis") }
        navProfil.setOnClickListener { showPage("profil") }

        cardPercakapan.setOnClickListener {
            startActivity(Intent(this, PercakapanActivity::class.java))
        }

        cardTempatBersejarah.setOnClickListener {
            bukaMateri(
                "Tempat Bersejarah",
                """
Kalimantan Selatan memiliki berbagai tempat bersejarah yang menjadi bagian penting budaya Banjar.

1. Museum Wasaka

Museum Wasaka atau Museum Waja Sampai Kaputing merupakan museum perjuangan rakyat Kalimantan Selatan yang berada di Jalan Kampung Kenanga, Sungai Jingah, Banjarmasin Utara. Museum ini diresmikan pada 10 November 1991 dan menyimpan berbagai peninggalan perjuangan rakyat Banjar, seperti senjata, pakaian pejuang, foto, serta dokumen sejarah. Bangunan museum ini berbentuk rumah adat Banjar Bubungan Tinggi dan dulunya merupakan bekas rumah tradisional atau rumah milik saudagar, kemudian dijadikan museum untuk mengenang perjuangan masyarakat Kalimantan Selatan melawan penjajahan.

2. Masjid Sultan Suriansyah

Masjid Sultan Suriansyah terletak di kawasan Kuin, Banjarmasin Utara, tepatnya di tepi Sungai Kuin. Masjid ini diperkirakan dibangun sekitar tahun 1526 M pada masa pemerintahan Sultan Suriansyah, raja Banjar pertama yang memeluk agama Islam. Masjid ini menjadi salah satu masjid tertua di Kalimantan Selatan dan menjadi bukti awal perkembangan Islam di Kerajaan Banjar. Bangunannya masih mempertahankan arsitektur tradisional Banjar, terutama pada bentuk atap dan penggunaan kayu ulin.

3. Makam Sultan Suriansyah

Makam Sultan Suriansyah berada di Jalan Kuin Utara, Kecamatan Banjarmasin Utara, tidak jauh dari Masjid Sultan Suriansyah. Tempat ini merupakan kompleks pemakaman Sultan Suriansyah, yaitu pendiri Kesultanan Banjar dan raja pertama Banjar yang memeluk Islam. Untuk tahun pembangunan makamnya tidak diketahui secara pasti, tetapi makam ini berkaitan dengan masa Kesultanan Banjar pada abad ke-16. Tempat ini menjadi salah satu situs ziarah penting karena menjadi peninggalan sejarah penyebaran Islam dan berdirinya Kesultanan Banjar.

4. Candi Agung

Candi Agung terletak di Amuntai, Kabupaten Hulu Sungai Utara, Kalimantan Selatan. Candi ini merupakan peninggalan Kerajaan Negara Dipa atau Negara Dipa Khuripan yang diperkirakan dibangun pada abad ke-14 M oleh Empu Jatmika. Candi Agung menjadi bukti adanya kerajaan bercorak Hindu di Kalimantan Selatan sebelum berkembangnya Kesultanan Banjar. Tempat ini merupakan bekas pusat peninggalan kerajaan lama yang kemudian menjadi bagian penting dalam sejarah asal-usul masyarakat Banjar.

5. Makam Pangeran Antasari

Makam Pangeran Antasari berada di Jalan Malkon Temon, Kelurahan Surgi Mufti, Kecamatan Banjarmasin Utara. Pangeran Antasari merupakan pahlawan nasional dari Kalimantan Selatan yang memimpin perlawanan rakyat Banjar melawan penjajah Belanda. Makam beliau awalnya berada di daerah Bayan Bengok, kemudian dipindahkan ke Banjarmasin pada tahun 1958. Tempat ini menjadi situs bersejarah karena menjadi simbol perjuangan rakyat Banjar dalam melawan penjajahan.

6. Museum Lambung Mangkurat

Museum Lambung Mangkurat terletak di Banjarbaru, Kalimantan Selatan. Museum ini awalnya berhubungan dengan Museum Borneo yang didirikan oleh Pemerintah Hindia Belanda pada tahun 1907 di Banjarmasin, kemudian berkembang dan dipindahkan ke Banjarbaru. Bangunan Museum Lambung Mangkurat mulai dibangun secara bertahap sejak tahun 1974. Museum ini menyimpan berbagai koleksi sejarah, budaya Banjar, arkeologi, benda kerajaan, hingga peninggalan masa Hindu dan Kesultanan Banjar.

Tempat-tempat ini menjadi saksi perkembangan masyarakat Banjar dari masa ke masa.
        """.trimIndent()
            )
        }

        cardLogout.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        // Initial Page and Data Loading
        loadUserData()
        loadProgressKuis()
        showPage("home")
    }


    override fun onResume() {
        super.onResume()
        loadProgressKuis()
    }

    private fun loadProgressKuis() {
        val prefs = getSharedPreferences("progress_kuis", MODE_PRIVATE)

        val totalKosakata = prefs.getInt("totalKosakata", 0)
        val totalKuis = prefs.getInt("totalKuis", 0)
        val nilaiTerakhir = prefs.getInt("nilaiTerakhir", 0)

        tvTotalKosakata.text = totalKosakata.toString()
        tvTotalKuis.text = totalKuis.toString()
        tvNilaiTerakhir.text = nilaiTerakhir.toString()
        tvProgressPersen.text = "$totalKosakata%"
        progressKosakata.progress = totalKosakata

        val levelKuis = when {
            totalKosakata <= 25 -> "Pemula"
            totalKosakata <= 50 -> "Menengah"
            else -> "Master"
        }

        tvLevel.text = "⭐ Level $levelKuis"
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

                tvGreeting.text = "Halo, selamat datang 👋"
                tvUserName.text = name
                tvProfileName.text = name

                val initial = name.firstOrNull()
                    ?.uppercaseChar()
                    ?.toString() ?: "P"

                tvUserInitial.text = initial
                tvProfileInitial.text = initial
            }

    }

    private fun setDefaultUserData() {
        tvGreeting.text = "Halo, selamat datang 👋"
        tvUserName.text = "Pengguna"
        tvProfileName.text = "Pengguna"
        tvLevel.text = "⭐ Level Pemula"

        tvUserInitial.text = "P"
        tvProfileInitial.text = "P"
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