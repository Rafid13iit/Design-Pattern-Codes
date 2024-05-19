package clientCode;

import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}

/*
 * Demo: This class contains the main method to demonstrate the Builder pattern. It shows how to use
 * the Director to construct different products (a car and its manual) using different builders.
 *
 * Demo: এই ক্লাসটি প্রধান মেথড ধারণ করে বিল্ডার প্যাটার্ন প্রদর্শন করার জন্য। এটি দেখায় কিভাবে 
 * ডিরেক্টর ব্যবহার করে বিভিন্ন পণ্য (একটি গাড়ি এবং এর ম্যানুয়াল) বিভিন্ন বিল্ডার ব্যবহার করে নির্মাণ করা যায়।
 */
