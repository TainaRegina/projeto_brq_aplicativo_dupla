package com.example.plannerbeta.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class AdapterTodasTarefas(
        var context: Context,
        var arrayDeTarefas : ArrayList<Tarefas>,
        val onClick: (String)-> Unit
): RecyclerView.Adapter<ViewHolderTodasTerefas>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTodasTerefas {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_lista_todas_as_tarefas, parent, false)
        return ViewHolderTodasTerefas(view, onClick)
    }

    private fun ViewHolderTodasTerefas(itemView: View?, onClick: (String) -> Unit): ViewHolderTodasTerefas {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return arrayDeTarefas.size
    }

    override fun onBindViewHolder(holder: ViewHolderTodasTerefas, position: Int) {
        arrayDeTarefas[position].apply {
            holder.editTextDescrcao.setText(this.descricao)
            holder.textViewStatus.text = status
            holder.textViewTitulo.text = titulo
        }


    }
}

class ItemClickListener {

}
