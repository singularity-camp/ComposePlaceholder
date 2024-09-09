package kz.singularity.myproject.data.use_case

import kz.singularity.myproject.domain.model.Post
import kz.singularity.myproject.domain.repository.PostsRepository
import kz.singularity.myproject.domain.use_case.GetPostsUseCase
import javax.inject.Inject

class GetPostsUseCaseImpl @Inject constructor(
    private val postsRepository: PostsRepository
) : GetPostsUseCase {
    override suspend fun invoke(): List<Post> {
        return postsRepository.getPosts()
    }
}