package com.example.myapplication.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
   private static final String TAG = "Car";
   public Engine engine;
   public Wheel wheel;
   public Remote remote;

   public Car(Wheel wheels, Engine engine) {
      this.engine = engine;
      this.wheel = wheels;
      Log.d("car", "Car Created.....");
   }

   public void drive() {
      engine.EngineStarted();
      Log.d(TAG, "driving....");
   }

   @Inject
   public void enableRemote(Remote remote) {
      remote.setListener(this);
      this.remote = remote;
   }

}
