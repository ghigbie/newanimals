package com.trainingtrack.newanimals.viewmodel

import androidx.lifecycle.MutableLiveData
import com.trainingtrack.newanimals.model.Animal

class ListViewModel {

    val animals by lazy { MutableLiveData<List<Animal>>() }
    val loadError by lazy {MutableLiveData<Boolean>()}
    val loading by lazy {MutableLiveData<Boolean>}

    fun refresh(){

    }

    private fun getAnimals(){
        val a1 = Animal("alligator")
        val a2 = Animal("badger")
        val a3 = Animal("cow")
        val a4 = Animal("duck")
        val a5 = Animal("elephant")
        val a6 = Animal("flamingo")

        val animalList: ArrayList<Animal> = arrayListOf( a1, a2, a3 ,a4, a5, a6)
    }
}