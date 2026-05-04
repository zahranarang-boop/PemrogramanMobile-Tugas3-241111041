package com.utama.loginsederhana
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        // tombol login
        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
            }
        }

        // pindah ke halaman register
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
