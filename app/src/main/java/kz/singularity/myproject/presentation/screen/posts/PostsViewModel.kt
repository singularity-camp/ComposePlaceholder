package kz.singularity.myproject.presentation.screen.posts

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kz.singularity.myproject.domain.model.Post
import kz.singularity.myproject.domain.use_case.GetPostsUseCase
import javax.inject.Inject

data class PostsState(
    val isLoading: Boolean = true,
    val posts: List<Post> = emptyList(),
)

@HiltViewModel
class PostsViewModel @Inject constructor(
    private val getPostsUseCase: GetPostsUseCase
): ViewModel() {

    private val _state = MutableStateFlow(PostsState())
    val state: StateFlow<PostsState> = _state

    init {
        viewModelScope.launch {
            val newPosts = getPostsUseCase.invoke()
            _state.value = _state.value.copy(isLoading = false, posts = newPosts)

        }
    }

}