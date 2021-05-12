package com.example.plannerbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnLogin : Button

class Telalogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telalogin)
        carregarElemento()
        carregarTela()
    }

    fun carregarElemento(){
        btnLogin = findViewById(R.id.button_login)
    }
    fun carregarTela(){
        btnLogin.setOnClickListener{
            val login = Intent(this, Telainicial::class.java)
            startActivity(login)
        }
    }
}