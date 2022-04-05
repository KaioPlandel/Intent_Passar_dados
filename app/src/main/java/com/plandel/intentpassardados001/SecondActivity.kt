package com.plandel.intentpassardados001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plandel.intentpassardados001.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent?.getStringExtra("name")
        binding.textName.text = "ola $name"

        binding.buttonVoltar.setOnClickListener { finish() }
    }
}