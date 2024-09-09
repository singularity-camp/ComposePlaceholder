package kz.singularity.myproject.data.remote

import kz.singularity.myproject.data.remote.model.PostRemote
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<PostRemote>
}