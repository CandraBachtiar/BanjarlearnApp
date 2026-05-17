package com.example.banjarlearn

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var pageHome: View
    private lateinit var pageMateri: View
    private lateinit var pageKuis: View
    private lateinit var pageProfil: View

    private lateinit var navHome: LinearLayout
    private lateinit var navMateri: LinearLayout
    private lateinit var navKuis: LinearLayout
    private lateinit var navProfil: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pageHome = findViewById(R.id.pageHome)
        pageMateri = findViewById(R.id.pageMateri)
        pageKuis = findViewById(R.id.pageKuis)
        pageProfil = findViewById(R.id.pageProfil)

        navHome = findViewById(R.id.navHome)
        navMateri = findViewById(R.id.navMateri)
        navKuis = findViewById(R.id.navKuis)
        navProfil = findViewById(R.id.navProfil)

        showPage("home")

        navHome.setOnClickListener { showPage("home") }
        navMateri.setOnClickListener { showPage("materi") }
        navKuis.setOnClickListener { showPage("kuis") }
        navProfil.setOnClickListener { showPage("profil") }
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