package dev.gracie.postsapp.repository

import dev.gracie.postsapp.api.ApiInterface
import dev.gracie.postsapp.model.Posts

class PostsRepository (val apiService: ApiInterface.ApiService){
        suspend fun getPosts(): List<Posts> {
            return apiService.getPosts()
        }


}