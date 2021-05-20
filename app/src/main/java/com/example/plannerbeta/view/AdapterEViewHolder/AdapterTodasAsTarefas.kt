package com.example.plannerbeta.view.AdapterEViewHolder

import android.content.Context
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R
import com.example.plannerbeta.view.Tarefas
import com.example.plannerbeta.view.TodasAsTarefas
import com.google.android.material.floatingactionbutton.FloatingActionButton

lateinit var btnadd: FloatingActionButton
lateinit var btndelete: FloatingActionButton

open class AdapterTodasAsTarefas(
        var context: Context,
        var arrayDeTarefas: ArrayList<Tarefas>,
        val OnClick: TodasAsTarefas? = null


): RecyclerView.Adapter<ViewHolderTodasTarefas.ViewHolderTodasAsTarefas>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTodasTarefas.ViewHolderTodasAsTarefas {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_lista_todas_as_tarefas, parent, false)
        return ViewHolderTodasTarefas.ViewHolderTodasAsTarefas(view, OnClick)
    }

    override fun getItemCount(): Int {
        return arrayDeTarefas.size
    }

    override fun onBindViewHolder(holder: ViewHolderTodasTarefas.ViewHolderTodasAsTarefas, position: Int) {
        arrayDeTarefas[position].apply {
            holder.textViewDescrição.setText(this.descricao)
            holder.textViewStatus.text = status.toString()
            holder.textViewTitulo.text = titulo.toString()
            holder.textViewStatus.text = this.status
            holder.textViewTitulo.text = this.titulo

        }

    }

    fun update(arrayDeTarefas: ArrayList<Tarefas>) {
        arrayDeTarefas.clear()
        arrayDeTarefas.addAll(arrayDeTarefas)
        notifyLista()
    }

    private fun notifyLista() {
        notifyDataSetChanged()
    }


    fun deleteTarefa(index: Int) {
        arrayDeTarefas.removeAt(index)
        notifyLista()

    }


    class ViewHolderTodasAsTarefas(itemView: View, private val nossaInterface: ItemClickListener?)
        : RecyclerView.ViewHolder(itemView), View.OnClickListener, View.OnLongClickListener {


        override fun onClick(v: View?) {
            nossaInterface?.onClickItem(v, adapterPosition)

        }


        interface ItemClickListener : Parcelable {
            fun onClickButtonDelete(view: View?, index: Int)
            fun onClickItem(v: View?, adapterPosition: Int) {
                TODO("Not yet implemented")
            }

        }

        override fun onLongClick(v: View?): Boolean {
            TODO("Not yet implemented")
        }
    }
}

