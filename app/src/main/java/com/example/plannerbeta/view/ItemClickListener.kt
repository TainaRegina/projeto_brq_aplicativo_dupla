package com.example.plannerbeta.view

import android.view.View

interface ItemClickListener {
    var editeTextFiltro: Any
    var buttonAdicionar: Any
    var Detalhes: Any

    fun onClickButtonDelete(view: View?, index: Int)
    fun onClickItem(position: View?, adapterPosition: Int)
    fun carregarArray()
    fun carregarEvento()


}
