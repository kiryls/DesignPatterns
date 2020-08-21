package Isolation.classes;

import Isolation.interfaces.*;
import Isolation.attacks.*;

public class Rogue extends Character {
    public Mage(String name){
        this.name = name;
        this.baseHP += 1;
        this.baseMP -= 3;
        this.baseSP += 4;

        this.atkM = new Stab();
    }

    public void performAtk(Character c) {
        System.out.println(name + " " + atkM.atk(c));
    }

    public void status() {
        System.out.println("Rogue " + name 
                            + " (HP: " + baseHP 
                            + ", MP: " + baseMP 
                            + ", SP: " + baseSP + ")");
    }
}