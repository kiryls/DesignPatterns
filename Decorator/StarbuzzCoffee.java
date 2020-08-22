package Decorator;

import Decorator.beverages.*;
import Decorator.decorators.*;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage b0 = new Espresso();
        System.out.println();
        System.out.println(b0.getDescription() + ": total $" + b0.cost());

        Beverage b1 = new DarkRoast();
        b1 = new Mocha(b1);
        b1 = new Mocha(b1);
        b1 = new Whip(b1);
        System.out.println();
        System.out.println(b1.getDescription() + ": total $" + b1.cost());

        Beverage b2 = new HouseBlend();
        b2 = new Soy(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println();
        System.out.println(b2.getDescription() + ": total $" + b2.cost());
        System.out.println();
    }
}