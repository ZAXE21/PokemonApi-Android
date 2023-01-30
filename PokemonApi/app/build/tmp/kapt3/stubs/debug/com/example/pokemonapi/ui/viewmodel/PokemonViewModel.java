package com.example.pokemonapi.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/example/pokemonapi/ui/viewmodel/PokemonViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_pokemonData", "", "Lcom/example/pokemonapi/data/model/PokemonData;", "getAllPokemon", "Lcom/example/pokemonapi/domain/GetPokemonUseCase;", "getGetAllPokemon", "()Lcom/example/pokemonapi/domain/GetPokemonUseCase;", "setGetAllPokemon", "(Lcom/example/pokemonapi/domain/GetPokemonUseCase;)V", "isLoading", "()Landroidx/lifecycle/MutableLiveData;", "pokemonData", "getPokemonData", "onCreate", "", "app_debug"})
public final class PokemonViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.pokemonapi.data.model.PokemonData>> _pokemonData = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.pokemonapi.domain.GetPokemonUseCase getAllPokemon;
    
    public PokemonViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.pokemonapi.data.model.PokemonData>> getPokemonData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.domain.GetPokemonUseCase getGetAllPokemon() {
        return null;
    }
    
    public final void setGetAllPokemon(@org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.domain.GetPokemonUseCase p0) {
    }
    
    public final void onCreate() {
    }
}