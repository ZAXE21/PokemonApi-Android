package com.example.pokemonapi.data.model.nuevomodelo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u00a2\u0006\u0002\u0010\u0013J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0010H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u00c6\u0003Jq\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0006H\u00d6\u0001J\t\u0010,\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015\u00a8\u0006-"}, d2 = {"Lcom/example/pokemonapi/data/model/nuevomodelo/ResponsePokedex;", "", "descriptions", "", "Lcom/example/pokemonapi/data/model/nuevomodelo/Description;", "id", "", "is_main_series", "", "name", "", "names", "Lcom/example/pokemonapi/data/model/nuevomodelo/Name;", "pokemon_entries", "Lcom/example/pokemonapi/data/model/nuevomodelo/PokemonEntry;", "region", "Lcom/example/pokemonapi/data/model/nuevomodelo/Region;", "version_groups", "Lcom/example/pokemonapi/data/model/nuevomodelo/VersionGroup;", "(Ljava/util/List;IZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/example/pokemonapi/data/model/nuevomodelo/Region;Ljava/util/List;)V", "getDescriptions", "()Ljava/util/List;", "getId", "()I", "()Z", "getName", "()Ljava/lang/String;", "getNames", "getPokemon_entries", "getRegion", "()Lcom/example/pokemonapi/data/model/nuevomodelo/Region;", "getVersion_groups", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ResponsePokedex {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Description> descriptions = null;
    private final int id = 0;
    private final boolean is_main_series = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Name> names = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.PokemonEntry> pokemon_entries = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.pokemonapi.data.model.nuevomodelo.Region region = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.VersionGroup> version_groups = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.data.model.nuevomodelo.ResponsePokedex copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Description> descriptions, int id, boolean is_main_series, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Name> names, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.nuevomodelo.PokemonEntry> pokemon_entries, @org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.data.model.nuevomodelo.Region region, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.nuevomodelo.VersionGroup> version_groups) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ResponsePokedex(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Description> descriptions, int id, boolean is_main_series, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Name> names, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.nuevomodelo.PokemonEntry> pokemon_entries, @org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.data.model.nuevomodelo.Region region, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.data.model.nuevomodelo.VersionGroup> version_groups) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Description> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Description> getDescriptions() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean is_main_series() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Name> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.Name> getNames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.PokemonEntry> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.PokemonEntry> getPokemon_entries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.data.model.nuevomodelo.Region component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.data.model.nuevomodelo.Region getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.VersionGroup> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.data.model.nuevomodelo.VersionGroup> getVersion_groups() {
        return null;
    }
}