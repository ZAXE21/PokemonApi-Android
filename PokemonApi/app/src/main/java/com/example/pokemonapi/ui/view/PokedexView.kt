
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
import com.example.pokemonapi.databinding.ActivityPokedexViewBinding
import com.example.pokemonapi.ui.adapter.PokemonAdapter
import com.example.pokemonapi.ui.viewmodel.PokemonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PokedexView : AppCompatActivity(), PokemonAdapter.OnClickPokemon {
    private lateinit var binding: ActivityPokedexViewBinding
    private lateinit var viewModel: PokemonViewModel

    companion object{
         enum class Region{Kanto,Johto,Hoen,Sinnoh}
    }

    private var currentRegion: Region? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[PokemonViewModel::class.java]
        binding = ActivityPokedexViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
        // getInfoPokemon()
    }

    private fun setUp() {
        initBundle()
        init()
        observers()
    }
    private fun initBundle() {
      intent?.let { extras->
          var nameRegion = extras.getStringExtra(MainActivity.INTENT_REGION)
          if(nameRegion.isNullOrEmpty()){
              nameRegion = getString(
                  R.string.kanto)
          }
          currentRegion = getRegion(nameRegion)
          Log.i("AA: REGION", nameRegion.toString())
      }
    }

    private fun getRegion(nameRegion: String): Region {
        return when(nameRegion){
            getString(R.string.kanto) -> {
                Region.Kanto
            }
            getString(R.string.johto) -> {
                Region.Johto
            }
            getString(R.string.hoenn) -> {
                Region.Hoen
            }
            getString(R.string.sinnoh) -> {
                Region.Sinnoh
            }
            else -> {
                Region.Kanto
            }
        }
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
                //  binding.root.setBackgroundColor(getColor(R.color.background))
                binding.progressBar.visibility = View.VISIBLE
            }else{
                // binding.root.setBackgroundColor(getColor(R.color.background))
                binding.progressBar.visibility = View.GONE
                binding.rvPokemon.visibility = View.VISIBLE
            }
        }
    }

    private fun init() {
        //viewModel.onCreate()
        viewModel.onCreateByRegion(currentRegion)
    }

    private fun showError() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show()
    }

    override fun onClickItem(item: PokemonData) {
    }

}