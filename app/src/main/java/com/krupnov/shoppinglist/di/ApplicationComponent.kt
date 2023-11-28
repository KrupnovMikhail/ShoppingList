package com.krupnov.shoppinglist.di

import android.app.Activity
import android.app.Application
import com.krupnov.shoppinglist.data.ShopListProvider
import com.krupnov.shoppinglist.presentation.MainActivity
import com.krupnov.shoppinglist.presentation.ShopItemFragment
import dagger.Binds
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(fragment: ShopItemFragment)

    fun inject(provider: ShopListProvider)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}