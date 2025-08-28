package observer;

/**
 * Teacher class, an observer that reacts to both Greeter and Watchman notices.
 * Implements Observer in the Observer design pattern.
 */
public class teacher implements observer {

    /**
     * Constructs a Teacher and registers it with the given subjects.
     *
     * @param watchman the Watchman subject
     * @param greeter  the Greeter subject
     */
    public teacher(subject watchman, subject greeter) {
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
                case 1 -> System.out.println("Teacher: Dismissing class early, an army is approaching!");
                case 2 -> System.out.println("Teacher: Hiding children, the city has been breached!");
            }
        } else {
            switch (note) {
                case 1 -> System.out.println("Teacher: Teaching children to welcome the messenger.");
                case 2 -> System.out.println("Teacher: Preparing students for a royal visit!");
            }
        }
    }
}
