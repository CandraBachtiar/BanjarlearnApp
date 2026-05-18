package com.example.banjarlearn

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnRegister = findViewById(R.id.btnRegister)
        progressBar = findViewById(R.id.progressBar)

        progressBar.visibility = View.GONE

        btnLogin.setOnClickListener {
            loginUser()
        }

        btnRegister.setOnClickListener {
            registerUser()
        }
    }

    private fun loginUser() {
        val email = etEmail.text.toString().trim()
        val password = etPassword.text.toString().trim()

        if (email.isEmpty()) {
            etEmail.error = "Email tidak boleh kosong"
            return
        }

        if (password.isEmpty()) {
            etPassword.error = "Password tidak boleh kosong"
            return
        }

        progressBar.visibility = View.VISIBLE

        auth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                progressBar.visibility = View.GONE
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            .addOnFailureListener { error ->
                progressBar.visibility = View.GONE
                Toast.makeText(this, "Login gagal: ${error.message}", Toast.LENGTH_LONG).show()
            }
    }

    private fun registerUser() {
        val name = etName.text.toString().trim()
        val email = etEmail.text.toString().trim()
        val password = etPassword.text.toString().trim()

        if (name.isEmpty()) {
            etName.error = "Nama tidak boleh kosong"
            return
        }

        if (email.isEmpty()) {
            etEmail.error = "Email tidak boleh kosong"
            return
        }

        if (password.length < 6) {
            etPassword.error = "Password minimal 6 karakter"
            return
        }

        progressBar.visibility = View.VISIBLE

        auth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener { result ->
                val uid = result.user?.uid

                if (uid == null) {
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, "UID user tidak ditemukan", Toast.LENGTH_SHORT).show()
                    return@addOnSuccessListener
                }

                val userData = hashMapOf(
                    "uid" to uid,
                    "name" to name,
                    "email" to email,
                    "level" to "Pemula",
                    "totalMateri" to 0,
                    "totalKuis" to 0,
                    "nilaiTerakhir" to 0,
                    "createdAt" to System.currentTimeMillis()
                )

                db.collection("users")
                    .document(uid)
                    .set(userData)
                    .addOnSuccessListener {
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, "Akun berhasil dibuat", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    }
                    .addOnFailureListener { error ->
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, "Gagal simpan data: ${error.message}", Toast.LENGTH_LONG).show()
                    }
            }
            .addOnFailureListener { error ->
                progressBar.visibility = View.GONE
                Toast.makeText(this, "Daftar gagal: ${error.message}", Toast.LENGTH_LONG).show()
            }
    }
}