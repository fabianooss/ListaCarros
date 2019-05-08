package com.example.listacarros

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.listacarros.domain.Carro

class CarroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(carro: Carro) {
        itemView.findViewById<TextView>(R.id.nomeCarro).text = carro.nome
        itemView.findViewById<TextView>(R.id.anoCarro).text = carro.ano.toString()
    }

}