package com.example.plannerbeta.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import com.example.plannerbeta.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

lateinit var btnsalvar: Button


class ActivityDetalhes: AppCompatActivity() {
    var tarefa: Tarefas? = null
    var editTextTituloDetalhes: EditText? = null
    var editTextDescricaoDetalhes: EditText? = null
    val OnClick: AdapterTodasAsTarefas? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        //tarefa = intent.getSerializableExtra("parametro_Objeto") as Tarefas
        editTextTituloDetalhes = findViewById(R.id.editText_detalhes_titulo)
        editTextDescricaoDetalhes = findViewById(R.id.editText_detalhes_descrição)
        editTextDescricaoDetalhes?.setText(tarefa?.descricao)
        editTextTituloDetalhes?.setText(tarefa?.titulo)
    }

    private fun notifyLista() {
        notifyDataSetChanged()
    }

    private fun notifyDataSetChanged() {
        TODO("Not yet implemented")
    }

    fun saveTarefa(index: Int) {
        btnsalvar.setOnClickListener {
            notifyLista()


        }

    }
}