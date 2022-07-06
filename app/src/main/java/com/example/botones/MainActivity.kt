package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.botones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBoton6.setOnClickListener {
            val intent = Intent(this, select_activity::class.java)
            startActivity(intent)
        }
        binding.botonGo.setOnClickListener {
            val inntent = Intent(this, Seekbar::class.java)
            startActivity(inntent)
        }
    }
}