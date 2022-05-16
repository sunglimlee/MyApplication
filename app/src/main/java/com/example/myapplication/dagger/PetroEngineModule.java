package com.example.myapplication.dagger;

import com.example.myapplication.car.Engine;
import com.example.myapplication.car.PetroEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetroEngineModule {

   @Binds
   abstract Engine provideEngine(PetroEngine petroEngine);
}
