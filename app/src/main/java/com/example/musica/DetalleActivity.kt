package com.example.musica

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.musica.databinding.ActivityDetalleBinding
import com.example.musica.databinding.ActivityMainBinding

class DetalleActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityDetalleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityDetalleBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
       cargarDetalle()

    }
    private fun cargarDetalle(){
        var nombre: String= intent.getStringExtra("album").toString()
        var fecha: String= intent.getStringExtra("fecha").toString()
        var foto= intent.getStringExtra("imagen")
        binding.imvfoto.loadImage(foto.toString())
        binding.txtnombre.text=nombre
        binding.txtfecha.text=fecha


    }
    fun ImageView.loadImage(url:String){
        Glide.with(context).load(url).into(this)
    }
}