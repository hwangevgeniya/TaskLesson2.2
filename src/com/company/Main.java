package com.company;

import java.util.Random;

public class Main {


    public static String ageAndTemperature(int age, int temperature) {




        if (age >=20 && age <=40 && temperature >= -20 && temperature <= 30 ){
           // System.out.println("Можно идти гулять");
            return "Можно идти гулять";
        }

        if (age < 28 && temperature > 0 && temperature < 28){
            //System.out.println("Можно идти гулять");
            return "Можно идти гулять";
        }

        if (age > 45 && temperature >- 10 && temperature < 25){
           // System.out.println("Можно идти гулять");
            return "Можно идти гулять";
        }


        return "Оставайтесь дома";

    }


    public static int generateRandomAge(){

        //Random rnd = new Random();
        //int age = rnd.nextInt(int 100);

        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int age2 = random.nextInt(diff + 1) + min;

        return age2;



    }

    int a = 12;
    public static String doWeWalk() {

        return "Можно ли идти гулять";

    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(ageAndTemperature(30,10));

        System.out.println(doWeWalk());

        System.out.println(generateRandomAge());


    }



public void test(){

}



}

