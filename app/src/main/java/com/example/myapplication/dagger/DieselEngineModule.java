package com.example.myapplication.dagger;

import com.example.myapplication.car.DieselEngine;

import dagger.Module;
import dagger.Provides;

@Module
class DieselEngineModule {
    @Provides
    public DieselEngine provideDieselEngine() {
        return new DieselEngine();
    }

}
