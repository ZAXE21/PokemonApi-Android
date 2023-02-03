package com.example.pokemonapi.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/pokemonapi/ui/adapter/PokemonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/pokemonapi/ui/adapter/PokemonAdapter$PokemonAdapterViewHolder;", "listPokemon", "", "Lcom/example/pokemonapi/data/model/PokemonData;", "listener", "Lcom/example/pokemonapi/ui/adapter/PokemonAdapter$OnClickPokemon;", "(Ljava/util/List;Lcom/example/pokemonapi/ui/adapter/PokemonAdapter$OnClickPokemon;)V", "listFiltered", "listOriginal", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickPokemon", "PokemonAdapterViewHolder", "app_debug"})
public final class PokemonAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.pokemonapi.ui.adapter.PokemonAdapter.PokemonAdapterViewHolder> {
    private final java.util.List<com.example.pokemonapi.data.model.PokemonData> listPokemon = null;
    private final com.example.pokemonapi.ui.adapter.PokemonAdapter.OnClickPokemon listener = null;
    private java.util.List<com.example.pokemonapi.data.model.PokemonData> listFiltered;
    private java.util.List<com.example.pokemonapi.data.model.PokemonData> listOriginal;
    
    public PokemonAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.PokemonData> listPokemon, @org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.ui.adapter.PokemonAdapter.OnClickPokemon listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.pokemonapi.ui.adapter.PokemonAdapter.PokemonAdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.ui.adapter.PokemonAdapter.PokemonAdapterViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/pokemonapi/ui/adapter/PokemonAdapter$OnClickPokemon;", "", "onClickItem", "", "item", "Lcom/example/pokemonapi/data/model/PokemonData;", "app_debug"})
    public static abstract interface OnClickPokemon {
        
        public abstract void onClickItem(@org.jetbrains.annotations.NotNull()
        com.example.pokemonapi.data.model.PokemonData item);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/pokemonapi/ui/adapter/PokemonAdapter$PokemonAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/pokemonapi/databinding/ItemPokemonBinding;", "(Lcom/example/pokemonapi/ui/adapter/PokemonAdapter;Lcom/example/pokemonapi/databinding/ItemPokemonBinding;)V", "cardPokemon", "Landroidx/cardview/widget/CardView;", "getCardPokemon", "()Landroidx/cardview/widget/CardView;", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "imageShiny", "getImageShiny", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "app_debug"})
    public final class PokemonAdapterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView name = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView image = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imageShiny = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cardPokemon = null;
        
        public PokemonAdapterViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.pokemonapi.databinding.ItemPokemonBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageShiny() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardPokemon() {
            return null;
        }
    }
}