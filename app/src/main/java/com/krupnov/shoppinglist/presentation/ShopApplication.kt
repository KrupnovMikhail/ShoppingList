package com.krupnov.shoppinglist.presentation

import android.app.Application
import com.krupnov.shoppinglist.di.DaggerApplicationComponent

class ShopApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}