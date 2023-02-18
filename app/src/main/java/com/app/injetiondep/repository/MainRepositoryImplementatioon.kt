package com.app.injetiondep.repository

import com.app.injetiondep.`interface`.Movies
import com.app.injetiondep.model.Filme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext

class MainRepositoryImplementatioon():
    Movies {
    override suspend fun getMoviesCoroutines(): Flow<List<Filme>> = flow {
        withContext(Dispatchers.Main) {
            delay(4000)
            listOf(
                Filme(1, "A casa de cera"),
                Filme(2, "Amor e ódio")
            )
        }
    }
}