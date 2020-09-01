package Singleton;

// this version has performance issues
public class Singleton {
    private static Singleton uniqueInstance;

    // other variables

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        return uniqueInstance == null ? new Singleton() : uniqueInstance;
    }

    // other methods
}