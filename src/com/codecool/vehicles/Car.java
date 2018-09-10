package com.codecool.vehicles;

import com.codecool.Race;

import java.util.Random;

public class Car extends Vehicle {
    static private String[] names= {"Eternity","Paladin", "Basilisk","Freedom","Treasure","Tracer","Roamer","Buffalo","Roamer","Scout"};
    public Car() {
        Random rn = new Random();
        speed = rn.nextInt(31)+80;
        name = names[rn.nextInt(10)]+" "+names[rn.nextInt(10)];
    }

    @Override
    public void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck()){
            distanceTraveled += 75;
            System.out.println(name+"traveled: 75 km(s)");
        }else {
            distanceTraveled+=speed;
            System.out.println(name +" traveled:" +speed+"km(s)");
        }
        System.out.println(name +"'s total distance traveled is:"+distanceTraveled);
        System.out.println(" ");

    }
}
