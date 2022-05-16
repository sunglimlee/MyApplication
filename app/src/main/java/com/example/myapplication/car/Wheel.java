package com.example.myapplication.car;

import android.util.Log;

public class Wheel {
   private Tire tire;
   private Rim rim;
   public String brandName;

   public Wheel(Tire tire, Rim rim) {

      Log.d("Car", "Wheel created....");
      this.tire = tire;
      this.rim = rim;
   }
}
