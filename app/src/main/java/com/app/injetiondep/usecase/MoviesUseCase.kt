package com.app.injetiondep.usecase

import com.app.injetiondep.`interface`.Movies
import com.app.injetiondep.model.Filme
import com.app.injetiondep.repository.MainRepositoryImplementatioon
import kotlinx.coroutines.flow.Flow

class MoviesUseCase(
    private val repository: Movies
) {
    suspend operator fun invoke(): Flow<List<Filme>> =
        repository.getMoviesCoroutines()
}