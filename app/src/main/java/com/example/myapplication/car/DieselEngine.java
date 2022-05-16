package com.example.myapplication.car;

import android.util.Log;

public class DieselEngine implements Engine {

   @Override
   public void EngineStarted() {
      Log.d("car", "Diesel Engine started....");
   }

}
