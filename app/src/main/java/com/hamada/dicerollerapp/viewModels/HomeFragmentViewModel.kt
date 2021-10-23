package com.hamada.dicerollerapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hamada.dicerollerapp.model.data.Dice
import com.hamada.dicerollerapp.model.repository.Repository

class HomeFragmentViewModel:ViewModel(){

    private val _diceNumber=MutableLiveData<Dice>()
    val diceNumber:LiveData<Dice>
        get()=_diceNumber

    init {
        fetchDiceNumber()
    }

    fun fetchDiceNumber(){
        _diceNumber.postValue(Repository.getRandomNumber())
    }
}