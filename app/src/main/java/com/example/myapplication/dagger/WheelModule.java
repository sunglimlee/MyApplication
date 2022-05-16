package com.example.myapplication.dagger;

import com.example.myapplication.car.Car;
import com.example.myapplication.car.Engine;
import com.example.myapplication.car.Rim;
import com.example.myapplication.car.Tire;
import com.example.myapplication.car.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {
   @Provides
   static Rim provideRim() {
      return new Rim();
   }
   @Provides
   static Tire provideTire() {
      return new Tire();
   }

   @Provides
   static Wheel provideWheel(Tire tire, Rim rim) {
      Wheel wheel = new Wheel(tire, rim);
      wheel.brandName = "Hankook Tire";
      return wheel;
   }
   @Provides
   static Car provideCar(Wheel wheel, Engine engine) {
      Car car =  new Car(wheel, engine);
      return car;
   }
}
