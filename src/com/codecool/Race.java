package com.codecool;
import com.codecool.environment.Weather;
import com.codecool.vehicles.*;

import java.util.ArrayList;


public class Race {

    private ArrayList<Truck> trucks = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Motorcycle> motorcycles = new ArrayList<>();

    public void createVehicles(){
        for (int i=0;i<10;i++) {
            trucks.add(new Truck());
            cars.add(new Car());
            motorcycles.add(new Motorcycle());
        }
    }

    public void simulateRace(){
        for (int i=0;i<50;i++){
            System.out.println(i+1+" round:");
            Weather.setRaining();
            if (Weather.isRaining()){
                System.out.println("It is raining.");
            }
            for (Car car:cars){
                car.moveForAnHour(this);
            }
            for (Truck truck:trucks){
                truck.moveForAnHour(this);
            }
            for (Motorcycle motorcycle: motorcycles){
                motorcycle.moveForAnHour(this);
            }
            System.out.println("--------------------------------------------");
        }
    }

    public boolean isThereABrokenTruck(){
        if (trucks !=null){
            for (Truck truck: trucks){
                if (truck.getBreakdownTurnsLeft() !=0){
                return true;
                }
            }
        }
        return false;
    }
}
