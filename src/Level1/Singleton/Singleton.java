package Level1.Singleton;

/**
 * lazy initialization
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is instantiated");
    }

    public static Singleton getinstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void methodInSingletonClass() {
        System.out.println("method in Singleton class");
    }
}