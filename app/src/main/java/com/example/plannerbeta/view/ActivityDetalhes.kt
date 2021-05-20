package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.*
import com.example.plannerbeta.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

lateinit var btnsalvar: Button


class ActivityDetalhes(var tarefa: Tarefas? = null, var editTextTituloDetalhes: EditText? = null, var editTextDescricaoDetalhes: EditText? = null)
    : AppCompatActivity(), Parcelable {


    constructor(parcel: Parcel) : this(
           // parcel.readString(),
            //parcel.readValue(Int::class.java.classLoader) as Int
    ) {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        fun saveDetalhes(detalhes: ActivityDetalhes) {

            val intent = Intent(this, TodasAsTarefas::class.java)
            intent.putExtra("telaterefa", detalhes)
        }


       // tarefa = intent.getSerializableExtra("parametro_Objeto") as Tarefas
        editTextTituloDetalhes = findViewById(R.id.editText_detalhes_titulo)
        editTextDescricaoDetalhes = findViewById(R.id.editText_detalhes_descrição)
        editTextDescricaoDetalhes?.setText(tarefa?.descricao)
        editTextTituloDetalhes?.setText(tarefa?.titulo)
    }

    private fun notifyLista() {
        notifyDataSetChanged()
    }


    // todas as funções para salvar dado em outra tela

    private fun notifyDataSetChanged() {
        TODO("Not yet implemented")
    }


    fun saveTarefa(index: Int) {
        btnsalvar.setOnClickListener(this)
        notifyLista()
    }


        fun onClick(p0: View) {
            when (p0?.id) {
                btnsalvar.id -> {
                    Toast(this, "Tarefa Salva")
                }
            }

            fun Button.setOnClickListener(activityDetalhes: ActivityDetalhes) {
                TODO("Not yet implemented")

        }
    }

    private fun Button.setOnClickListener(activityDetalhes: ActivityDetalhes) {
        TODO("Not yet implemented")
    }

    private fun Toast(activityDetalhes: ActivityDetalhes, s: String) {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ActivityDetalhes> {
        override fun createFromParcel(parcel: Parcel): ActivityDetalhes {
            return ActivityDetalhes(parcel)
        }

        override fun newArray(size: Int): Array<ActivityDetalhes?> {
            return arrayOfNulls(size)
        }
    }
}




