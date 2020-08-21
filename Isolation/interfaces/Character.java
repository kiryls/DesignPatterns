package Isolation.interfaces;

public abstract class Character {
    protected String name;
    protected int baseHP = 10;
    protected int baseSP = 10;
    protected int baseMP = 10;

    protected AtkMode atkM;

    public abstract void performAtk();
    public abstract void status();
}