package com.founder.easy_route_assistant.presentation.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.founder.easy_route_assistant.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun clickSignIn() {
        val signin = binding.tvLoginEmail
        signin.setOnClickListener {
            val nextIntent = Intent(this, LoginEmailActivity::class.java)
            startActivity(nextIntent)
        }
    }

    private fun clickSignUp() {
        val signup = binding.tvLoginSignup
        signup.setOnClickListener {
            val nextIntent = Intent(this, SignUpActivity::class.java)
            startActivity(nextIntent)
        }
    }
}
