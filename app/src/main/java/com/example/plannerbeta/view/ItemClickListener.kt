package com.example.plannerbeta.view

import android.view.View

interface ItemClickListener {
    fun onClickButtonDelete(view: View?, index: Int)
    fun onClickItem(position: Int)


}
