package com.example.pokemonapi.ui.router

import android.content.Context
import android.content.Intent
import com.example.pokemonapi.ui.view.MainActivity
import com.example.pokemonapi.ui.view.PokedexView

class RouterPokedexView (private val region: String): BaseActivityRouter {
    override fun intent(activity: Context): Intent = Intent(activity, PokedexView::class.java).apply {
        putExtra(MainActivity.INTENT_REGION, region)
    }
}