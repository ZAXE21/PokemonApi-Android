package com.example.pokemonapi.ui.view

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
import com.example.pokemonapi.ui.viewmodel.PokemonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), PokemonAdapter.OnClickPokemon {

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
               val adapter = PokemonAdapter(listPokemon as MutableList<PokemonData>,this)
               val layoutPokemon: RecyclerView.LayoutManager = LinearLayoutManager(
                   this,
                   LinearLayoutManager.VERTICAL,
                   false
               )
               binding.rvPokemon.layoutManager = layoutPokemon
               binding.rvPokemon.adapter = adapter
           }
       }
    }

    private fun observerLoading() {
        viewModel.isLoading.observe(this){ loading->
            if(loading){
                binding.root.setBackgroundColor(getColor(R.color.background))
                binding.progressBar.visibility = View.VISIBLE
            }else{
                binding.root.setBackgroundColor(getColor(R.color.background))
                binding.progressBar.visibility = View.GONE
                binding.rvPokemon.visibility = View.VISIBLE
            }
        }
    }

    private fun init() {
        viewModel.onCreate()
    }

    private fun showError() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show()
    }

    override fun onClickItem(item: PokemonData) {
    }

}