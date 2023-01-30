// Generated by Dagger (https://dagger.dev).
package com.example.pokemonapi.data;

import com.example.pokemonapi.data.network.PokemonService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PokemonRepository_Factory implements Factory<PokemonRepository> {
  private final Provider<PokemonService> apiProvider;

  public PokemonRepository_Factory(Provider<PokemonService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public PokemonRepository get() {
    return newInstance(apiProvider.get());
  }

  public static PokemonRepository_Factory create(Provider<PokemonService> apiProvider) {
    return new PokemonRepository_Factory(apiProvider);
  }

  public static PokemonRepository newInstance(PokemonService api) {
    return new PokemonRepository(api);
  }
}
