package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Singleton


@Module
@InstallIn(ActivityRetainedComponent::class)
object MainViewModelModule {

    @Provides
     fun getFakeFirebase(): FakeFirebase {
        return FakeFirebase.getInstance()
    }
}


@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class MainViewModelModule2 {
    
    @Binds
    abstract fun getRepo(repo: DefaultRepository): IRepository
}