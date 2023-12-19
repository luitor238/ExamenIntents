package com.example.examenintents

import java.io.Serializable

class Libro (
    private var titulo:String,
    private var paginas:String
) : Serializable {
    private var autor :String =""
    private var anio :String =""

    fun getTitulo():String {
        return titulo
    }

    fun getPaginas():String{
        return paginas
    }

    fun getAutor():String{
        return autor
    }
    fun setAutor(nuevoAutor:String){
        this.autor=nuevoAutor
    }

    fun getAnio():String{
        return anio
    }
    fun setAnio(nuevoAnio:String){
        this.anio=nuevoAnio
    }

    override fun toString(): String {
        return "$titulo $paginas $autor $anio"
    }
}