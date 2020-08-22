package Decorator.beverages;

import Decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaffeinated Coffee";
    }

    public double cost() {
        return 1.05;
    }
}