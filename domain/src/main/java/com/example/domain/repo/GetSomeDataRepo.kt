package com.example.domain.repo

import com.example.domain.model.GetSomeDataModel

interface GetSomeDataRepo {

    suspend fun getSomeData(): GetSomeDataModel
}