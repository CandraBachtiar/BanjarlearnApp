package com.example.banjarlearn.profile

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.banjarlearn.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class ProfileActivity : AppCompatActivity() {

    private lateinit var tvProfileInitial: TextView
    private lateinit var tvProfileName: TextView

    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.activity_profile)

        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()

        tvProfileInitial = findViewById(R.id.tvProfileInitial)
        tvProfileName = findViewById(R.id.tvProfileName)

        tvProfileInitial.text = "A"

        loadUserData()
    }

    private fun loadUserData() {
        val uid = auth.currentUser?.uid ?: return

        db.collection("users")
            .document(uid)
            .get()
            .addOnSuccessListener { document ->
                val name = document.getString("name") ?: "Pengguna"

                tvProfileName.text = name

                val initial = name.firstOrNull()
                    ?.uppercaseChar()
                    ?.toString() ?: "P"

                tvProfileInitial.text = initial
            }
    }
}