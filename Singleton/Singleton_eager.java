package Singleton;

// this version relies too much on java primitives, it could be easily abused
public class Singleton_eager {
    private static Singleton_eager uniqueInstance = new Singleton_eager();

    private Singleton_eager() {}

    public static Singleton_eager getInstance() {
        return uniqueInstance;
    }
}