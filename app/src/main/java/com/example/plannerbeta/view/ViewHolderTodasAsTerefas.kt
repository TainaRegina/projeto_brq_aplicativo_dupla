package com.example.plannerbeta.view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

open class ViewHolderTodasAsTerefas(itemView: View, private val onClick: ItemClickListener?) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

     var textViewTitulo : TextView
     var textViewStatus: TextView
     var textViewDescrição: TextView


    init {
        textViewTitulo = itemView.findViewById(R.id.textView_titulo)
        textViewStatus = itemView.findViewById(R.id.textView_status)
        textViewDescrição = itemView.findViewById(R.id.textView_titulo)

        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        onClick?.onClickItem(v, adapterPosition)
    }
}
