package observer;

/**
 * Knight class, an observer that reacts to both Greeter and Watchman notices.
 * Implements Observer in the Observer design pattern.
 * 
 * @author Your Name
 */
public class knight implements observer {

    /**
     * Constructs a Knight and registers it with the given subjects.
     *
     * @param watchman the Watchman subject
     * @param greeter  the Greeter subject
     */
    public knight(subject watchman, subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    /**
     * Reacts to notifications from subjects.
     *
     * @param warning true if the notice is from the Watchman
     * @param note    the notice number
     */
    @Override
    public void update(boolean warning, int note) {
        if (warning) {
            switch (note) {
                case 1 -> System.out.println("Knight: Preparing defenses, an army is approaching!");
                case 2 -> System.out.println("Knight: To arms! The city has been breached!");
            }
        } else {
            switch (note) {
                case 1 -> System.out.println("Knight: Escorting messenger safely to the city.");
                case 2 -> System.out.println("Knight: Standing at attention for royalty!");
            }
        }
    }
}
