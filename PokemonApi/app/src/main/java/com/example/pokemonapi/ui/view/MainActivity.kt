package com.example.pokemonapi.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapi.R
import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.databinding.ActivityMainBinding
import com.example.pokemonapi.ui.adapter.PokemonAdapter
import com.example.pokemonapi.ui.router.RouterPokedexView
import com.example.pokemonapi.ui.viewmodel.PokemonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    companion object{
        const val INTENT_REGION = "Intent_region"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
       // getInfoPokemon()
    }

    private fun setUp() {
        init()
    }

    private fun init() {
        binding.btnKanto.setOnClickListener {
         RouterPokedexView(getString(R.string.kanto)).launch(this)
        }
        binding.btnJohto.setOnClickListener {
            RouterPokedexView(getString(R.string.johto)).launch(this)
        }
        binding.btnHoenn.setOnClickListener {
            RouterPokedexView(getString(R.string.hoenn)).launch(this)
        }
        binding.btnSinnoh.setOnClickListener {
            RouterPokedexView(getString(R.string.sinnoh)).launch(this)
        }
    }

}