package com.example.data.repoimpl.di

import com.example.data.repoimpl.GetSomeDataRepoImpl
import com.example.domain.repo.GetSomeDataRepo
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class GetSomeDataRepoModule {

    @Provides
    @ViewModelScoped
    fun provideGetSomeData(): GetSomeDataRepo {
        return GetSomeDataRepoImpl()
    }
}