package creational.singleton;

public class Singleton {
    private static Singleton instance = null;

    private Singleton(){
        // Perform instance initializations
    };

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;

    }
}
