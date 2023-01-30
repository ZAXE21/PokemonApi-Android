package com.example.pokemonapi.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B\u00c5\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\u0002\u0010 J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0011H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0018H\u00c6\u0003J\t\u0010>\u001a\u00020\u001aH\u00c6\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003H\u00c6\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0006H\u00c6\u0003J\t\u0010H\u001a\u00020\u000fH\u00c6\u0003J\t\u0010I\u001a\u00020\u0011H\u00c6\u0003J\u00ed\u0001\u0010J\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00062\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010K\u001a\u00020\u000f2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010M\u001a\u00020\u0006H\u00d6\u0001J\t\u0010N\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010*R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010$\u00a8\u0006O"}, d2 = {"Lcom/example/pokemonapi/test/Prueba;", "", "abilities", "", "Lcom/example/pokemonapi/test/Ability;", "base_experience", "", "forms", "Lcom/example/pokemonapi/test/Form;", "game_indices", "Lcom/example/pokemonapi/test/GameIndice;", "height", "held_items", "id", "is_default", "", "location_area_encounters", "", "moves", "Lcom/example/pokemonapi/test/Move;", "name", "order", "past_types", "species", "Lcom/example/pokemonapi/test/Species;", "sprites", "Lcom/example/pokemonapi/test/Sprites;", "stats", "Lcom/example/pokemonapi/test/Stat;", "types", "Lcom/example/pokemonapi/test/Type;", "weight", "(Ljava/util/List;ILjava/util/List;Ljava/util/List;ILjava/util/List;IZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/util/List;Lcom/example/pokemonapi/test/Species;Lcom/example/pokemonapi/test/Sprites;Ljava/util/List;Ljava/util/List;I)V", "getAbilities", "()Ljava/util/List;", "getBase_experience", "()I", "getForms", "getGame_indices", "getHeight", "getHeld_items", "getId", "()Z", "getLocation_area_encounters", "()Ljava/lang/String;", "getMoves", "getName", "getOrder", "getPast_types", "getSpecies", "()Lcom/example/pokemonapi/test/Species;", "getSprites", "()Lcom/example/pokemonapi/test/Sprites;", "getStats", "getTypes", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Prueba {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.test.Ability> abilities = null;
    private final int base_experience = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.test.Form> forms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.test.GameIndice> game_indices = null;
    private final int height = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> held_items = null;
    private final int id = 0;
    private final boolean is_default = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String location_area_encounters = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.test.Move> moves = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int order = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> past_types = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.pokemonapi.test.Species species = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.pokemonapi.test.Sprites sprites = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.test.Stat> stats = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pokemonapi.test.Type> types = null;
    private final int weight = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.test.Prueba copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Ability> abilities, int base_experience, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Form> forms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.GameIndice> game_indices, int height, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> held_items, int id, boolean is_default, @org.jetbrains.annotations.NotNull()
    java.lang.String location_area_encounters, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Move> moves, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int order, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> past_types, @org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.test.Species species, @org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.test.Sprites sprites, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Stat> stats, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Type> types, int weight) {
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
    
    public Prueba(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Ability> abilities, int base_experience, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Form> forms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.GameIndice> game_indices, int height, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> held_items, int id, boolean is_default, @org.jetbrains.annotations.NotNull()
    java.lang.String location_area_encounters, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Move> moves, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int order, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> past_types, @org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.test.Species species, @org.jetbrains.annotations.NotNull()
    com.example.pokemonapi.test.Sprites sprites, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Stat> stats, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pokemonapi.test.Type> types, int weight) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Ability> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Ability> getAbilities() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getBase_experience() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Form> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Form> getForms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.GameIndice> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.GameIndice> getGame_indices() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getHeld_items() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean is_default() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation_area_encounters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Move> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Move> getMoves() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getOrder() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getPast_types() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.test.Species component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.test.Species getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.test.Sprites component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemonapi.test.Sprites getSprites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Stat> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Stat> getStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Type> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pokemonapi.test.Type> getTypes() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getWeight() {
        return 0;
    }
}