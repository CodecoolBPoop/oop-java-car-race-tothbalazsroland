package com.codecool.vehicles;

import com.codecool.Race;
import com.codecool.environment.Weather;

import java.util.Random;

public class Motorcycle extends Vehicle {

    private static int nameNumber=1;

    public Motorcycle(){
        speed = 100;
        name = "Motorcycle "+ nameNumber;
        nameNumber+=1;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (Weather.isRaining()){
            Random rn = new Random();
            int howMuchSlover = rn.nextInt(46)+5;
            distanceTraveled+=speed-howMuchSlover;
            System.out.println(name+" traveled "+(speed-howMuchSlover)+"km(s)");
        }else {
            distanceTraveled+=speed;
            System.out.println(name +" traveled "+speed+"km(s)");
        }
        System.out.println(name +"'s total distance traveled is:"+distanceTraveled);
        System.out.println(" ");

    }
}
