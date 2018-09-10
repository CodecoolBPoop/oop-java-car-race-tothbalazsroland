package com.codecool.vehicles;

import com.codecool.Race;

public class Vehicle {

    Integer speed;
    Integer distanceTraveled = 0;
    String name;


    public void moveForAnHour(Race race){
        this.distanceTraveled += speed;
    }

}
