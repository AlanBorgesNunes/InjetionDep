package com.app.injetiondep.repository

import com.app.injetiondep.model.Filme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class MainRepository {

    suspend fun getFimesCoroutines(): List<Filme>{
       return withContext(Dispatchers.Default){
            delay(4000)
            listOf(
                Filme(1, "A casa de cera"),
                Filme(2, "Amor e ódio")
            )
        }
    }


}