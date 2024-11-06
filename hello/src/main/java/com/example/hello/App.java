package com.example.hello;

import java.util.ArrayList;

import com.example.hello.model.Car;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String[] names={"Jérôme", "Alain", "Cédric"};

        for (String name: names){
            System.out.println(name);
        }

        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        Car voiture1=new Car("Citröen", 10000);

        System.out.println(voiture1.toString());

        Car voiture2=new Car("Audi", 5000);

        ArrayList<Car> cars=new ArrayList<Car>();

        cars.add(voiture1);
        cars.add(voiture2);

        for(Car c: cars){
            System.out.println(c.toString());
        }
    }
}
