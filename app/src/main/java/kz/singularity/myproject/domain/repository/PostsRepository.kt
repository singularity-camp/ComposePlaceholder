package kz.singularity.myproject.domain.repository

import kz.singularity.myproject.domain.model.Post

interface PostsRepository {
    suspend fun getPosts(): List<Post>
    //suspend fun getPostDetails(id: Int): PostDetails
}