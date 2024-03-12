package com.example.recyclerview.views

import com.example.recyclerview.R
import com.example.recyclerview.models.Game

fun gameList(): ArrayList<Game>{
    val game: Game = Game("Resident Evil", 1600, "PS4", R.drawable.resident02)
    var gameList:ArrayList<Game> = ArrayList<Game>()
    gameList.add(game)

    gameList.add(Game("Forza Horizon 1",1100, "Xbox One 360", R.drawable.resident01))

    return gameList



}