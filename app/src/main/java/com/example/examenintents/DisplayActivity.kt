package com.example.examenintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {

    var vista = findViewById<TextView>(R.id.textViewLibros)
    var boton = findViewById<Button>(R.id.btnAniadir)
    var lista :ArrayList<String> = {" "} //No se hacer una ArrayList :(


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        var libro = intent.getSerializableExtra("libro") as Libro
        lista = intent.getStringArrayListExtra("lista")
        lista.add(libro.toString())

        vista.text = " "

        for(e in lista){
            vista.text=vista.toString() + (e)
        }

        boton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("lista",lista)
            startActivity(intent)
        }


    }
}