package kz.singularity.myproject.domain.use_case

import kz.singularity.myproject.domain.model.Post

interface GetPostsUseCase {
    suspend fun invoke(): List<Post>
}