package Isolation.classes;

import Isolation.interfaces.*;
import Isolation.attacks.*;

public class Mage extends GameCharacter {
    public Mage(String name){
        this.name = name;
        this.baseHP -= 3;
        this.baseMP += 5;
        this.baseSP -= 2;

        this.atkM = new Fireball();
    }

    public void performAtk(GameCharacter c) {
        System.out.println(name + " " + atkM.attack(c));
    }

    public void status() {
        System.out.println("Mage " + name 
                            + " (HP: " + baseHP 
                            + ", MP: " + baseMP 
                            + ", SP: " + baseSP + ")");
    }
}