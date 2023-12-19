package com.example.examenintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var titulo = findViewById<EditText>(R.id.editTextTitulo)
    var paginas = findViewById<EditText>(R.id.editTextPaginas)
    var boton = findViewById<Button>(R.id.btnSiguiente)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista = intent.getStringArrayListExtra("lista")

        boton.setOnClickListener {
            var libro = Libro(titulo.toString(), paginas.toString())
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("Libro", libro)
            intent.putExtra("lista",lista)
            startActivity(intent)
        }
    }
}

