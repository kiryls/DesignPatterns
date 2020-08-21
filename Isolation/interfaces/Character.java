package Isolation.interfaces;

public abstract class Character {
    protected String name;
    protected int baseHP = 10; // base health
    protected int baseSP = 10; // base stamina
    protected int baseMP = 10; // base mana

    protected AtkMode atkM;

    public abstract void performAtk();
    public abstract void status();

    public String getName() {
        return name;
    }

    public int getHP() {
        return baseHP;
    }

    public int getSP() {
        return baseSP;
    }

    public int getMP() {
        return baseMP;
    }
}