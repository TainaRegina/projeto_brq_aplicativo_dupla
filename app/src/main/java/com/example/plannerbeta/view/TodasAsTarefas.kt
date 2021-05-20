package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R
import kotlin.text.contains as contains1


class TodasAsTarefas : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var buttonAdicionar: View? = null
    var buttonDeletar: View? = null
    lateinit var arrayNotas: ArrayList<Tarefas>
    var adapter: AdapterTodasAsTarefas? = null
    var editeTextFiltro: EditText? = null
    var Detalhes: View? = null

class TodasTarefas : AppCompatActivity(), ItemClickListener {

    var recyclerView: RecyclerView?=null
    lateinit var arrayNotas: ArrayList<Tarefas>
    var adapter: AdapterTodasAsTarefas? = null
    var editTextFiltro : EditText? = null
    lateinit var listaBase : ArrayList<Tarefas>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todastarefas)


// função salvar, para enviar dados de uma tela para outra
        Detalhes = intent.getParcelableExtra("detalhetarefa")!!
        Toast(this, "Tarefa Salva")

//
        carregarElemento()
        carregarArray()
        carregarEvento()


        AdapterTodasAsTarefas(this, arrayNotas, this).let {
            adapter = it
            recyclerView?.adapter = it
        }

        recyclerView?.layoutManager = LinearLayoutManager(this)

    }

    private fun Toast(todasAsTarefas: TodasTarefas, s: String) {

    }


    private fun AdapterTodasAsTarefas(context: TodasAsTarefas, arrayDeTarefas: java.util.ArrayList<Tarefas>): AdapterTodasAsTarefas {
        TODO("Not yet implemented")
    }


    fun carregarElemento() {
        recyclerView = findViewById(R.id.recyclerViewtarefas)
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

    fun carregarEvento(){

        editTextFiltro?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                println(s)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                println(s)
            }

            override fun afterTextChanged(s: Editable?) {

                val stringFiltro = s.toString()
                if (!stringFiltro.isNullOrEmpty()) {
                    val listFilter = arrayNotas.filter {
                        it.titulo.contains1(stringFiltro, true)

                        val listaFiltradaArrayList = arrayListOf<Tarefas>()


                        for (item in listFilter) {
                            listaFiltradaArrayList.add(item)

                        }
                        adapter?.update(listaFiltradaArrayList)
                    } else {
                        adapter?.update(listaBase)

                    }
                }
                })


    fun carregarElemento() {
        recyclerView = findViewById(R.id.recyclerView)
        editTextFiltro = findViewById(R.id.editText_filtro)



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

            arrayNotas.add(Tarefas("Desenvolvimento de app", "Criação de activity e .xml", "Em andamento"))
            arrayNotas.add(Tarefas("Desenvolvimento de app", "Criação de recycler View e .xml", "Concluido"))
            arrayNotas.add(Tarefas("Teste de Filtro", "Criação de recycler View e .xml", "Concluido"))

            listaBase = arrayListOf()
            listaBase.addAll(arrayNotas)

        }


        fun carregarEvento() {

            buttonAdicionar?.setOnClickListener {
                val todasAsTarefas = Intent(applicationContext, ActivityDetalhes::class.java)
                startActivity(todasAsTarefas)
            }



            fun onClickItem(view: View?, index: Int) {

                val intent = Intent(this, ActivityDetalhes::class.java)
                intent.putExtra("parametro_Titulo", arrayNotas[index].titulo)
                intent.putExtra("parametro_Objeto", arrayNotas[index])
                startActivity(intent)

            }
        }


            fun onClickItem(view: View?, index: Int) {
                TODO("Not yet implemented")

            }







