package com.example.data.repoimpl.di

import com.example.domain.repo.GetSomeDataRepo

interface DataComponent {

    fun provideDataRepoImpl() : GetSomeDataRepo
}