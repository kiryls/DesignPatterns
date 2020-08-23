package Composition;

import Composition.classes.*;
import Composition.interfaces.GameCharacter;

public class app {
    public static void main(String[] args) {
        GameCharacter mage = new Mage("Silente");
        GameCharacter rogue = new Rogue("Leto");

        System.out.println();
        mage.status();
        rogue.status();
        System.out.println();
        mage.performAtk(rogue);
        rogue.performAtk(mage);
        System.out.println();
    }
}