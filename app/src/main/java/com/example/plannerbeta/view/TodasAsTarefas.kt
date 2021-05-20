package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class TodasAsTarefas : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var buttonAdicionar: View? = null
    var buttonDeletar: View? = null
    lateinit var arrayNotas: ArrayList<Tarefas>
    var adapter: AdapterTodasAsTarefas? = null
    var editeTextFiltro: EditText? = null
    var Detalhes: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todastarefas)


// função salvar, para enviar dados de uma tela para outra
        Detalhes = intent.getParcelableExtra("detalhetarefa")
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

    private fun Toast(todasAsTarefas: TodasAsTarefas, s: String) {


    }


    private fun AdapterTodasAsTarefas(context: TodasAsTarefas, arrayDeTarefas: java.util.ArrayList<Tarefas>): AdapterTodasAsTarefas {
        TODO("Not yet implemented")
    }



    fun carregarElemento() {
        recyclerView = findViewById(R.id.recyclerView)
        buttonAdicionar = findViewById(R.id.button_add)
        editeTextFiltro = findViewById(R.id.editText_filtro)

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

        buttonAdicionar?.setOnClickListener {
            val todasAsTarefas = Intent(applicationContext, ActivityDetalhes::class.java)
            startActivity(todasAsTarefas)
        }


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







