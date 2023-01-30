package com.example.pokemonapi.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pokemonapi.R
import com.example.pokemonapi.data.model.InfoPokemon
import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.data.network.APIService
import com.example.pokemonapi.databinding.ActivityMainBinding
import com.example.pokemonapi.ui.viewmodel.PokemonViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: PokemonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[PokemonViewModel::class.java]
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
       // getInfoPokemon()
    }

    private fun setUp() {
        observers()
        init()
    }

    private fun observers() {
        observerLoading()
        observerGetAllPokemon()
    }

    private fun observerGetAllPokemon() {
       viewModel.pokemonData.observe(this){ listPokemon->
           if(!listPokemon.isNullOrEmpty()){
                Log.i("AAAAAAA: ", listPokemon.toString())
           }
       }
    }

    private fun observerLoading() {
        viewModel.isLoading.observe(this){ loading->
            if(loading){
                binding.root.setBackgroundColor(getColor(R.color.teal_200))
                binding.progressBar.visibility = View.VISIBLE
            }else{
                binding.root.setBackgroundColor(getColor(R.color.purple_700))
                binding.progressBar.visibility = View.GONE
            }
        }
    }

    private fun init() {
        viewModel.onCreate()
    }

    private fun showError() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show()
    }

}