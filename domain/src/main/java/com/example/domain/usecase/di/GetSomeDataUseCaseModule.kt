package com.example.domain.usecase.di

import com.example.domain.repo.GetSomeDataRepo
import com.example.domain.usecase.GetSomeDataUseCase
import com.example.domain.usecase.GetSomeDataUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class GetSomeDataUseCaseModule {

    @Provides
    @ViewModelScoped
    fun provideGetSomeDataUseCase(getSomeDataRepo: GetSomeDataRepo): GetSomeDataUseCase {
        return GetSomeDataUseCaseImpl(getSomeDataRepo)
    }
}