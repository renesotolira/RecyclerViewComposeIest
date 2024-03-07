package com.example.recyclerview.viewmodels

import androidx.lifecycle.ViewModel
import com.example.recyclerview.R
import com.example.recyclerview.models.Game

class GamesViewModel: ViewModel() {

    init {
        //constructor
    }

    fun getGameList() : ArrayList<Game>{
        val game:Game = Game("Resident Evil", 999, "PS1", R.drawable.resident01)
        var gameList:ArrayList<Game> = ArrayList<Game>() //lista vacia de Juegos
        gameList.add(game)
        // agregaremos nuestros juegos
        gameList.add( Game("Resident Evil 2", 1100, "PS2", R.drawable.resident02 )   )
        gameList.add( Game("Resident Evil 3", 1200, "PS3", R.drawable.resident03 )   )
        gameList.add( Game("Resident Evil 4", 1300, "PS4", R.drawable.resident04 )   )
        gameList.add( Game("Resident Evil 5", 1400, "PS4", R.drawable.resident05 )   )
        gameList.add( Game("Resident Evil 6", 1500, "PS5", R.drawable.resident06 )   )
        gameList.add( Game("Resident Evil 7", 1600, "Xbox", R.drawable.resident07 )   )
        gameList.add( Game("Resident Evil 8", 1700, "Nintendo Switch", R.drawable.resident08 )   )
        gameList.add( Game("Tales of Abyss", 500, "PS2", R.drawable.abyss )   )
        gameList.add( Game("Tales of Graces F", 750, "PS3", R.drawable.tales )   )
        ///
        return gameList //regresamos la lista de Juegos
    }

}