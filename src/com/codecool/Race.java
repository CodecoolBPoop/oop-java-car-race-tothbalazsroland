package com.codecool;
import com.codecool.vehicles.*;

import java.util.ArrayList;


public class Race {

    private ArrayList<Truck> trucks = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();

    public void createVehicles(){
        for (int i=0;i<10;i++) {
            trucks.add(new Truck());
        }
        for (int i=0;i<10;i++) {
            cars.add(new Car());
        }
    }

    public void simulateRace(){
        for (int i=0;i<50;i++){
            System.out.println(i+1+" round:");
            for (Car car:cars){
                car.moveForAnHour(this);
            }
            for (Truck truck:trucks){
                truck.moveForAnHour(this);

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
