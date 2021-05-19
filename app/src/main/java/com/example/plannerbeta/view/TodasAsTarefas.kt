package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class TodasTarefas : AppCompatActivity(), ItemClickListener {
    var recyclerView: RecyclerView? = null
    lateinit var buttonSalvar: Button
    lateinit var arrayNotas: ArrayList<Tarefas>
    var adapter: AdapterTodasAsTarefas? = null
    var editeTextFiltro: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todastarefas)

        carregarElemento()
        carregarArray()

        AdapterTodasAsTarefas(this, arrayNotas, this).let {
            adapter = it
            recyclerView?.adapter = it
        }

        recyclerView?.layoutManager = LinearLayoutManager(this)
    }

//    fun carregarEvento(){
//
//        editeTextFiltro?.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                println(s)
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                println(s)
//            }
//
//            override fun afterTextChanged(s: Editable?) {
//
//                val stringFiltro = s.toString()
//                arrayNotas.filter {
//                    it.contains(Status, true)
//                }
//            }
//        })
//    }

    fun carregarElemento() {
        recyclerView = findViewById(R.id.recyclerView)
        buttonSalvar = findViewById(R.id.button_salvar)
        editeTextFiltro = findViewById(R.id.editText_filtro)
    
}

    fun carregarArray() {
        arrayNotas = ArrayList()
        arrayNotas.add(Tarefas("Desenvolvimento de app", "Criação de activity e .xml", "Em andamento"))
        arrayNotas.add(Tarefas("Desenvolvimento de app", "Criação de recycler View e .xml", "Concluido"))
    }

    override fun onClickItem(view: View?, index: Int) {

        val intent = Intent(this, ActivityDetalhes::class.java)
        intent.putExtra("parametro_Titulo", arrayNotas[index].titulo)
        intent.putExtra("parametro_Objeto", arrayNotas[index])
        startActivity(intent)
        }

    }
