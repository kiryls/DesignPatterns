package Isolation.attacks;

import Isolation.interfaces.*;

public class Fireball implements AtkMode {
    public String attack(Character c){
        return "stabbed " + c.getName() + "!";
    }
}