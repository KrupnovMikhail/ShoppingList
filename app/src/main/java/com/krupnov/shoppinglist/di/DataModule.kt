package com.krupnov.shoppinglist.di

import android.app.Application
import com.krupnov.shoppinglist.data.AppDatabase
import com.krupnov.shoppinglist.data.ShopListDao
import com.krupnov.shoppinglist.data.ShopListRepositoryImpl
import com.krupnov.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}