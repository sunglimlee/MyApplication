package com.example.myapplication.dagger;

import com.example.myapplication.car.Car;

import dagger.Component;

@Component(modules = {WheelModule.class, DieselEngineBindsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();
}
