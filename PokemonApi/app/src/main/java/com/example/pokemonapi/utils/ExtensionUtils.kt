package com.example.pokemonapi.utils

import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.pokemonapi.R

fun ImageView.loadUrl(url:String){
    if(url.isNotEmpty()){
        Glide.with(this.context)
            .load(url)
            .placeholder(R.drawable.placeholer)
            .into(this)
    }
}

fun TextView.setNamePokemon(id: String, name: String){
    if(id.isNotEmpty() && name.isNotEmpty()){
        val concatIdName = "#$id $name"
        this.text = concatIdName
    }
}