package com.example.pokemonapi;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PokemonApiApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface PokemonApiApp_GeneratedInjector {
  void injectPokemonApiApp(PokemonApiApp pokemonApiApp);
}
