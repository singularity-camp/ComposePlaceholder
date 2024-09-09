package kz.singularity.myproject.data.mapper

import kz.singularity.myproject.data.remote.model.PostRemote
import kz.singularity.myproject.domain.model.Post
import javax.inject.Inject

class PostsMapper @Inject constructor() {
    fun toDomain(postRemote: PostRemote): Post {
        return Post(
            body = postRemote.body,
            title = postRemote.title,
            id = postRemote.id,
            userId = postRemote.userId
        )
    }
}