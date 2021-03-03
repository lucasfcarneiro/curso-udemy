package com.example.card_view.adapter

import com.example.card_view.R

data class Post(
    val name: String,
    val subtitle: String,
    val image: Int
) {
    companion object {
        val DUMBLIST = listOf(
            Post(
                name = "Lucas Fagundes",
                subtitle = "#tbt Viagem topssima",
                image = R.drawable.imagem1
            ),
            Post(
                name = "Celia Marsil",
                subtitle = "Oia pamonha pamonha",
                image = R.drawable.imagem2
            ),
            Post(
                name = "Jose Lucio",
                subtitle = "Vai uma fake do bozo?",
                image = R.drawable.imagem3
            ),
            Post(
                name = "Lucas Fagundes",
                subtitle = "#tbt Viagem topssima",
                image = R.drawable.imagem4
            )

        )
    }
}
