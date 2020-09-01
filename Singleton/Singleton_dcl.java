package Singleton;

// double-checked locking to reduce the use of synchronization in getInstance()
public class Singleton_dcl {
    private volatile static Singleton_dcl uniqueInstance;

    private Singleton_dcl() {}

    public static Singleton_dcl getInstance() {
        if(uniqueInstance == null) {
            synchronized (Singleton.class) {
                if(uniqueInstance == null)
                    uniqueInstance = new Singleton_dcl();
            }
        }
        return uniqueInstance;
    }
}