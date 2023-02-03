package com.example.pokemonapi.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/pokemonapi/ui/view/PokedexView;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/pokemonapi/ui/adapter/PokemonAdapter$OnClickPokemon;", "()V", "binding", "Lcom/example/pokemonapi/databinding/ActivityPokedexViewBinding;", "currentRegion", "Lcom/example/pokemonapi/ui/view/PokedexView$Companion$Region;", "viewModel", "Lcom/example/pokemonapi/ui/viewmodel/PokemonViewModel;", "getRegion", "nameRegion", "", "init", "", "initBundle", "observerGetAllPokemon", "observerLoading", "observers", "onClickItem", "item", "Lcom/example/pokemonapi/data/model/PokemonData;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUp", "showError", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PokedexView extends androidx.appcompat.app.AppCompatActivity implements com.example.pokemonapi.ui.adapter.PokemonAdapter.OnClickPokemon {
    private com.example.pokemonapi.databinding.ActivityPokedexViewBinding binding;
    private com.example.pokemonapi.ui.viewmodel.PokemonViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.pokemonapi.ui.view.PokedexView.Companion Companion = null;
    private com.example.pokemonapi.ui.view.PokedexView.Companion.Region currentRegion;
    
    public PokedexView() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUp() {
    }
    
    private final void initBundle() {
    }
    
    private final com.example.pokemonapi.ui.view.PokedexView.Companion.Region getRegion(java.lang.String nameRegion) {
        return null;
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/pokemonapi/ui/view/PokedexView$Companion;", "", "()V", "Region", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/pokemonapi/ui/view/PokedexView$Companion$Region;", "", "(Ljava/lang/String;I)V", "Kanto", "Johto", "Hoen", "Sinnoh", "app_debug"})
        public static enum Region {
            /*public static final*/ Kanto /* = new Kanto() */,
            /*public static final*/ Johto /* = new Johto() */,
            /*public static final*/ Hoen /* = new Hoen() */,
            /*public static final*/ Sinnoh /* = new Sinnoh() */;
            
            Region() {
            }
        }
    }
}