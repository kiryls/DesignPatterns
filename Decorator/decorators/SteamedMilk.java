package Decorator.decorators;

import Decorator.Beverage;
import Decorator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " , Steamed milk";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}