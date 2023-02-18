package com.app.injetiondep.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.injetiondep.model.Filme
import com.app.injetiondep.repository.MainRepository
import com.app.injetiondep.repository.MainRepositoryImplementatioon
import com.app.injetiondep.usecase.MoviesUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {

    private val _filmesLiveData : MutableLiveData<List<Filme>> = MutableLiveData()
    val filmesLiveData : LiveData<List<Filme>>
    get() = _filmesLiveData

    fun getFilmesCoroutines(){
     CoroutineScope(Dispatchers.Main).launch {
         val movies = withContext(Dispatchers.Default){
             repository.getFimesCoroutines()
         }
         _filmesLiveData.value = movies
     }
    }

}