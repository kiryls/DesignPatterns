package Composition.classes;

import Composition.interfaces.*;
import Composition.attacks.*;

public class Rogue extends GameCharacter {
    public Rogue(String name){
        this.name = name;
        this.baseHP += 1;
        this.baseMP -= 3;
        this.baseSP += 4;

        this.atkM = new Stab();
    }

    public void performAtk(GameCharacter c) {
        System.out.println(name + " " + atkM.attack(c));
    }

    public void status() {
        System.out.println("Rogue " + name 
                            + " (HP: " + baseHP 
                            + ", MP: " + baseMP 
                            + ", SP: " + baseSP + ")");
    }
}