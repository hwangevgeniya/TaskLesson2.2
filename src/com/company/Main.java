package com.company;

public class Main {


    public static String ageAndTemperature(int age, int temperature) {
        
        return age + temperature;
    }




    public static void main(String[] args) {
	// write your code here


        System.out.println(ageAndTemperature(15,30));

        if (age >=20 && age <=40 && temperature >= -20 && temperature <= 30 ){
            System.out.println("Можно идти гулять");
        }

        if (age < 28 && temperature > 0 && temperature < 28){
            System.out.println("Можно идти гулять");
        }

        if (age > 45 && temperature >- 10 && temperature < 25){
            System.out.println("Можно идти гулять");
        }
        default:
        System.out.println("Отавайтесь дома!");



    }






}

