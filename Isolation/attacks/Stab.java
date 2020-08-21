package Isolation.attacks;

import Isolation.interfaces.*;

public class Stab implements AtkMode {
    public String attack(GameCharacter c){
        return "stabbed " + c.getName() + "!";
    }
}