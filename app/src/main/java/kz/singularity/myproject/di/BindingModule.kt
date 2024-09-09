package kz.singularity.myproject.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import kz.singularity.myproject.data.repository.PostsRepositoryImpl
import kz.singularity.myproject.data.use_case.GetPostsUseCaseImpl
import kz.singularity.myproject.domain.repository.PostsRepository
import kz.singularity.myproject.domain.use_case.GetPostsUseCase

@Module
@InstallIn(ViewModelComponent::class)
interface BindingModule {
    @Binds
    fun bindsGetPostsUseCase(impl: GetPostsUseCaseImpl): GetPostsUseCase

    @Binds
    fun bindsPostsRepository(impl: PostsRepositoryImpl): PostsRepository
}