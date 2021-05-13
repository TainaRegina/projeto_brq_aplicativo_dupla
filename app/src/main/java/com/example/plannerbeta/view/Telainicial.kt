package com.example.plannerbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView

class Telainicial : AppCompatActivity() {
    lateinit var btniniciar: Button
    lateinit var btnandamento: Button
    lateinit var btnconcluido: Button
    lateinit var btnimportante: Button
    lateinit var btntarefas: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial)

        carregarElementos()
        carregarEventos()
    }

    fun carregarElementos() {
        btniniciar = findViewById(R.id.buttoniniciar)
        btnandamento = findViewById(R.id.buttonandamento)
        btnconcluido = findViewById(R.id.buttonconcluido)
        btnimportante = findViewById(R.id.buttonimportante)
        btntarefas = findViewById(R.id.buttontarefas)
    }

    private fun carregarEventos() {
        btniniciar.setOnClickListener {
            abrirTelaIniciar()
            val intent = Intent(this, Telainicial::class.java)
            startActivity(intent)
        }
    }

        private fun carregarEventos() {
            btnandamento.setOnClickListener {
                abrirTelaAndamento()
            }
        }

            private fun carregarEventos() {
                btnconcluido.setOnClickListener {
                    abrirTelaConcluido()
                }
            }

                private fun carregarEventos() {
                    btnimportante.setOnClickListener {
                        abrirTelaImportante()
                    }
                }

                    private fun carregarEventos() {
                        btntarefas.setOnClickListener {
                            abrirTelaTarefas()
                        }
                    }

                         fun abrirTelaIniciar() {
                             val intent = Intent(this, Telainicial::class.java)
                             startActivity(intent)
                         }

                         fun abrirTelaAndamento() {
                             val intent = Intent(this, Telainicial::class.java)
                             startActivity(intent)
                         }

                         fun abrirTelaConcluido() {
                             val intent = Intent(this, Telainicial::class.java)
                             startActivity(intent)
                         }

                         fun abrirTelaImportante() {
                             val intent = Intent(this, Telainicial::class.java)
                             startActivity(intent)
                         }

                         fun abrirTelaTarefas() {
                             val intent = Intent(this, Telainicial::class.java)
                             startActivity(intent)
                         }
                     }














