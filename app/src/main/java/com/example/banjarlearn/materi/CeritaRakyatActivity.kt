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
    private lateinit var btnCerita4: Button
    private lateinit var btnCerita5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_rakyat)

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

Setelah pertapaan yang panjang, datanglah petunjuk agar ia pergi ke sebuah tempat di sungai. Di sana muncul buih yang semakin lama semakin besar. Dari tengah buih itu, muncullah seorang putri cantik yang bercahaya. Putri itu kemudian dikenal dengan nama Putri Junjung Buih. Kehadirannya dianggap sebagai tanda kebesaran Tuhan dan harapan baru bagi kerajaan.

Putri Junjung Buih kemudian dibawa ke istana dan dihormati sebagai tokoh penting yang akan membawa kemakmuran. Dalam kisah Banjar, ia kemudian dipersunting oleh Pangeran Suryanata. Dari pernikahan tersebut lahirlah garis keturunan raja-raja Banjar. Oleh karena itu, Putri Junjung Buih sangat dihormati sebagai tokoh penting dalam sejarah dan legenda masyarakat Banjar.

Cerita ini tidak hanya dikenal sebagai dongeng, tetapi juga menjadi bagian dari identitas budaya Banjar. Kisahnya sering diceritakan kembali dalam pelajaran budaya, pertunjukan seni, dan cerita rakyat daerah. Nilai yang dapat dipetik dari cerita ini adalah pentingnya kesabaran, kebijaksanaan, kepercayaan kepada petunjuk Tuhan, serta penghormatan terhadap warisan leluhur.

Hingga sekarang, nama Putri Junjung Buih masih sangat dikenal oleh masyarakat Kalimantan Selatan. Kisahnya menjadi lambang kebesaran, keanggunan, dan asal-usul kebudayaan Banjar yang diwariskan dari generasi ke generasi.
                """.trimIndent(),
                R.drawable.putri_junjung_buih
            )
        }

        btnCerita2.setOnClickListener {
            bukaDetail(
                "Datu Sanggul",
                """
Datu Sanggul adalah salah satu tokoh yang sangat dihormati dalam masyarakat Banjar. Beliau dikenal sebagai ulama yang memiliki ilmu agama yang luas, kepribadian yang sederhana, serta akhlak yang sangat baik. Dalam cerita masyarakat, Datu Sanggul digambarkan sebagai sosok yang tekun menuntut ilmu dan mendedikasikan hidupnya untuk berdakwah.

Konon, beliau datang ke Kalimantan Selatan untuk menyebarkan ajaran Islam. Dalam perjalanannya, Datu Sanggul menghadapi berbagai tantangan, tetapi beliau tetap sabar dan teguh. Beliau mengajarkan agama dengan cara yang lembut, penuh hikmah, dan mudah diterima masyarakat. Karena itulah, masyarakat menaruh rasa hormat yang besar kepada beliau.

Selain dikenal sebagai penyebar ajaran Islam, Datu Sanggul juga sering dikaitkan dengan kisah-kisah keteladanan. Banyak cerita rakyat yang menggambarkan beliau sebagai pribadi yang rendah hati, suka menolong, dan tidak pernah merasa lebih tinggi dari orang lain. Keteladanannya membuat masyarakat menjadikannya panutan dalam kehidupan sehari-hari.

Kisah Datu Sanggul mengajarkan bahwa ilmu harus disertai akhlak yang baik. Seseorang tidak cukup hanya pintar, tetapi juga harus sabar, jujur, dan bermanfaat bagi sesama. Nilai-nilai seperti inilah yang membuat sosok Datu Sanggul tetap hidup dalam ingatan masyarakat Banjar sampai sekarang.

Hingga kini, nama Datu Sanggul masih sering disebut dalam cerita budaya dan sejarah lokal. Banyak orang datang berziarah dan mengenang jasa-jasanya sebagai bagian dari warisan religius dan budaya Kalimantan Selatan.
                """.trimIndent(),
                R.drawable.datu_sanggul
            )
        }

        btnCerita3.setOnClickListener {
            bukaDetail(
                "Legenda Sungai Barito",
                """
Sungai Barito merupakan salah satu sungai besar yang sangat penting bagi kehidupan masyarakat Kalimantan, termasuk masyarakat Banjar. Sejak zaman dahulu, sungai ini bukan hanya menjadi jalur air biasa, tetapi juga menjadi pusat kehidupan, perdagangan, transportasi, dan pertemuan antarwarga.

Dalam cerita rakyat Banjar, Sungai Barito sering digambarkan sebagai sungai yang memberi kehidupan. Dari sungai inilah masyarakat mendapatkan ikan, air, jalur perjalanan, serta tempat berdagang. Banyak kampung tumbuh di tepi sungai, dan kehidupan sehari-hari pun sangat bergantung pada aliran airnya. Tidak heran jika sungai ini dianggap sebagai bagian penting dari jati diri masyarakat Banjar.

Di sepanjang aliran Barito, berkembang pula berbagai tradisi khas, seperti pasar terapung, rumah-rumah lanting, perahu dagang, dan kebiasaan hidup masyarakat bantaran sungai. Sungai bukan dipandang sekadar tempat lewat air, melainkan ruang hidup yang membentuk budaya. Karena itulah, legenda dan cerita tentang Sungai Barito selalu mengandung makna kedekatan manusia dengan alam.

Cerita tentang Sungai Barito mengajarkan bahwa manusia harus hidup selaras dengan lingkungan. Sungai yang dijaga akan memberi manfaat besar, tetapi sungai yang dirusak dapat membawa kesulitan. Oleh sebab itu, kisah ini juga menjadi pengingat agar generasi muda menghargai alam sebagai bagian dari warisan budaya.

Hingga hari ini, Sungai Barito tetap menjadi simbol kehidupan masyarakat Banjar. Ia bukan hanya sungai besar, tetapi juga saksi perjalanan sejarah, budaya, dan kehidupan masyarakat dari masa ke masa.
                """.trimIndent(),
                R.drawable.sungai_barito
            )
        }

        btnCerita4.setOnClickListener {
            bukaDetail(
                "Legenda Pulau Kembang",
                """
Pulau Kembang adalah salah satu tempat yang sangat dikenal di Kalimantan Selatan, terutama karena keunikan alam dan kisah rakyat yang menyertainya. Pulau ini berada di tengah aliran sungai dan sejak lama dikenal sebagai tempat yang memiliki suasana berbeda dibanding wilayah sekitarnya.

Dalam cerita yang berkembang di masyarakat, Pulau Kembang dikaitkan dengan kisah-kisah mistis dan kepercayaan tradisional. Ada yang meyakini bahwa tempat ini dahulu merupakan wilayah yang dijaga oleh kekuatan gaib. Karena itu, masyarakat lama sangat menghormati Pulau Kembang dan tidak sembarangan bersikap ketika datang ke sana. Sikap hormat tersebut menunjukkan betapa masyarakat Banjar menjunjung keseimbangan antara manusia, alam, dan dunia spiritual.

Pulau Kembang juga terkenal karena banyak dihuni oleh kera. Kehadiran kera-kera ini menjadi daya tarik tersendiri dan membuat pulau tersebut semakin dikenal. Dalam pandangan masyarakat, keberadaan hewan-hewan di Pulau Kembang memperkuat kesan bahwa pulau ini adalah tempat yang istimewa dan patut dijaga.

Lama-kelamaan, Pulau Kembang tidak hanya menjadi bahan cerita rakyat, tetapi juga menjadi bagian dari destinasi wisata budaya dan alam. Orang-orang datang bukan hanya untuk melihat keindahannya, tetapi juga untuk mengenal kisah-kisah yang hidup di balik tempat tersebut. Cerita ini mengajarkan bahwa sebuah tempat bisa menjadi bermakna karena perpaduan antara alam, sejarah, dan kepercayaan masyarakat.

Legenda Pulau Kembang mengingatkan kita bahwa warisan budaya tidak selalu berupa benda, tetapi juga berupa cerita yang diwariskan turun-temurun. Selama cerita itu terus diceritakan, identitas budaya Banjar akan tetap hidup.
                """.trimIndent(),
                R.drawable.pulau_kembang
            )
        }

        btnCerita5.setOnClickListener {
            bukaDetail(
                "Asal Usul Pasar Terapung",
                """
Pasar terapung adalah salah satu simbol paling terkenal dari budaya Banjar. Pasar ini tumbuh dari kehidupan masyarakat yang sangat dekat dengan sungai. Pada masa lalu, sungai merupakan jalur utama untuk bepergian, berdagang, dan berinteraksi. Karena itulah, kegiatan jual beli pun berlangsung di atas perahu.

Dalam cerita asal-usulnya, pasar terapung bermula dari kebiasaan warga yang saling bertemu di sungai pada pagi hari. Para pedagang membawa hasil kebun, buah-buahan, sayur, ikan, dan berbagai kebutuhan rumah tangga menggunakan jukung atau perahu kecil. Dari kebiasaan sederhana ini, terbentuklah kegiatan perdagangan yang teratur dan akhirnya dikenal sebagai pasar terapung.

Pasar terapung kemudian berkembang menjadi bagian penting dalam kehidupan ekonomi masyarakat. Selain tempat jual beli, pasar ini juga menjadi tempat bertemu, berbagi kabar, dan menjalin hubungan sosial. Suasana ramai di atas sungai menunjukkan betapa sungai menjadi pusat kehidupan masyarakat Banjar pada masa itu.

Cerita tentang pasar terapung juga menunjukkan kecerdasan masyarakat Banjar dalam menyesuaikan kehidupan dengan lingkungan. Ketika sungai menjadi jalur utama, maka aktivitas ekonomi pun bergerak mengikuti arus kehidupan itu. Inilah yang membuat pasar terapung menjadi tradisi yang unik dan berbeda dari pasar darat pada umumnya.

Hingga sekarang, pasar terapung masih menjadi ikon budaya Kalimantan Selatan. Walaupun zaman telah berubah, pasar terapung tetap dikenang sebagai warisan budaya yang mencerminkan semangat kerja, kebersamaan, dan kreativitas masyarakat Banjar.
                """.trimIndent(),
                R.drawable.pasar_terapung
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