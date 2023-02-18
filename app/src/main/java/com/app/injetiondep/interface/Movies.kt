package com.app.injetiondep.`interface`

import com.app.injetiondep.model.Filme
import kotlinx.coroutines.flow.Flow

interface Movies {

   suspend fun getMoviesCoroutines() : Flow<List<Filme>>

}