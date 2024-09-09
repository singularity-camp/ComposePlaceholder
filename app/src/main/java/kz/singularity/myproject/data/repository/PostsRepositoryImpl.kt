package kz.singularity.myproject.data.repository

import kz.singularity.myproject.data.mapper.PostsMapper
import kz.singularity.myproject.data.remote.ApiService
import kz.singularity.myproject.domain.model.Post
import kz.singularity.myproject.domain.repository.PostsRepository
import javax.inject.Inject

class PostsRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val postsMapper: PostsMapper,
) : PostsRepository {

    override suspend fun getPosts(): List<Post> {
        return apiService.getPosts().map { postRemote -> postsMapper.toDomain(postRemote) }
    }
}