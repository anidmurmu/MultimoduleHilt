package com.example.data.repoimpl

import com.example.domain.model.GetSomeDataModel
import com.example.domain.repo.GetSomeDataRepo
import javax.inject.Inject

class GetSomeDataRepoImpl @Inject constructor(): GetSomeDataRepo {
    override suspend fun getSomeData(): GetSomeDataModel {
        return GetSomeDataModel("This is Anid Murmu")
    }
}