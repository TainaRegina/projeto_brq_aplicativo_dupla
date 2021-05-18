package com.example.plannerbeta.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import com.example.plannerbeta.R

class ActivityDetalhes : AppCompatActivity() {


    var tarefa: Tarefas? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)


        tarefa = intent.getSerializableExtra("parametro_Objeto") as Tarefas
        val textViewTitulo = findViewById<TextView>(R.id.textView_detalhes_titulo)
        textViewTitulo.text = tarefa?.titulo

    }

}