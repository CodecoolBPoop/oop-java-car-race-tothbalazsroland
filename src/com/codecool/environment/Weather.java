package com.codecool.environment;

import java.util.Random;

public final class Weather {
    private static boolean rain = false;

    private Weather(){}

    public static void setRaining(){
        Random rn = new Random();
        int chance = rn.nextInt(100);
        if (chance<30){
            rain = true;
        }else {
            rain = false;
        }
    }

    public static boolean isRaining(){
        return rain;
    }
}
