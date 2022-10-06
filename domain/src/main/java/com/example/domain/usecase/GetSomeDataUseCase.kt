package com.example.domain.usecase

import com.example.domain.model.GetSomeDataModel
import com.example.domain.repo.GetSomeDataRepo
import javax.inject.Inject

interface GetSomeDataUseCase {
    suspend fun getSomeData(): GetSomeDataModel
}

class GetSomeDataUseCaseImpl @Inject constructor(
    private val getSomeDataRepo: GetSomeDataRepo
): GetSomeDataUseCase {
    override suspend fun getSomeData(): GetSomeDataModel {
        return getSomeDataRepo.getSomeData()
    }
}