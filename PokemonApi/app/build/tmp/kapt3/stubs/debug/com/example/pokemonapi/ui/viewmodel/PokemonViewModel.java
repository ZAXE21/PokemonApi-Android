package com.example.pokemonapi.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/example/pokemonapi/ui/viewmodel/PokemonViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllPokemon", "Lcom/example/pokemonapi/domain/GetPokemonUseCase;", "(Lcom/example/pokemonapi/domain/GetPokemonUseCase;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_pokemonData", "", "Lcom/example/pokemonapi/data/model/PokemonData;", "isLoading", "()Landroidx/lifecycle/MutableLiveData;", "pokemonData", "getPokemonData", "onCreate", "", "app_debug"})
public final class PokemonViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.pokemonapi.domain.GetPokemonUseCase getAllPokemon = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.pokemonapi.data.model.PokemonData>> _pokemonData = null;
    
    @javax.inject.Inject()
    public PokemonViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.domain.GetPokemonUseCase getAllPokemon) {
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
    
    public final void onCreate() {
    }
}