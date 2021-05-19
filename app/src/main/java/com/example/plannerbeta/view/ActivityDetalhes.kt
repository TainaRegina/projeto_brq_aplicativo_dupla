package com.example.plannerbeta.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import com.example.plannerbeta.R

class ActivityDetalhes: AppCompatActivity() {


    var tarefa: Tarefas? = null
    var editTextTituloDetalhes : EditText? = null
    var editTextDescricaoDetalhes : EditText? = null
    var editTextStatusDetalhes : EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)


        tarefa = intent.getSerializableExtra("parametro_Objeto") as Tarefas

        editTextTituloDetalhes = findViewById(R.id.editText_detalhes_titulo)
        editTextDescricaoDetalhes = findViewById(R.id.editText_detalhes_descrição)
        editTextStatusDetalhes = findViewById(R.id.editText_statusDetalhes)

        editTextDescricaoDetalhes?.setText(tarefa?.descricao)
        editTextTituloDetalhes?.setText(tarefa?.titulo)
        editTextStatusDetalhes?.setText(tarefa?.status)

        SaveData.Tarefa = Tarefas(editTextDescricaoDetalhes?.text.toString(), editTextTituloDetalhes?.text.toString(), editTextStatusDetalhes?.text.toString())
    }

}

