package com.example.plannerbeta.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class AdapterTodasAsTarefas(
        var context: Context,
        var arrayDeTarefas : ArrayList<Tarefas>
): RecyclerView.Adapter<ViewHolderTodasAsTerefas>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTodasAsTerefas {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_lista_todas_as_tarefas, parent, false)
        return ViewHolderTodasAsTerefas(view)
    }

    override fun getItemCount(): Int {
        return arrayDeTarefas.size
    }

    override fun onBindViewHolder(holder: ViewHolderTodasAsTerefas, position: Int) {
        arrayDeTarefas[position].apply {
            holder.editTextDescrcao.setText(this.descricao)
            holder.textViewStatus.text = status
            holder.textViewTitulo.text = titulo
        }
    }
}