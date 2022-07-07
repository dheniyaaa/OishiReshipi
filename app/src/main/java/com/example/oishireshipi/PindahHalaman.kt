package com.example.oishireshipi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.request.RequestOptions

class PindahHalaman : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_halaman)


        val nameReceived: TextView = findViewById(R.id.tv_nama_resep)
        val detailReceived: TextView = findViewById(R.id.tv_deskripsi)
        val imageReceived: ImageView = findViewById(R.id.gambar)



        val bundle = intent.extras
        if (bundle != null) {
            nameReceived.setText(bundle.getString("recipeNames"))
            detailReceived.setText(bundle.getString("recipeDetails"))
            imageReceived.setImageResource(bundle.getInt("recipeImages"))
        }

    }
}