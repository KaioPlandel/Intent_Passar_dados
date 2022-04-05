package com.plandel.intentpassardados001
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plandel.intentpassardados001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEnviar.setOnClickListener {
            val name = binding.editNome.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}