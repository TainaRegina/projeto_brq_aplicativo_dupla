package com.example.plannerbeta.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.plannerbeta.R
import com.example.plannerbeta.R.array.status

class ActivityDetalhes: AppCompatActivity(), AdapterView.OnItemSelectedListener {


    var tarefa: Tarefas? = null
    var editTextTituloDetalhes: EditText? = null
    var editTextDescricaoDetalhes: EditText? = null
    var editTextStatusDetalhes: EditText? = null
    var textViewChoose: TextView? = null
    var escolhaStatus = arrayOf("A realizar", "Em andamento", "Concluido", "Atrasado")
    var spinner = findViewById<Spinner>(R.id.spinner)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        carregarElemento()
        atribuirValoremET()
        carregarSpinnerEAdapter()

    }

    fun carregarElemento() {
        editTextTituloDetalhes = findViewById(R.id.editText_detalhes_titulo)
        editTextDescricaoDetalhes = findViewById(R.id.editText_detalhes_descrição)
        editTextStatusDetalhes = findViewById(R.id.editText_statusDetalhes)
        textViewChoose = findViewById(R.id.escolha_tv)
    }

    fun atribuirValoremET() {
        tarefa = intent.getSerializableExtra("parametro_Objeto") as Tarefas
        editTextDescricaoDetalhes?.setText(tarefa?.descricao)
        editTextTituloDetalhes?.setText(tarefa?.titulo)
        editTextStatusDetalhes?.setText(tarefa?.status)


    }
   // SaveData.Tarefa = Tarefas(editTextDescricaoDetalhes?.text.toString(), editTextTituloDetalhes?.text.toString(), editTextStatusDetalhes?.text.toString())

    fun carregarSpinnerEAdapter() {
        spinner.onItemSelectedListener = this
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, escolhaStatus)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        textViewChoose?.text = "Selecione" + escolhaStatus[position]
    }

}