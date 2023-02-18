package com.app.injetiondep.di

import com.app.injetiondep.repository.MainRepository
import com.app.injetiondep.repository.MainRepositoryImplementatioon
import com.app.injetiondep.ui.main.MainViewModel
import com.app.injetiondep.usecase.MoviesUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val mainModule = module {

    factory {
       MainRepository()
    }
    viewModel {
        MainViewModel(
              get()
        )
    }
}


