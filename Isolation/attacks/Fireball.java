package Isolation.attacks;

import Isolation.interfaces.*;

public class Fireball implements AtkMode {
    public String attack(Character c){
        return "threw a fireball on " + c.getName() + "!";
    }
}