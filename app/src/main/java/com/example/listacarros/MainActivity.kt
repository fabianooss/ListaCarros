package com.example.listacarros

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import com.example.listacarros.domain.Carro

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = listOf(
            Carro(1, "Fusca", 1979),
            Carro(2, "Corcel", 1983),
            Carro(3, "Chevette", 1980),
            Carro(4, "Kombi", 1980),
            Carro(5, "Fiat 147", 1980)
        )

        val listaCarro = findViewById<RecyclerView>(R.id.listaCarros)
        listaCarro.adapter = CarroAdapter(dataset)
//        listaCarro.layoutManager = LinearLayoutManager(this,
//            LinearLayoutManager.VERTICAL, false)
        listaCarro.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
    }
}
