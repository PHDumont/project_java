package javacore.Aintroductionclasses.test;

import javacore.Aintroductionclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "BMW";
        car1.model = "320i";
        car1.year = 2024;
        car2.name = "Polo";
        car2.model = "Highline";
        car2.year = 2025;

        System.out.println("Name: " + car1.name + " Model: " + car1.model + " Year: " + car1.year);
        System.out.println("Name: " + car2.name + " Model: " + car2.model + " Year: " + car2.year);
    }
}
