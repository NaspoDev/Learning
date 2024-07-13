package main.java.dev.naspo.designpatterns.creationalpatterns.singleton;

// Singleton is used when we want to have only one instance of a class.
// A good example of this is having a single instance of our application state.
public class App {
    private static App instance;

    private boolean isLoggedIn;

    // Private constructor to prevent instantiation.
    private App() {
        // Also initializes any variables that it needs.
        this.isLoggedIn = false;
    }

    // Get the instance of the App.
    // If the instance is null, i.e. it has never been instantiated, create a new instance.
    // If it has been instantiated, return the existing instance.
    public static App getAppState() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public void logIn() {
        this.isLoggedIn = true;
    }

    public void logOut() {
        this.isLoggedIn = false;
    }
}
