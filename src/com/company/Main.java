package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here5

        System.out.println(generateRandomAge());
        System.out.println(kick( generateRandomAge(), 35));
        System.out.println(kick(generateRandomAge(), 30));
        System.out.println(kick(generateRandomAge(), -30));
        System.out.println(kick(generateRandomAge(), 66));
        System.out.println(kick(generateRandomAge(), -43));
    }

    public static String kick(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature <= -20 && temperature >= 30) {

            return "Можно идти гулять ";
        }
        else if (age <= 20 && temperature > 0 && temperature < 28) {
            return "Можно итди гулять ";
        }
        else if (age > 45 && temperature <= -10 && temperature >= 25) {
            return "Можно итди гулять  ";
        }

        else {
            return "Оставайтесь дома";
        }


    }
    public static int generateRandomAge(){
        Random rand = new Random();
        int Ranomayzer = rand.nextInt(34);
        return Ranomayzer;


    }

}
