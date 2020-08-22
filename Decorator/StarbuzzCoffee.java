package Decorator;

import Decorator.beverages.*;
import Decorator.decorators.*;
import java.util.Scanner;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean finished = false;
        Beverage beverage = null;

        System.out.println("\n=== Welcome to Starbuzz Coffee ===\nChoose your coffee:");
        System.out.println("[1] House Blend: $.89 | [2] Dark Roast $.99 | [3] Decaf $1.05 | [4] Espresso $1.99");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                beverage = new HouseBlend();
                break;
            
            case 2:
                beverage = new DarkRoast();
                break;

            case 3:
                beverage = new Decaf();
                break;

            case 4:
                beverage = new Espresso();
                break;
        
            default:
                finished = true;
                input.close();
                System.out.println("Finished");
                break;
        }

        System.out.println("\nChoose your condiments:");
        while(!finished) {
            System.out.println("[1] Steamed milk: $.10 | [2] Mocha $.20 | [3] Soy $.15 | [4] Whip $.10 | [0] Proceed to order");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    beverage = new SteamedMilk(beverage);
                    break;

                case 2:
                    beverage = new Mocha(beverage);
                    break;

                case 3:
                    beverage = new Soy(beverage);
                    break;

                case 4:
                    beverage = new Whip(beverage);
                    break;

                case 0:
                    finished = true;
                    System.out.println("Finished");
                    break;

                default:
                    System.out.println("(err: wrong choice)");
                    break;
            }
        }

        System.out.println();
        System.out.println(beverage.getDescription() + ": total $" + beverage.cost());
        System.out.println();
    }
}