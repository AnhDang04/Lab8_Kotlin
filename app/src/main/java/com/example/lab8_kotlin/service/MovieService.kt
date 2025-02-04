package com.example.lab8_kotlin.service


import com.example.lab8_kotlin.model.MovieRequest
import com.example.lab8_kotlin.model.StatusResponse
import com.example.lab8_kotlin.response.MovieResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface MovieService {
    @GET("Film")
    suspend fun getListFilms(): Response<List<MovieResponse>>

    @GET("Film/{id}")
    suspend fun getFilmDetail(@Path("id") id: String): Response<MovieResponse>

    @POST("Film")
    suspend fun addFilm(@Body filmRequest: MovieRequest): Response<StatusResponse>

    @PUT("Film/{id}")
    suspend fun updateFilm(
        @Path("id") id: String,
        @Body filmRequest: MovieRequest
    ): Response<StatusResponse>

    @DELETE("Film/{id}")
    suspend fun deleteFilm(@Path("id") id: String): Response<StatusResponse>
}
