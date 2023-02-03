package com.example.pokemonapi.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/pokemonapi/ui/viewmodel/PokemonViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllPokemon", "Lcom/example/pokemonapi/domain/GetPokemonUseCase;", "getPokedexByRegion", "Lcom/example/pokemonapi/domain/GetPokedexUseCase;", "(Lcom/example/pokemonapi/domain/GetPokemonUseCase;Lcom/example/pokemonapi/domain/GetPokedexUseCase;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_pokemonData", "", "Lcom/example/pokemonapi/data/model/PokemonData;", "isLoading", "()Landroidx/lifecycle/MutableLiveData;", "pokemonData", "getPokemonData", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "onCreateByRegion", "currentRegion", "Lcom/example/pokemonapi/ui/view/PokedexView$Companion$Region;", "app_debug"})
public final class PokemonViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.pokemonapi.domain.GetPokemonUseCase getAllPokemon = null;
    private final com.example.pokemonapi.domain.GetPokedexUseCase getPokedexByRegion = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.pokemonapi.data.model.PokemonData>> _pokemonData = null;
    
    @javax.inject.Inject()
    public PokemonViewModel(@org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.domain.GetPokemonUseCase getAllPokemon, @org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.domain.GetPokedexUseCase getPokedexByRegion) {
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
    
    public final void onCreateByRegion(@org.jetbrains.annotations.Nullable()
    com.example.pokemonapi.ui.view.PokedexView.Companion.Region currentRegion) {
    }
    
    private final java.lang.Object getPokedexByRegion(int id, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}