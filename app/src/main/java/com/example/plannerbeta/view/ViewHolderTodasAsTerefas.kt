package com.example.plannerbeta.view

import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class ViewHolderTodasAsTerefas(itemView: View) : RecyclerView.ViewHolder(itemView) {

     var textViewTitulo : TextView
     var textViewStatus: TextView
     var editTextDescrcao: EditText
     var spinnerClassificacao: Spinner

    init {
        textViewTitulo = itemView.findViewById(R.id.textView_titulo)
        textViewStatus = itemView.findViewById(R.id.textView_status)
        editTextDescrcao = itemView.findViewById(R.id.editTextText_descricao)
        spinnerClassificacao = itemView.findViewById(R.id.spinner2)
    }
}