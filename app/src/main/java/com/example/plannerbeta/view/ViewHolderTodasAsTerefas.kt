package com.example.plannerbeta.view

import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class ViewHolderTodasAsTerefas(itemView: View, private val onClick: ItemClickListener?) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

     var textViewTitulo : TextView
     var textViewStatus: TextView
     var editTextDescrcao: EditText
     var spinnerClassificacao: Spinner


    init {
        textViewTitulo = itemView.findViewById(R.id.textView_titulo)
        textViewStatus = itemView.findViewById(R.id.textView_status)
        editTextDescrcao = itemView.findViewById(R.id.editTextText_descricao)
        spinnerClassificacao = itemView.findViewById(R.id.spinner2)

        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        onClick?.onClickItem(v, adapterPosition)
    }
}
interface ItemClickListener {

    fun onClickItem(view: View?, index: Int)
}