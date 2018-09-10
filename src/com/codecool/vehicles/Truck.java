package com.codecool.vehicles;

import com.codecool.Race;

import java.util.Random;

public class Truck extends Vehicle{

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    private int breakdownTurnsLeft;

    public Truck(){
        breakdownTurnsLeft = 0;
        Random rn = new Random();
        name = String.valueOf(rn.nextInt(1001));
        speed = 100;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (breakdownTurnsLeft==0){
            distanceTraveled += speed;
            Random rn = new Random();
            int chance = rn.nextInt(100);
            System.out.println(name +" traveled:" +speed+"km(s)");
            if (chance<5){
                breakdownTurnsLeft = 2;
                System.out.println(name+" broke down!");
            }
        }else{
            breakdownTurnsLeft-=1;
            System.out.println(name +" is broken down so did not move");
        }
        System.out.println(name +"'s total distance traveled is:"+distanceTraveled);
        System.out.println(" ");
    }
}
