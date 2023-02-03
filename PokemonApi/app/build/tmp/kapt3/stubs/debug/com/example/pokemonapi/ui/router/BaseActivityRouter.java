package com.example.pokemonapi.ui.router;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/example/pokemonapi/ui/router/BaseActivityRouter;", "", "intent", "Landroid/content/Intent;", "activity", "Landroid/content/Context;", "launch", "", "app_debug"})
public abstract interface BaseActivityRouter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Intent intent(@org.jetbrains.annotations.NotNull()
    android.content.Context activity);
    
    public abstract void launch(@org.jetbrains.annotations.NotNull()
    android.content.Context activity);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void launch(@org.jetbrains.annotations.NotNull()
        com.example.pokemonapi.ui.router.BaseActivityRouter $this, @org.jetbrains.annotations.NotNull()
        android.content.Context activity) {
        }
    }
}