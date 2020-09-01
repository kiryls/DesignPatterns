package Singleton;

// this version relies too much on java primitives, it could be easily abused
public class Singleton_eager {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}