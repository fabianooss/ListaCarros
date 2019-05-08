package com.example.listacarros

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.listacarros.domain.Carro

class CarroAdapter(val dataset : List<Carro>) : RecyclerView.Adapter<CarroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item_carro, parent, false)
        return CarroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        holder.bind(dataset.get(position))
    }

}