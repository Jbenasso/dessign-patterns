import java.util.ArrayList;

/**
 * Abstract IceCream class.
 * Holds ASCII art representation and scoop count.
 */
public abstract class IceCream {
    protected ArrayList<String> asciiArt;
    protected int numScoops;

    public abstract String toString();
}
