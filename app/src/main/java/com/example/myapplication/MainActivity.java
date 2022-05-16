package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.car.Car;
import com.example.myapplication.car.Wheel;
import com.example.myapplication.dagger.CarComponent;
import com.example.myapplication.dagger.DaggerCarComponent;

public class MainActivity extends AppCompatActivity {
    Car car;
    Wheel wheel;
    //Remote remote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent.create();
        //car = carComponent.getCar();
        //객체만 집어넣어주면 알아서 필드들을 찾아서 만들어주는구나..
        car = carComponent.getCar();
        car.drive();
        wheel = car.wheel;
        Log.d("car", wheel.brandName);
        //Toast.makeText(this, car.remote.toString(), Toast.LENGTH_LONG).show();

    }
}