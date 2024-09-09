package kz.singularity.myproject.presentation.screen.posts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

@Composable
fun PostsScreen(navController: NavController) {
    val vm = hiltViewModel<PostsViewModel>()
    val state by vm.state.collectAsStateWithLifecycle()

    PostsContent(state = state)
}