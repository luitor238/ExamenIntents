package com.example.examenintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DetailsActivity : AppCompatActivity() {

    var autor = findViewById<EditText>(R.id.editTextAutor)
    var anio = findViewById<EditText>(R.id.editTextAnio)
    var boton = findViewById<Button>(R.id.btnSiguiente)
    var botonVolver = findViewById<Button>(R.id.btnAniadir)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var libro = intent.getSerializableExtra("libro") as Libro
        var lista = intent.getStringArrayListExtra("lista")

        boton.setOnClickListener {
            libro.setAutor(autor.toString())
            libro.setAnio(anio.toString())
            val intent = Intent(this,DisplayActivity::class.java)
            intent.putExtra("libro2",libro)
            intent.putExtra("lista",lista)
            startActivity(intent)
        }

        botonVolver.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("lista",lista)
            startActivity(intent)
        }
    }
}