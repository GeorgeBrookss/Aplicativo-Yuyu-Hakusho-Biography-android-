package com.example.yuyuha

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SelecaoPersonagens : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_selecao_personagens)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val but_urameshi: ImageButton = findViewById(R.id.YusukeSelecao)
        but_urameshi.setOnClickListener {
            val intent = Intent(this, urameshiBio::class.java)
            startActivity(intent)
        }
        val Kazuma_bio: ImageButton = findViewById(R.id.KuwabaraSelecao)
        Kazuma_bio.setOnClickListener {
            intent = Intent(this, KuwabaraBio::class.java)
            startActivity(intent)
        }
        val but_hiei: ImageButton = findViewById(R.id.HieiSelecao)
        but_hiei.setOnClickListener {
            intent = Intent(this, hieiBio::class.java)
            startActivity(intent)
        }
        val but_kurama : ImageButton = findViewById(R.id.KuramaSelecao)
        but_kurama.setOnClickListener{
            intent = Intent(this, kuramaBio::class.java)
            startActivity(intent)
        }
    }
}