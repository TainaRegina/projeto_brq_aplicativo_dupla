package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class TodasAsTarefas : AppCompatActivity(), ItemClickListener {
        var recyclerView: RecyclerView? = null
        lateinit var buttonSalvar: FloatingActionButton
        lateinit var buttonAdicionar: FloatingActionButton
        lateinit var buttonDeletar: FloatingActionButton
        lateinit var arrayNotas: ArrayList<Tarefas>
        var adapter: AdapterTodasAsTarefas? = null
        var editeTextFiltro: EditText? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_todastarefas)

            carregarElemento()
            carregarArray()
            carregarEvento()



                AdapterTodasAsTarefas(this, arrayNotas, this).let {
                    adapter = it
                    recyclerView?.adapter = it
                }

                recyclerView?.layoutManager = LinearLayoutManager(this)
            }


            private fun AdapterTodasAsTarefas(context: TodasAsTarefas, arrayDeTarefas: java.util.ArrayList<Tarefas>): AdapterTodasAsTarefas {
                TODO("Not yet implemented")
            }

            fun carregarElemento() {
                recyclerView = findViewById(R.id.recyclerViewtarefas)
                buttonDeletar = findViewById(R.id.button_delete)
                buttonAdicionar = findViewById(R.id.button_add)
                editeTextFiltro = findViewById(R.id.editText_filtro)

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
//
                }

                fun carregarArray() {
                    arrayNotas = ArrayList()
                    arrayNotas.add(
                            Tarefas(
                                    "Desenvolvimento de app",
                                    "Criação de activity e .xml",
                                    "Em andamento"
                            )
                    )
                    arrayNotas.add(
                            Tarefas(
                                    "Desenvolvimento de app",
                                    "Criação de recycler View e .xml",
                                    "Concluido"
                            )
                    )
                }

                fun carregarEvento() {

                    buttonAdicionar.setOnClickListener {
                        Intent(applicationContext, TodasAsTarefas::class.java)
                    }

                    buttonDeletar.setOnClickListener {
                        val todasAsTarefas = Intent(this, TodasAsTarefas::class.java)
                        startActivity(todasAsTarefas)
                    }
                }

                override fun onClickItem(view: View?, index: Int) {

                    val intent = Intent(this, ActivityDetalhes::class.java)
                    intent.putExtra("parametro_Titulo", arrayNotas[index].titulo)
                    intent.putExtra("parametro_Objeto", arrayNotas[index])
                    startActivity(intent)
                }

            }

        fun onClickItem(view: View?, index: Int) {
            TODO("Not yet implemented")
        }


