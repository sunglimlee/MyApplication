package com.example.myapplication.dagger;

import com.example.myapplication.car.DieselEngine;
import com.example.myapplication.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
abstract class DieselEngineBindsModule {

    /*
       //인터페이스였을 때 사용하는 방법
       @Provides
       public Engine provideEngine() {
          Engine engine = new DieselEngine();
          return engine;
       }
    */
//위에꺼를 @Binds로 했을 때...
    @Binds
    abstract public Engine provideEngine(DieselEngine dieselEngine);

}
