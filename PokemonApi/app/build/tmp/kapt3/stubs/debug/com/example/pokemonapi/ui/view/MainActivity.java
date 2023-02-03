package com.example.pokemonapi.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/pokemonapi/ui/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/pokemonapi/ui/adapter/PokemonAdapter$OnClickPokemon;", "()V", "binding", "Lcom/example/pokemonapi/databinding/ActivityMainBinding;", "viewModel", "Lcom/example/pokemonapi/ui/viewmodel/PokemonViewModel;", "init", "", "observerGetAllPokemon", "observerLoading", "observers", "onClickItem", "item", "Lcom/example/pokemonapi/data/model/PokemonData;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUp", "showError", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.pokemonapi.ui.adapter.PokemonAdapter.OnClickPokemon {
    private com.example.pokemonapi.databinding.ActivityMainBinding binding;
    private com.example.pokemonapi.ui.viewmodel.PokemonViewModel viewModel;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUp() {
    }
    
    private final void observers() {
    }
    
    private final void observerGetAllPokemon() {
    }
    
    private final void observerLoading() {
    }
    
    private final void init() {
    }
    
    private final void showError() {
    }
    
    @java.lang.Override()
    public void onClickItem(@org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.data.model.PokemonData item) {
    }
}