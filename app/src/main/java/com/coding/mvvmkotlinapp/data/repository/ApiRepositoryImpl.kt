package com.coding.mvvmkotlinapp.data.repository

import com.coding.mvvmkotlinapp.domain.model.ChampionResponseModel
import com.coding.mvvmkotlinapp.domain.repository.ApiRepository
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.ktor.getApiResponse
import io.ktor.client.HttpClient

class ApiRepositoryImpl(
    private val httpClient: HttpClient
) : ApiRepository {

    companion object {
        const val baseUrl = "https://ddragon.leagueoflegends.com/cdn/15.1.1/data/en_US/"
    }

    override suspend fun getAllChampions(): ApiResponse<ChampionResponseModel> =
        httpClient.getApiResponse("champion.json")

    override suspend fun getChampionByName(name: String): ApiResponse<ChampionResponseModel> =
        httpClient.getApiResponse("$name.json")
}