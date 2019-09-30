package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Miyah";
        int age = 14;
        int temperature = 15;

        if ((age < 45 && age > 20) && temperature <= 30 && temperature >= -20) {
            System.out.println("Mojno idti gulyat" + name);
        } else if ((age < 20 && temperature > 0) && temperature < 28) {
            System.out.println("Mojno gulyat" + name);
        } else if ((age > 48 && temperature > -10) && temperature < 28) ;
        System.out.println("Mojno gulyat"+ name);


    }
}
