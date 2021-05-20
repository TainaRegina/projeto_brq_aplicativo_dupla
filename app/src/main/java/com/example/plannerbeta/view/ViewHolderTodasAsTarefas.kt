package com.example.plannerbeta.view

import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R


class ViewHolderTodasTarefas(itemView: View) : RecyclerView.ViewHolder(itemView) {


    open class ViewHolderTodasAsTarefas(itemView: View, private val onClick: TodasAsTarefas?
    ) : RecyclerView.ViewHolder(itemView), View.OnClickListener {


        var textViewTitulo: TextView
        var textViewStatus: TextView
        var textViewDescrição: TextView
      //  var spinnerClassificacao: Spinner


        init {
            textViewTitulo = itemView.findViewById(R.id.textView_titulo)
            textViewStatus = itemView.findViewById(R.id.textView_status)
            textViewDescrição = itemView.findViewById(R.id.textView_titulo)
           // spinnerClassificacao = itemView.findViewById(R.id.spinner2)

            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            onClick?.onClickItem(v, adapterPosition)
        }
    }
}
