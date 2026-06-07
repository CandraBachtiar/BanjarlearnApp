package com.example.banjarlearn.materi

import android.content.Intent
import android.media.MediaPlayer
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
    private lateinit var btnCerita4: Button
    private lateinit var btnCerita5: Button

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_rakyat)

        mulaiBacksound()

        btnBack = findViewById(R.id.btnBack)
        btnCerita1 = findViewById(R.id.btnCerita1)
        btnCerita2 = findViewById(R.id.btnCerita2)
        btnCerita3 = findViewById(R.id.btnCerita3)
        btnCerita4 = findViewById(R.id.btnCerita4)
        btnCerita5 = findViewById(R.id.btnCerita5)

        btnBack.setOnClickListener {
            finish()
        }

        btnCerita1.setOnClickListener {
            bukaDetail(
                "Putri Junjung Buih",
                """
Pada zaman dahulu, di wilayah Kerajaan Negara Dipa, Patih Lambung Mangkurat mendapat amanah untuk mencari sosok yang pantas memimpin kerajaan. Ia lalu melakukan tapa dan memohon petunjuk agar negerinya memperoleh pemimpin yang bijaksana dan membawa kesejahteraan bagi rakyat.

Setelah pertapaan yang panjang, datanglah petunjuk agar ia pergi ke sebuah tempat di sungai. Di sana muncul buih yang semakin lama semakin besar. Dari tengah buih itu, muncullah seorang putri cantik yang bercahaya. Putri itu kemudian dikenal dengan nama Putri Junjung Buih.

Putri Junjung Buih kemudian dibawa ke istana dan dihormati sebagai tokoh penting yang akan membawa kemakmuran. Dalam kisah Banjar, ia kemudian dipersunting oleh Pangeran Suryanata. Dari pernikahan tersebut lahirlah garis keturunan raja-raja Banjar.

Cerita ini mengajarkan pentingnya kesabaran, kebijaksanaan, kepercayaan kepada petunjuk Tuhan, serta penghormatan terhadap warisan leluhur.
                """.trimIndent(),
                R.drawable.putri_junjung_buih
            )
        }

        btnCerita2.setOnClickListener {
            bukaDetail(
                "Datu Sanggul",
                """
Datu Sanggul adalah salah satu tokoh yang sangat dihormati dalam masyarakat Banjar. Beliau dikenal sebagai ulama yang memiliki ilmu agama yang luas, sederhana, serta memiliki akhlak yang baik.

Konon, beliau datang ke Kalimantan Selatan untuk menyebarkan ajaran Islam. Dalam perjalanannya, Datu Sanggul menghadapi banyak tantangan, tetapi beliau tetap sabar dan teguh.

Kisah Datu Sanggul mengajarkan bahwa ilmu harus disertai akhlak yang baik. Seseorang tidak cukup hanya pintar, tetapi juga harus sabar, jujur, dan bermanfaat bagi sesama.
                """.trimIndent(),
                R.drawable.datu_sanggul
            )
        }

        btnCerita3.setOnClickListener {
            bukaDetail(
                "Legenda Sungai Barito",
                """
Sungai Barito merupakan salah satu sungai besar yang sangat penting bagi kehidupan masyarakat Kalimantan, termasuk masyarakat Banjar. Sejak dahulu, sungai ini menjadi pusat kehidupan, perdagangan, transportasi, dan pertemuan antarwarga.

Di sepanjang aliran Barito, berkembang berbagai tradisi khas seperti pasar terapung, rumah lanting, perahu dagang, dan kehidupan masyarakat bantaran sungai.

Cerita tentang Sungai Barito mengajarkan bahwa manusia harus hidup selaras dengan alam. Sungai yang dijaga akan memberi manfaat besar bagi kehidupan masyarakat.
                """.trimIndent(),
                R.drawable.sungai_barito
            )
        }

        btnCerita4.setOnClickListener {
            bukaDetail(
                "Legenda Pulau Kembang",
                """
Pulau Kembang adalah salah satu tempat terkenal di Kalimantan Selatan. Pulau ini berada di tengah aliran sungai dan dikenal karena keunikan alam serta cerita rakyat yang menyertainya.

Dalam cerita masyarakat, Pulau Kembang dikaitkan dengan kisah-kisah mistis dan kepercayaan tradisional. Masyarakat lama sangat menghormati tempat ini dan menjaga sikap ketika berada di sana.

Pulau Kembang juga dikenal karena banyak dihuni oleh kera. Keberadaan hewan-hewan ini membuat pulau tersebut semakin dikenal sebagai tempat yang unik dan memiliki nilai budaya.
                """.trimIndent(),
                R.drawable.pulau_kembang
            )
        }

        btnCerita5.setOnClickListener {
            bukaDetail(
                "Asal Usul Pasar Terapung",
                """
Pasar terapung adalah salah satu simbol terkenal dari budaya Banjar. Pasar ini tumbuh dari kehidupan masyarakat yang sangat dekat dengan sungai.

Pada masa lalu, sungai menjadi jalur utama untuk bepergian dan berdagang. Para pedagang membawa hasil kebun, buah-buahan, sayur, ikan, dan kebutuhan rumah tangga menggunakan jukung atau perahu kecil.

Dari kebiasaan sederhana itu, terbentuklah kegiatan jual beli di atas air yang kemudian dikenal sebagai pasar terapung. Tradisi ini menjadi bukti kreativitas masyarakat Banjar dalam menyesuaikan kehidupan dengan lingkungan sungai.
                """.trimIndent(),
                R.drawable.pasar_terapung
            )
        }
    }

    private fun mulaiBacksound() {
        mediaPlayer = MediaPlayer.create(this, R.raw.backsound_cerita)
        mediaPlayer?.isLooping = true
        mediaPlayer?.setVolume(0.45f, 0.45f)
        mediaPlayer?.start()
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

    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause()
    }

    override fun onResume() {
        super.onResume()
        mediaPlayer?.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}