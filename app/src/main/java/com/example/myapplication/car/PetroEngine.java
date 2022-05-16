package com.example.myapplication.car;

import android.util.Log;

import javax.inject.Inject;

public class PetroEngine implements Engine {

   @Inject
   public PetroEngine() {
   }

   @Override
   public void EngineStarted() {
      Log.d("car", "Petro Engine started....");
   }

}
