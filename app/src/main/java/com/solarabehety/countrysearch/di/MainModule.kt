package com.solarabehety.countrysearch.di

import android.content.Context
import com.solarabehety.countrysearch.ui.viewmodel.StringMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
internal object MainModule {

    @ViewModelScoped
    @Provides
    fun provideStringMapper(
        @ApplicationContext context: Context,
    ) = StringMapper(context.resources)

}