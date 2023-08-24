package dev.gracie.postsapp.api

import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    interface ApiService {
        @GET("posts")
        suspend fun getPosts(): List<POST>
    }

}