package com.hamada.dicerollerapp.model.repository

import com.hamada.dicerollerapp.model.data.Dice

object Repository{
    fun getRandomNumber()= Dice.values().random()
}