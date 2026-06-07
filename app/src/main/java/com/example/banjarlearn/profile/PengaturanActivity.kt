package com.example.banjarlearn.profile

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banjarlearn.R
import android.view.View
import androidx.appcompat.app.AppCompatDelegate

class PengaturanActivity : AppCompatActivity() {

    private lateinit var btnBack: TextView
    private lateinit var switchDarkMode: Switch
    private lateinit var tvStatusMode: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan)

        btnBack = findViewById(R.id.btnBack)
        switchDarkMode = findViewById(R.id.switchDarkMode)
        tvStatusMode = findViewById(R.id.tvStatusMode)

        val prefs = getSharedPreferences("pengaturan_app", MODE_PRIVATE)
        val isDarkMode = prefs.getBoolean("darkMode", false)

        switchDarkMode.isChecked = isDarkMode
        updateStatus(isDarkMode)

        switchDarkMode.setOnCheckedChangeListener { _: CompoundButton, checked: Boolean ->
            prefs.edit()
                .putBoolean("darkMode", checked)
                .apply()

            updateStatus(checked)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun updateStatus(isDarkMode: Boolean) {
        tvStatusMode.text = if (isDarkMode) {
            "Mode saat ini: Dark Mode"
        } else {
            "Mode saat ini: Light Mode"
        }

        AppCompatDelegate.setDefaultNightMode(
            if (isDarkMode) {
                AppCompatDelegate.MODE_NIGHT_YES
            } else {
                AppCompatDelegate.MODE_NIGHT_NO
            }
        )
    }
}