package com.example.banjarlearn.materi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R
import androidx.activity.OnBackPressedCallback

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

        BacksoundManager.play(this, R.raw.backsound_cerita)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                BacksoundManager.stop()
                finish()
            }
        })

        btnBack = findViewById(R.id.btnBack)
        btnCerita1 = findViewById(R.id.btnCerita1)
        btnCerita2 = findViewById(R.id.btnCerita2)
        btnCerita3 = findViewById(R.id.btnCerita3)
        btnCerita4 = findViewById(R.id.btnCerita4)
        btnCerita5 = findViewById(R.id.btnCerita5)

        btnBack.setOnClickListener {
            BacksoundManager.stop()
            finish()
        }

        btnCerita1.setOnClickListener {
            bukaDetail(
                "Putri Junjung Buih",
                """
Alkisah di tanah Kalimantan Selatan, berdirilah Kerajaan Amuntai yang dipimpin oleh dua raja sekaligus, yaitu sepasang kakak beradik Raja Patmaraga dan Raja Sukmaraga. Meskipun kepemimpinan ganda seperti ini tidak lazim pada masa itu, rakyat Amuntai hidup sejahtera berkat kepemimpinan yang adil dan bijaksana kedua rajanya. 

Namun, ada satu hal yang belum lengkap dari pemerintahan tersebut. Baik Raja Patmaraga maupun Raja Sukmaraga, belum memiliki keturunan. Padahal, kedua raja ini sudah menikah untuk waktu yang cukup lama. Raja Patmaraga dan Raja Sukmaraga pun senantiasa berdoa untuk memohon keturunan.

Raja Patmaraga dan Raja Sukmaraga pun senantiasa berdoa untuk memohon keturunan.

Setelah memanjatkan doa setiap malam, akhirnya keinginan Raja Sukmaraga dan permaisurinya terkabul. Saat mengandung, sang raja acapkali mengelus perut istrinya sambil berharap ia akan mendapatkan putra kembar yang selalu didambakannya. 

Sembilan bulan kemudian, terjadilah hal yang tak terduga. Impiannya menjadi kenyataan. Permaisuri Raja Sukmaraga melahirkan sepasang bayi kembar laki-laki. Ia pun segera mengumumkan berita bahagia itu kepada seluruh rakyat, termasuk sang kakak, Raja Patmaraga.

Raja Patmaraga Diberkahi Bayi Ajaib

Meskipun menyambut kabar tersebut dengan gembira, Raja Patmaraga tak luput dari rasa iri. Sama seperti sang adik, ia pun sangat mendambakan seorang keturunan. Dalam doanya, ia tak hanya memohon anak laki-laki yang biasanya didaulat sebagai penerus takhta. Mendapatkan anak perempuan pun bukanlah masalah bagi Raja Patmaraga.

Malam harinya, Raja Patmaraga kembali memanjatkan doa untuk diberi petunjuk. Ketika tidur, ia bermimpi melihat sosoknya tengah bertapa di Candi Agung yang terletak di luar Kerajaan Amuntai. Ia terbangun dan merasa mimpinya sangat nyata. 

Tanpa menunda waktu, Raja Patmaraga benar-benar pergi ke Candi Agung untuk bertapa keesokan harinya. Ia tidak sendirian, tetapi bersama pengawal istana yang dipercayainya, Datuk Pujung.

Setibanya di sana, Raja Patmaraga mulai bertapa dengan sungguh-sungguh. Setelah beberapa hari lamanya, sang raja belum juga mendapatkan petunjuk. Karena merasa putus asa, ia pun keluar dari pertapaannya dan bermaksud kembali ke Kerajaan Amuntai bersama Datuk Pujung.

Dalam perjalanan pulang, Raja Patmaraga dan Datuk Pujung berhenti di pinggir sebuah sungai untuk beristirahat sebentar. Ketika sedang merendamkan kaki, sayup-sayup ia mendengar isak tangis seorang bayi. Ia bergegas berenang ke tengah sungai dan menghampiri sumber suara tersebut. Betapa terkejutnya Raja Patmaraga saat mendapati seorang bayi perempuan yang terapung-apung di atas segumpal buih.

Betapa terkejutnya Raja Patmaraga saat mendapati seorang bayi perempuan yang terapung-apung di atas segumpal buih.

Ia semakin terperanjat saat sang bayi dapat berbicara. Kepada Raja Patmaraga, bayi itu meminta sehelai selimut yang ditenun, serta 40 dayang wanita untuk menjemputnya. Semuanya itu harus diselesaikan dalam waktu setengah hari. 

Raja Patmaraga segera memanggil Datuk Pujung untuk mengabulkan permintaan sang bayi. Raja pun menamakan bayi itu Putri Junjung Buih seperti kondisinya ketika ditemukan. 

Sayembara Bagi Masyarakat Amuntai

Sesampainya di istana, Raja Patmaraga langsung menghadap Raja Sukmaraga untuk memberitahukan apa yang terjadi. Setelah berdiskusi, kedua raja kemudian menyebar sayembara untuk masyarakat Amuntai.

Sesuai permintaan Putri Junjung Buih, rakyat diminta untuk menenun selembar kain menjadi sebuah selimut dalam waktu setengah hari saja. Siapa pun yang berhasil melakukannya, akan diangkat menjadi pengasuh sang putri.

Sesuai permintaan Putri Junjung Buih, rakyat diminta untuk menenun selembar kain menjadi sebuah selimut dalam waktu setengah hari saja.

Selain itu, Datuk Pujung juga meminta rakyat untuk mencari 40 dayang perempuan untuk Putri Junjung Buih. Para wanita Amuntai segera berlomba-lomba untuk mendapatkan benang terbaik di seluruh penjuru kerajaan, meski mereka pun tidak yakin akan ada yang berhasil memenangkan sayembara tersebut. 

Setengah hari hampir berlalu, namun belum ada yang berhasil menyelesaikan hasil tenun menjadi satu helai selimut. Raja Patmaraga dan Datuk Pujung dilanda keputusasaan. 

Pengasuh Putri Junjung Buih

Mendekati tenggat waktu, seorang wanita menghampiri keduanya. Ia membawa selembar selimut yang dilipat rapi. Raja Patmaraga dan Datuk Pujung membuka selimut itu dan terperanjat saat melihat betapa sempurnanya hasil tenunan tersebut.

Motif tenun itu kemudian dinamakan langgundi. Dan seiring berjalannya waktu, berubah nama menjadi kain pamintan, yang berarti “permintaan”. Perempuan tersebut memperkenalkan diri sebagai Ratu Kuripan. Tepat saat kain tenun itu dipersembahkan oleh Ratu Kuripan, datanglah 40 wanita cantik yang didaulat sebagai dayang Putri Junjung Buih.

Motif tenun itu kemudian dinamakan langgundi.

Raja Patmaraga, Datuk Pujung, Ratu Kuripan, dan 40 dayang tersebut, bergegas kembali ke sungai tempat ditemukannya sang putri. Sesampainya di sana, mereka membalut tubuh Putri Junjung Buih dengan selimut yang telah ditenun. 

Melihat semua itu, Putri Junjung Buih pun tersenyum lebar. Akhirnya, ia dibawa ke Kerajaan Amuntai untuk hidup sebagai salah satu pewaris takhta Raja Patmaraga. Kebahagiaan rakyat Amuntai pun lengkap bersama dua raja dan putra-putri mereka. 

Moral Cerita

Kisah Putri Junjung Buih menunjukkan bahwa iri hati hanya akan mendatangkan kesedihan dan kekecewaan. Sebaliknya, keyakinan dan usaha yang teguh dapat mengantarkan kita pada pencapaian yang diinginkan. Kita pun terinspirasi untuk menebar kebaikan dan saling membantu, seperti Raja Patmaraga yang dengan penuh kasih sayang merawat Putri Junjung Buih.
                """.trimIndent(),
                R.drawable.putri_junjung_buih
            )
        }

        btnCerita2.setOnClickListener {
            bukaDetail(
                "Datu Sanggul",
                """
Di tanah Banjar, Kalimantan Selatan, hidup sebuah kisah yang diwariskan turun-temurun tentang seorang ulama besar yang dikenal dengan nama Datu Sanggul. Kisah ini bukan sekadar cerita, tetapi juga sarat dengan nilai spiritual, dakwah, dan kearifan lokal masyarakat Banjar.

Konon, Datu Sanggul memiliki nama asli Syekh Abdul Samad Sirajul Huda (dalam beberapa versi disebut juga Syekh Muhammad Abdussamad). Ia bukan berasal dari tanah Banjar, melainkan dari Palembang, Sumatera Selatan. Sejak muda, beliau memiliki semangat yang tinggi untuk mencari ilmu agama dan mendekatkan diri kepada Allah SWT.  

Perjalanan hidup Datu Sanggul dimulai dari sebuah mimpi. Dalam mimpi tersebut, ia mendapat petunjuk untuk mencari seorang guru mursyid (guru spiritual) yang akan membimbingnya menuju jalan kebenaran. Mimpi itu diyakini sebagai petunjuk dari Allah, sehingga ia memutuskan untuk merantau jauh meninggalkan kampung halamannya.  

Setelah menempuh perjalanan panjang melintasi lautan dan berbagai wilayah, akhirnya ia tiba di Kampung Muning (sekarang Desa Tatakan, Kabupaten Tapin, Kalimantan Selatan). Di sanalah ia menetap dan mulai menjalani kehidupan sederhana.

Di Muning, Datu Sanggul hidup sebagai seorang petani dan pemburu. Ia bercocok tanam, berkebun, dan berburu untuk memenuhi kebutuhan hidupnya. Namun, yang membuatnya sangat dihormati adalah sifatnya yang dermawan.

Setiap kali mendapatkan hasil buruan, ia tidak menyimpannya untuk diri sendiri. Ia justru membagikannya kepada tetangga dan masyarakat sekitar, hanya menyisakan sedikit untuk keluarganya.  

Karena kebiasaannya berburu dengan cara “manyanggul” (menghadang atau menjaring hewan), masyarakat mulai memanggilnya Datu Sanggul. Nama itu kemudian menjadi gelar kehormatan yang melekat padanya.

Seiring waktu, Datu Sanggul dikenal sebagai ulama yang memiliki ilmu agama yang sangat dalam. Ia aktif berdakwah dan membantu masyarakat dalam membangun kehidupan beragama.

Ia bahkan ikut membantu pembangunan masjid dengan menyediakan kayu ulin yang kuat untuk tiang-tiang masjid.  

Selain itu, Datu Sanggul juga dikenal memiliki kemampuan dalam bidang tasawuf (ilmu spiritual Islam). Ia sering menyampaikan ajaran melalui syair dan pantun yang indah, salah satunya tentang “saraba ampat” (syariat, tarekat, hakikat, dan makrifat) yang menjadi inti ajaran spiritual Islam.  

Salah satu bagian paling terkenal dari cerita ini adalah kisah karamah (keajaiban) yang dimiliki Datu Sanggul.

Pada masa Kerajaan Banjar, setiap laki-laki dewasa diwajibkan melaksanakan salat Jumat di masjid kampung. Namun, masyarakat sering tidak melihat Datu Sanggul hadir di masjid. Akibatnya, ia dianggap melanggar aturan dan harus membayar denda.  

Tetapi suatu hari, terungkap sebuah kejadian luar biasa. Datu Sanggul mengatakan bahwa ia sebenarnya melaksanakan salat Jumat di Masjidil Haram, Makkah. Bahkan dalam beberapa cerita, ia mampu hadir di sana secara gaib dalam waktu yang sama.  

Ketika hal ini disaksikan dan diyakini oleh masyarakat, mereka pun percaya bahwa Datu Sanggul adalah seorang wali Allah yang memiliki keistimewaan spiritual tinggi.

Datu Sanggul juga dikisahkan memiliki hubungan dengan ulama besar Banjar, yaitu Syekh Muhammad Arsyad al-Banjari. Bahkan, dalam beberapa cerita, mereka pernah bertemu di Makkah dan berdiskusi tentang ilmu agama.  

Hal ini semakin memperkuat posisi Datu Sanggul sebagai tokoh penting dalam sejarah spiritual masyarakat Banjar.

Menjelang akhir hayatnya, Datu Sanggul telah memberi isyarat kepada sahabatnya. Ketika ia wafat sekitar tahun 1773 M, dikisahkan hujan turun deras selama tiga hari tiga malam, seolah alam turut berduka atas kepergiannya.  

Ia kemudian dimakamkan di Kampung Muning (Desa Tatakan), dan hingga kini makamnya menjadi tempat ziarah yang ramai dikunjungi masyarakat.
                """.trimIndent(),
                R.drawable.datu_sanggul
            )
        }

        btnCerita3.setOnClickListener {
            bukaDetail(
                "Legenda Sungai Barito",
                """
Pada zaman dahulu, di sebuah tumpung (desa sangat kecil, hanya dihuni beberapa kepala keluarga) di daerah ngaju, tinggal seorang janda dengan dua orang anaknya. Anak yang tertua bernama Patih Laluntur, sedang yang seorang lagi bernama Patih Sasanggan.

Dikarenakan usia yang telah lapuk dimakan waktu, sang ibu meninggal dunia, sehingga tingga...llah dua orang kakak beradik yang sudah menginjak usia remaja. Keduanya hidup rukun, sampai tumbuh menjadi pemuda dewasa.

Beranjak dari keinginan untuk mengubah pola hidup mereka yang sangat sederhana di tumpung, disertai keinginan untuk memperbaiki taraf kehidupan, serta keinginan menimba pengalaman di daerah luar, Patih Laluntur dan Patih Sasanggan sepakat untuk meninggalkan gubug mereka di tumpung.

Dengan bekal seadanya, kedua kakak beradik itu berangkat mengembara, tanpa tahu arah yang mesti dituju.

Mereka mengembara keluar masuk hutan belantara, dan berharap agar segera bertemu dengan pemukiman penduduk. Sekian lama mereka berkelana, tak jua ditemukan adanya tanda-tanda kehidupan di daerah yang mereka lewati. Hanya semak belukar, pepohonan besar, dan berbagai satwa liar yang mereka jumpai. Bekal yang mereka bawa pun semakin menipis, tidaklah cukup untuk menempuh perjalanan tanpa batas. Untuk mengisi perut, mereka memakan hewan buruan yang dibakar, buah- buahan, umbi-umbian, dan pucuk-pucukan yang mereka temui sepanjang perjalanan.

Suatu hari, karena terlalu lelah dengan perjalanan panjang itu, mereka istirahat di bawah sebuah batang pohon besar yang rindang. Patih Laluntur dan Patih Sasanggan tidur-tiduran sambil menatap langit, melihat burung-burung beterbangan menari riang.

Untuk mengusir rangit (nyamuk hutan), mereka membuat api unggun kecil (perapian). Agar api unggun yang dibuat dapat bertahan lama, sang adik, Sasanggan, mengambil ranting-ranting kecil dari pohon dimana mereka berteduh, untuk sekadar menambah bara.

Asap yang mengepul dari perapian itu mengeluarkan bau yang sangat sedap, seperti bau daging yang terbakar. Sasanggan segera mencari sumber bau tersebut, yang ternyata berasal dari ranting dan potongan kayu dari pohon yang rindang itu. Laluntur juga mencium aroma yang sama. Karenanya, ia segera menebang salah satu dahan pohon tersebut, yang kemudian dipotong-potong, dan diletakkan ke dalam api unggun. Asap yang keluar dari api unggun itu tampak menebal, dan kembali menebar aroma yang sangat sedap, membangkitkan rasa lapar. Dan yang aneh, potongan kayu itu tidak berubah menjadi arang, melainkan terbentuk keratan-keratan daging-daging yang dibakar.

Patih Laluntur tidak sabar untuk tidak mencicipinya. Ternyata potongan kayu itu begitu empuk dan lezat, melebihi kenikmatan dari daging bakar biasa. Sasanggan pun segera melakukan hal yang sama.

Akhirnya, mereka berdua menebang pohon yang rindang itu dan dipotong-potong kecil untuk dijadikan santapan, dan sisanya sebagai bekal perjalanan mereka.

Belum lagi habis santapan di hadapan mereka, sang kakak sangat terperanjat menyaksikan perubahan yang terjadi pada tubuh adiknya. Tubuh Patih Sasanggan mulai ditumbuhi sisik- sisik tebal. Laluntur tertawa terbahak-bahak dan menganggap perubahan tubuh adiknya sebagai sesuatu yang lucu, tanpa menyadari bahwa sesungguhnya keadaannya pun tak berbeda dengan sang adik.

Sasanggan tidak menyadari bahwa yang ditertawakan adalah dirinya. Ia pun tak kalah terkejutnya menyaksikan tubuh Laluntur telah ditumbuhi sisik-sisik tebal.

Konon, kedua kakak beradik itu telah memotong dan memakan tubuh seseorang yang tengah bertapa di situ. Tubuh itu telah berubah menjadi sebatang pohon sehingga tidak dapat dikenali lagi.

Akan halnya Patih Laluntur dan Patih Sasanggan yang telah termakan tubuh seorang pertapa itu, seluruh tubuhnya telah dipenuhi sisik tebal, ekornya yang keras telah muncul, kedua kaki dan tangannya telah berubah menjadi kaki tangan buaya dengan kuku-kuku yang runcing, dan kepalanya pun telah berubah menjadi kepala buaya. Jadilah, dua ekor buaya putih.

Kedua ekor buaya putih itu merangkak menjelajahi hutan dan rimba belantara untuk mencari laut sebagai tempat kediaman mereka. Kedunya terus merayap hingga bertemu dengan laut.

Ketika hujan turun, titik-titik air yang telah menyatu mengalir melewati jalan yang dilalui kedua buaya tersebut. Semakin sering hujan turun, terjadi pengikisan tebing sungai, kemudian erosi vertikal yang kuat. Dari aliran yang kecil, kemudian bertemu dengan aliran di tempat lain. Lama-lama aliran itu menjadi besar, hingga terbentuklah sungai Barito seperti yang dilihat sekarang ini.

 
                """.trimIndent(),
                R.drawable.sungai_barito
            )
        }

        btnCerita4.setOnClickListener {
            bukaDetail(
                "Legenda Pulau Kembang",
                """
Di tengah aliran Sungai Barito, dekat Kota Banjarmasin, terdapat sebuah pulau kecil yang dikenal dengan nama Pulau Kambang. Pulau ini unik karena dipenuhi oleh ratusan bahkan ribuan kera (dalam bahasa Banjar disebut warik) dan sering menjadi tempat ziarah serta wisata.

Namun, di balik keindahannya, masyarakat Banjar mewariskan sebuah legenda yang penuh misteri tentang asal-usul pulau ini.

⸻

Pada zaman dahulu, di daerah Muara Kuin berdiri sebuah kerajaan yang cukup makmur dan ramai didatangi para pedagang dari berbagai negeri. Kehidupan masyarakat berjalan damai dan sejahtera.  

Namun, suatu hari datanglah sebuah kapal besar dari luar negeri (dalam beberapa cerita disebut dari Tiongkok atau bangsa asing lainnya). Mereka datang bukan sekadar berdagang, tetapi memiliki niat untuk menguasai wilayah kerajaan tersebut.  

Kedatangan mereka menimbulkan kekhawatiran di kalangan rakyat dan istana.

Kerajaan Kuin memiliki seorang patih sakti bernama Datu Pujung. Ia dikenal sebagai sosok yang berani, kuat, dan memiliki ilmu tinggi.  

Melihat ancaman yang datang, Datu Pujung tidak tinggal diam. Ia berusaha melindungi kerajaan dan rakyatnya dari bahaya penjajahan.

Dengan kesaktiannya, ia melakukan perlawanan terhadap kapal asing tersebut. Dalam beberapa versi cerita, Datu Pujung menggunakan kekuatan spiritual dan doa untuk menghadapi musuh.

Pertempuran besar pun terjadi di perairan Sungai Barito. Kapal asing tersebut akhirnya mengalami kehancuran dan tenggelam ke dasar sungai.

Peristiwa itu tidak berhenti sampai di sana. Secara ajaib, lokasi tenggelamnya kapal tersebut perlahan berubah menjadi sebuah daratan kecil yang kemudian dikenal sebagai Pulau Kambang.  

Masyarakat percaya bahwa pulau itu terbentuk dari sisa-sisa kapal yang tenggelam, bercampur dengan tanah dan endapan sungai.

⸻

🌺 Tradisi dan Kepercayaan di Pulau Kambang

Seiring waktu, Pulau Kambang menjadi tempat yang dianggap sakral. Banyak orang datang ke sana untuk melakukan nazar atau permohonan.

Di pulau ini juga terdapat tempat persembahan (altar), terutama digunakan oleh masyarakat Tionghoa untuk meletakkan bunga (kambang) sebagai bentuk penghormatan atau doa.  

Karena banyaknya bunga yang dipersembahkan, pulau ini kemudian dikenal dengan nama Pulau Kambang (kambang = bunga).

⸻

🐒 Kisah Warik (Kera) di Pulau Kambang

Pulau ini juga terkenal dengan keberadaan kera-kera yang hidup bebas di sana.

Menurut cerita masyarakat, kemunculan kera tersebut berkaitan dengan peristiwa masa lalu setelah terbentuknya pulau. Ada yang percaya bahwa mereka adalah penjaga pulau, bahkan dianggap sebagai makhluk yang memiliki hubungan dengan dunia gaib.  

Hingga sekarang, kera-kera ini menjadi daya tarik utama bagi pengunjung.

⸻

Kisah Putri yang Mendapat Keturunan

Legenda Pulau Kambang juga berkaitan dengan kisah kerajaan lain.

Dikisahkan seorang permaisuri yang lama tidak memiliki keturunan. Berdasarkan ramalan, ia harus melakukan upacara mandi (ba-dudus) di Pulau Kambang.

Setelah melakukan ritual tersebut, ia akhirnya hamil dan melahirkan seorang anak.  

Sejak saat itu, Pulau Kambang dipercaya sebagai tempat yang membawa berkah.
                """.trimIndent(),
                R.drawable.pulau_kembang
            )
        }

        btnCerita5.setOnClickListener {
            bukaDetail(
                "Asal Usul Pasar Terapung",
                """
Di Kalimantan Selatan, khususnya di daerah Banjarmasin dan Sungai Martapura, terdapat sebuah tradisi unik yang dikenal sebagai pasar terapung. Pasar ini tidak berada di darat, melainkan di atas air, di mana para pedagang dan pembeli bertransaksi menggunakan perahu kecil yang disebut jukung.

Namun, masyarakat Banjar tidak hanya mengenal pasar ini sebagai tempat jual beli, tetapi juga memiliki legenda tentang asal-usulnya yang diwariskan secara turun-temurun.

⸻

Pada zaman dahulu, wilayah yang kini dikenal sebagai Banjarmasin masih bernama Bandarmasih, sebuah daerah yang menjadi pusat perdagangan dan jalur penting di Kalimantan Selatan.

Di masa itu, terjadi konflik antara dua kekuatan besar, yaitu pihak Pangeran Samudera (Sultan Suriansyah) dan pamannya, Pangeran Tumenggung. Konflik ini menyebabkan ketegangan besar di wilayah tersebut.

Keduanya akhirnya bertemu di sebuah perairan sungai yang luas, yang kemudian menjadi tempat penting dalam legenda ini.

Saat kedua pihak bertemu untuk bertempur, terjadi sebuah peristiwa yang tak terduga.

Pangeran Tumenggung akhirnya menyadari bahwa lawannya adalah keponakannya sendiri. Ia pun tersentuh dan menyesali perbuatannya. Pertempuran yang seharusnya terjadi berubah menjadi perdamaian.

Keduanya sepakat untuk mengakhiri konflik dan bersatu membangun wilayah Bandarmasih menjadi lebih kuat dan makmur.  

Setelah perdamaian tercapai, sungai yang sebelumnya menjadi tempat pertemuan dua kekuatan tersebut tidak lagi digunakan untuk peperangan.

Sebaliknya, masyarakat mulai memanfaatkan sungai itu sebagai tempat berdagang. Para pedagang menggunakan perahu untuk membawa hasil bumi, seperti sayur, buah, dan makanan, lalu menjualnya langsung di atas air.

Dari sinilah muncul tradisi pasar di atas sungai, yang kemudian dikenal sebagai pasar terapung.  

Seiring waktu, pasar terapung berkembang menjadi bagian penting dari kehidupan masyarakat Banjar.

Hal ini juga didukung oleh kondisi geografis Kalimantan Selatan yang memiliki banyak sungai, sehingga transportasi air menjadi pilihan utama masyarakat.  

Para pedagang dari berbagai daerah datang menggunakan jukung, membawa hasil kebun dan dagangan mereka. Bahkan, sistem barter (bapanduk) juga pernah digunakan dalam transaksi di pasar ini.  

Tradisi ini terus bertahan hingga ratusan tahun, bahkan diperkirakan sudah ada sejak masa Kesultanan Banjar sekitar abad ke-16.  

⸻

Hingga sekarang, pasar terapung masih bisa ditemukan di beberapa tempat, seperti:

* Muara Kuin (Banjarmasin)
* Lok Baintan (Kabupaten Banjar)

Pasar ini biasanya berlangsung pada pagi hari, ketika puluhan hingga ratusan jukung berkumpul di sungai, menciptakan pemandangan yang indah dan khas.
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

    override fun onBackPressed() {
        BacksoundManager.stop()
        super.onBackPressed()
    }

    override fun onDestroy() {
        if (isFinishing) {
            BacksoundManager.stop()
        }
        super.onDestroy()
    }
}