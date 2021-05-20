package com.example.plannerbeta.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

interface ItemClickListener {
    val recyclerView: RecyclerView?
    val arrayNotas: ArrayList<Tarefas>
    var editeTextFiltro: Any
    var buttonAdicionar: Any
    var Detalhes: Any

    fun onClickButtonDelete(view: View?, index: Int)
    fun onClickItem(position: View?, adapterPosition: Int)
    fun carregarArray()
    fun carregarEvento()
    fun carregarElemento()


}
