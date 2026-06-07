package com.example.banjarlearn.kuis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R

class PilihanGandaActivity : AppCompatActivity() {

    private lateinit var tvNomor: TextView
    private lateinit var tvSoal: TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var rbA: RadioButton
    private lateinit var rbB: RadioButton
    private lateinit var rbC: RadioButton
    private lateinit var rbD: RadioButton
    private lateinit var btnNext: Button

    private var indexSoal = 0
    private var skor = 0
    private var indexMulai = 0

    private lateinit var soalKuis: List<Soal>

    private val semuaSoal = listOf(
        Soal("Arti kata 'Ulun' adalah...", listOf("Saya", "Kamu", "Dia", "Mereka"), 0),
        Soal("Arti kata 'Ikam' adalah...", listOf("Saya", "Kamu", "Kami", "Dia"), 1),
        Soal("Arti kata 'Banyu' adalah...", listOf("Api", "Air", "Tanah", "Angin"), 1),
        Soal("Bahasa Banjar dari 'pergi' adalah...", listOf("Bulik", "Tulak", "Handak", "Lauk"), 1),
        Soal("Bahasa Banjar dari 'mau' adalah...", listOf("Handak", "Banyu", "Ulun", "Pian"), 0),

        Soal("Arti kata 'Bulik' adalah...", listOf("Datang", "Pulang", "Makan", "Tidur"), 1),
        Soal("Arti kata 'Lauk' adalah...", listOf("Ikan", "Nasi", "Air", "Rumah"), 0),
        Soal("Bahasa Banjar dari 'anda' adalah...", listOf("Pian", "Ulun", "Inya", "Sidin"), 0),
        Soal("Arti kata 'Inya' adalah...", listOf("Saya", "Dia", "Kamu", "Kami"), 1),
        Soal("Arti kata 'Sidin' adalah...", listOf("Beliau", "Aku", "Kamu", "Mereka"), 0),

        Soal("Arti kata 'Uma' adalah...", listOf("Ibu", "Ayah", "Adik", "Kakak"), 0),
        Soal("Arti kata 'Abah' adalah...", listOf("Ibu", "Ayah", "Nenek", "Paman"), 1),
        Soal("Arti kata 'Guring' adalah...", listOf("Tidur", "Makan", "Pergi", "Minum"), 0),
        Soal("Arti kata 'Kada' adalah...", listOf("Iya", "Tidak", "Mau", "Sudah"), 1),
        Soal("Arti kata 'Banar' adalah...", listOf("Sedikit", "Banyak", "Sangat/Benar", "Kecil"), 2),

        Soal("Arti kata 'Haja' adalah...", listOf("Saja", "Juga", "Banyak", "Cepat"), 0),
        Soal("Arti kata 'Lawas' adalah...", listOf("Baru", "Lama", "Cepat", "Dekat"), 1),
        Soal("Bahasa Banjar dari 'cepat' adalah...", listOf("Lakasi", "Lawas", "Bulik", "Banyu"), 0),
        Soal("Arti kata 'Hanyar' adalah...", listOf("Lama", "Baru", "Jauh", "Dekat"), 1),
        Soal("Arti kata 'Ganal' adalah...", listOf("Kecil", "Besar", "Pendek", "Tipis"), 1),

        Soal("Arti kata 'Halus' dalam Banjar adalah...", listOf("Besar", "Kecil", "Panjang", "Tinggi"), 1),
        Soal("Arti kata 'Hadang' adalah...", listOf("Putih", "Hitam", "Merah", "Hijau"), 2),
        Soal("Arti kata 'Hijau' dalam Banjar sering disebut...", listOf("Habang", "Biru", "Hijau", "Kuning"), 2),
        Soal("Arti kata 'Kuning' adalah...", listOf("Kuning", "Merah", "Putih", "Hitam"), 0),
        Soal("Arti kata 'Putih' adalah...", listOf("Putih", "Merah", "Biru", "Abu-abu"), 0),

        Soal("Arti kata 'Hitam' adalah...", listOf("Putih", "Hitam", "Kuning", "Hijau"), 1),
        Soal("Arti kata 'Haruan' adalah...", listOf("Ikan gabus", "Ayam", "Sapi", "Udang"), 0),
        Soal("Arti kata 'Hintalu' adalah...", listOf("Telur", "Ikan", "Nasi", "Sayur"), 0),
        Soal("Arti kata 'Wadai' adalah...", listOf("Kue", "Air", "Ikan", "Rumah"), 0),
        Soal("Arti kata 'Iwakan' adalah...", listOf("Lauk pauk", "Minuman", "Buah", "Kue"), 0),

        Soal("Arti kata 'Nasi' dalam Banjar adalah...", listOf("Nasi", "Banyu", "Wadai", "Lauk"), 0),
        Soal("Arti kata 'Minum' dalam Banjar adalah...", listOf("Minum", "Guring", "Tulak", "Bulik"), 0),
        Soal("Arti kata 'Makan' dalam Banjar adalah...", listOf("Makan", "Minum", "Tidur", "Lari"), 0),
        Soal("Arti kata 'Bakunyung' adalah...", listOf("Berenang", "Berjalan", "Makan", "Tidur"), 0),
        Soal("Arti kata 'Badiri' adalah...", listOf("Berdiri", "Duduk", "Tidur", "Pergi"), 0),

        Soal("Arti kata 'Duduk' dalam Banjar adalah...", listOf("Duduk", "Badiri", "Guring", "Tulak"), 0),
        Soal("Arti kata 'Bajalan' adalah...", listOf("Berjalan", "Makan", "Tidur", "Menulis"), 0),
        Soal("Arti kata 'Bagawi' adalah...", listOf("Bekerja", "Bermain", "Tidur", "Belajar"), 0),
        Soal("Arti kata 'Balajar' adalah...", listOf("Belajar", "Bekerja", "Makan", "Pulang"), 0),
        Soal("Arti kata 'Bamain' adalah...", listOf("Bermain", "Belajar", "Menangis", "Tidur"), 0),

        Soal("Arti kata 'Sekulah' adalah...", listOf("Sekolah", "Pasar", "Rumah", "Masjid"), 0),
        Soal("Arti kata 'Guru' adalah...", listOf("Guru", "Murid", "Ayah", "Ibu"), 0),
        Soal("Arti kata 'Murid' adalah...", listOf("Murid", "Guru", "Pedagang", "Petani"), 0),
        Soal("Arti kata 'Buku' adalah...", listOf("Buku", "Pensil", "Tas", "Meja"), 0),
        Soal("Arti kata 'Pulpen' adalah...", listOf("Pulpen", "Buku", "Kursi", "Pintu"), 0),

        Soal("Arti kata 'Rumah' adalah...", listOf("Rumah", "Pasar", "Sekolah", "Jalan"), 0),
        Soal("Arti kata 'Pintu' adalah...", listOf("Pintu", "Jendela", "Atap", "Lantai"), 0),
        Soal("Arti kata 'Lawang' adalah...", listOf("Pintu", "Kamar", "Dapur", "Halaman"), 0),
        Soal("Arti kata 'Jalan' adalah...", listOf("Jalan", "Sungai", "Rumah", "Pasar"), 0),
        Soal("Arti kata 'Sungai' adalah...", listOf("Sungai", "Gunung", "Hutan", "Sawah"), 0),

        Soal("Arti kata 'Pasar' adalah...", listOf("Pasar", "Sekolah", "Rumah", "Kantor"), 0),
        Soal("Arti kata 'Masigit' adalah...", listOf("Masjid", "Pasar", "Sekolah", "Rumah"), 0),
        Soal("Arti kata 'Langgar' adalah...", listOf("Mushola", "Pasar", "Sekolah", "Rumah"), 0),
        Soal("Arti kata 'Kampung' adalah...", listOf("Kampung", "Kota", "Rumah", "Jalan"), 0),
        Soal("Arti kata 'Banua' adalah...", listOf("Daerah/negeri", "Rumah", "Air", "Pasar"), 0),

        Soal("Arti kata 'Kakawanan' adalah...", listOf("Teman-teman", "Keluarga", "Guru", "Tetangga"), 0),
        Soal("Arti kata 'Kawan' adalah...", listOf("Teman", "Musuh", "Guru", "Adik"), 0),
        Soal("Arti kata 'Ading' adalah...", listOf("Adik", "Kakak", "Ayah", "Ibu"), 0),
        Soal("Arti kata 'Kaka' adalah...", listOf("Kakak", "Adik", "Paman", "Bibi"), 0),
        Soal("Arti kata 'Nini' adalah...", listOf("Nenek", "Ibu", "Kakak", "Adik"), 0),

        Soal("Arti kata 'Kai' adalah...", listOf("Kakek", "Ayah", "Paman", "Guru"), 0),
        Soal("Arti kata 'Julak' adalah...", listOf("Paman/Bibi tua", "Adik", "Teman", "Anak"), 0),
        Soal("Arti kata 'Acil' adalah...", listOf("Bibi", "Ibu", "Nenek", "Kakak"), 0),
        Soal("Arti kata 'Paman' adalah...", listOf("Paman", "Ayah", "Kakek", "Kakak"), 0),
        Soal("Arti kata 'Anak' adalah...", listOf("Anak", "Orang tua", "Teman", "Guru"), 0),

        Soal("Arti kata 'Bahari' adalah...", listOf("Dahulu", "Sekarang", "Besok", "Nanti"), 0),
        Soal("Arti kata 'Wayahini' adalah...", listOf("Sekarang", "Kemarin", "Besok", "Dulu"), 0),
        Soal("Arti kata 'Kaina' adalah...", listOf("Nanti", "Dulu", "Sekarang", "Kemarin"), 0),
        Soal("Arti kata 'Isuk' adalah...", listOf("Besok", "Kemarin", "Dulu", "Sekarang"), 0),
        Soal("Arti kata 'Tadi' adalah...", listOf("Tadi", "Besok", "Nanti", "Lusa"), 0),

        Soal("Arti kata 'Malam' adalah...", listOf("Malam", "Pagi", "Siang", "Sore"), 0),
        Soal("Arti kata 'Pagi' adalah...", listOf("Pagi", "Malam", "Sore", "Siang"), 0),
        Soal("Arti kata 'Siang' adalah...", listOf("Siang", "Malam", "Pagi", "Subuh"), 0),
        Soal("Arti kata 'Sanja' adalah...", listOf("Sore", "Pagi", "Malam", "Siang"), 0),
        Soal("Arti kata 'Subuh' adalah...", listOf("Subuh", "Siang", "Sore", "Malam"), 0),

        Soal("Arti kata 'Hujan' adalah...", listOf("Hujan", "Panas", "Angin", "Petir"), 0),
        Soal("Arti kata 'Panas' adalah...", listOf("Panas", "Dingin", "Hujan", "Gelap"), 0),
        Soal("Arti kata 'Dingin' adalah...", listOf("Dingin", "Panas", "Hujan", "Terang"), 0),
        Soal("Arti kata 'Angin' adalah...", listOf("Angin", "Api", "Air", "Tanah"), 0),
        Soal("Arti kata 'Api' adalah...", listOf("Api", "Air", "Angin", "Tanah"), 0),

        Soal("Arti kata 'Bagus' adalah...", listOf("Bagus", "Jelek", "Lama", "Kecil"), 0),
        Soal("Arti kata 'Jelek' adalah...", listOf("Jelek", "Bagus", "Besar", "Cepat"), 0),
        Soal("Arti kata 'Nyaman' dalam konteks makanan adalah...", listOf("Enak", "Sakit", "Pahit", "Asin"), 0),
        Soal("Arti kata 'Pahit' adalah...", listOf("Pahit", "Manis", "Asin", "Pedas"), 0),
        Soal("Arti kata 'Manis' adalah...", listOf("Manis", "Pahit", "Asam", "Asin"), 0),

        Soal("Arti kata 'Asin' adalah...", listOf("Asin", "Manis", "Pahit", "Pedas"), 0),
        Soal("Arti kata 'Masam' adalah...", listOf("Asam", "Manis", "Asin", "Pahit"), 0),
        Soal("Arti kata 'Padis' adalah...", listOf("Pedas", "Manis", "Pahit", "Asin"), 0),
        Soal("Arti kata 'Lapar' adalah...", listOf("Lapar", "Kenyang", "Haus", "Tidur"), 0),
        Soal("Arti kata 'Haus' adalah...", listOf("Haus", "Lapar", "Kenyang", "Capek"), 0),

        Soal("Arti kata 'Capek' adalah...", listOf("Lelah", "Senang", "Marah", "Takut"), 0),
        Soal("Arti kata 'Marah' adalah...", listOf("Marah", "Senang", "Takut", "Lelah"), 0),
        Soal("Arti kata 'Takut' adalah...", listOf("Takut", "Berani", "Senang", "Marah"), 0),
        Soal("Arti kata 'Sanang' adalah...", listOf("Senang", "Sedih", "Marah", "Takut"), 0),
        Soal("Arti kata 'Sedih' adalah...", listOf("Sedih", "Senang", "Marah", "Berani"), 0),

        Soal("Arti kata 'Tukar' adalah...", listOf("Beli", "Jual", "Pinjam", "Simpan"), 0),
        Soal("Arti kata 'Jual' adalah...", listOf("Jual", "Beli", "Ambil", "Simpan"), 0),
        Soal("Arti kata 'Duit' adalah...", listOf("Uang", "Barang", "Makanan", "Minuman"), 0),
        Soal("Arti kata 'Murah' adalah...", listOf("Murah", "Mahal", "Banyak", "Sedikit"), 0),
        Soal("Arti kata 'Mahal' adalah...", listOf("Mahal", "Murah", "Cepat", "Lama"), 0)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihan_ganda)

        tvNomor = findViewById(R.id.tvNomor)
        tvSoal = findViewById(R.id.tvSoal)
        radioGroup = findViewById(R.id.radioGroup)
        rbA = findViewById(R.id.rbA)
        rbB = findViewById(R.id.rbB)
        rbC = findViewById(R.id.rbC)
        rbD = findViewById(R.id.rbD)
        btnNext = findViewById(R.id.btnNext)

        val prefs = getSharedPreferences("progress_kuis", MODE_PRIVATE)
        indexMulai = prefs.getInt("indexMulaiSoal", 0)

        soalKuis = ambilSoalKuis()

        tampilkanSoal()

        btnNext.setOnClickListener {
            cekJawaban()
        }
    }

    private fun ambilSoalKuis(): List<Soal> {
        if (indexMulai >= semuaSoal.size) {
            indexMulai = 0
        }

        val akhir = (indexMulai + 5).coerceAtMost(semuaSoal.size)
        val soal = semuaSoal.subList(indexMulai, akhir)

        return if (soal.size < 5) {
            semuaSoal.take(5)
        } else {
            soal
        }
    }

    private fun tampilkanSoal() {
        val soal = soalKuis[indexSoal]

        tvNomor.text = "Soal ${indexSoal + 1}/${soalKuis.size}"
        tvSoal.text = soal.pertanyaan

        rbA.text = soal.opsi[0]
        rbB.text = soal.opsi[1]
        rbC.text = soal.opsi[2]
        rbD.text = soal.opsi[3]

        radioGroup.clearCheck()

        btnNext.text = if (indexSoal == soalKuis.size - 1) {
            "Selesai"
        } else {
            "Selanjutnya"
        }
    }

    private fun cekJawaban() {
        val selectedId = radioGroup.checkedRadioButtonId

        if (selectedId == -1) {
            Toast.makeText(this, "Pilih jawaban dulu", Toast.LENGTH_SHORT).show()
            return
        }

        val jawabanUser = when (selectedId) {
            R.id.rbA -> 0
            R.id.rbB -> 1
            R.id.rbC -> 2
            R.id.rbD -> 3
            else -> -1
        }

        if (jawabanUser == soalKuis[indexSoal].jawabanBenar) {
            skor++
            simpanKosakata(soalKuis[indexSoal])
        }

        if (indexSoal < soalKuis.size - 1) {
            indexSoal++
            tampilkanSoal()
        } else {
            selesaiKuis()
        }
    }
    private fun simpanKosakata(soal: Soal) {
        val prefs = getSharedPreferences("kosakata_user", MODE_PRIVATE)

        val dataLama = prefs.getStringSet("daftarKosakata", emptySet()) ?: emptySet()
        val dataBaru = dataLama.toMutableSet()

        val kata = ambilKataDariPertanyaan(soal.pertanyaan)
        val arti = soal.opsi[soal.jawabanBenar]

        if (kata.isNotEmpty()) {
            dataBaru.add("$kata|$arti")
        }

        prefs.edit()
            .putStringSet("daftarKosakata", dataBaru)
            .apply()
    }

    private fun ambilKataDariPertanyaan(pertanyaan: String): String {
        val regex = "'(.*?)'".toRegex()
        return regex.find(pertanyaan)?.groupValues?.get(1) ?: ""
    }

    private fun selesaiKuis() {
        val prefs = getSharedPreferences("progress_kuis", MODE_PRIVATE)

        val totalLama = prefs.getInt("totalKosakata", 0)
        val totalBaru = (totalLama + skor).coerceAtMost(100)

        val indexBerikutnya = indexMulai + 5
        val indexSimpan = if (indexBerikutnya >= semuaSoal.size) 0 else indexBerikutnya

        val totalKuisLama = prefs.getInt("totalKuis", 0)
        val totalKuisBaru = totalKuisLama + 1

        val nilai = skor * 20

        prefs.edit()
            .putInt("totalKosakata", totalBaru)
            .putInt("totalKuis", totalKuisBaru)
            .putInt("nilaiTerakhir", nilai)
            .putInt("indexMulaiSoal", indexSimpan)
            .apply()

        val level = tentukanLevel(totalBaru)

        val intent = Intent(this, HasilKuisActivity::class.java)
        intent.putExtra("nilai", nilai)
        intent.putExtra("jumlahBenar", skor)
        intent.putExtra("totalKosakata", totalBaru)
        intent.putExtra("level", level)
        startActivity(intent)
        finish()
    }

    private fun tentukanLevel(totalKosakata: Int): String {
        return when {
            totalKosakata <= 25 -> "Pemula"
            totalKosakata <= 50 -> "Menengah"
            else -> "Master"
        }
    }

    data class Soal(
        val pertanyaan: String,
        val opsi: List<String>,
        val jawabanBenar: Int
    )
}