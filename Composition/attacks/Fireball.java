package Composition.attacks;

import Composition.interfaces.*;

public class Fireball implements AtkMode {
    public String attack(GameCharacter c){
        return "threw a fireball on " + c.getName() + "!";
    }
}