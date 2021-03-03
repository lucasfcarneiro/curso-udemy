package com.example.list_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val locations = listOf(
        "Angra dos Reis", "Caldas Novas", "Campos do Jordão",
        "Ilhéus", "Porto Seguro", "Tiradentes", "Serra Talhada",
        "Santiago", "Cancún", "Los Angeles", "Paris", "Miami",
        "Betim", "Belo Horizonte", "Barcelona", "Madrid", "Berlim"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create adapter to listview
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, locations)

        //add adapter to listview
        mainListView.adapter = adapter

        //add click to listview
        AdapterView.OnItemClickListener { parent, view, position, id ->
            val value = parent.getItemAtPosition(position)
            Toast.makeText(this, "$value", Toast.LENGTH_LONG).show()
        }

    } //funçoes


}


