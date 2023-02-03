package com.example.pokemonapi.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.domain.GetPokedexUseCase
import com.example.pokemonapi.domain.GetPokemonUseCase
import com.example.pokemonapi.ui.view.PokedexView
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getAllPokemon: GetPokemonUseCase,
    private val getPokedexByRegion: GetPokedexUseCase
): ViewModel() {

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading get() = _isLoading

    private val _pokemonData = MutableLiveData<List<PokemonData>>()
    val pokemonData get() = _pokemonData

    fun onCreate(){
        viewModelScope.launch {
            _isLoading.postValue(true)
            val result = getAllPokemon()
            if(!result.isNullOrEmpty()){
                _pokemonData.postValue(result)
                _isLoading.postValue(false)
            }
        }
    }

    fun onCreateByRegion(currentRegion: PokedexView.Companion.Region?) {
        viewModelScope.launch {
            currentRegion?.let { region ->
                _isLoading.postValue(true)
                when(region){
                    PokedexView.Companion.Region.Kanto->{
                        getPokedexByRegion(26)
                    }
                    PokedexView.Companion.Region.Johto->{
                        getPokedexByRegion(7)
                    }
                    PokedexView.Companion.Region.Hoen->{
                        getPokedexByRegion(15)

                    }
                    PokedexView.Companion.Region.Sinnoh->{
                        getPokedexByRegion(6)

                    }
                }
            }
        }


    }

    private suspend fun getPokedexByRegion(id: Int) {
        val result = getPokedexByRegion.invoke(id)
        if (!result.isNullOrEmpty()) {
            _pokemonData.postValue(result)
            _isLoading.postValue(false)
        }
    }

}