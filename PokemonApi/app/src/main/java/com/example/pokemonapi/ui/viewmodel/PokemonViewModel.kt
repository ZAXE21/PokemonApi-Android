package com.example.pokemonapi.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.domain.GetPokemonUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getAllPokemon: GetPokemonUseCase
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

}