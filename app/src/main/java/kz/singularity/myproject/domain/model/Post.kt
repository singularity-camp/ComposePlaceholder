package kz.singularity.myproject.domain.model

data class Post(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)

//Domain :${NAME}
//Server: ${NAME}Remote
//DB:     ${NAME}Entity