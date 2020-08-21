package Isolation.classes;

import Isolation.interfaces.*;
import Isolation.attacks.*;

public class Mage extends Character {
    public Mage(String name){
        this.name = name;
        this.baseHP -= 3;
        this.baseMP += 5;
        this.baseSP -= 2;

        this.atkM = new Fireball();
    }

    public void performAtk(Character c) {
        System.out.println(name + " " + atkM.atk(c));
    }

    public void status() {
        System.out.println("Mage " + name 
                            + " (HP: " + baseHP 
                            + ", MP: " + baseMP 
                            + ", SP: " + baseSP + ")");
    }
}