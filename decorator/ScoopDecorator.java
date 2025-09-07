import java.util.ArrayList;

/**
 * Abstract ScoopDecorator extends IceCream.
 * Adds flavored scoops to an existing IceCream.
 */
public abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numFlavorScoops;

    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numFlavorScoops = numScoops;
        this.numScoops = iceCream.numScoops + numScoops;
        this.asciiArt = new ArrayList<>(iceCream.asciiArt);
        addScoops();
    }

    /**
     * Subclasses will implement to add scoops of their color.
     */
    protected abstract void addScoops();

    /**
     * Helper to prepend scoop ASCII art.
     */
    protected void prependScoops(String color, String scoopChar) {
        for (int i = 0; i < numFlavorScoops; i++) {
            ArrayList<String> scoop = new ArrayList<>();
            scoop.add(color + "   ___   " + Colors.ANSI_RESET);
            scoop.add(color + "  (" + scoopChar + scoopChar + scoopChar + ")  " + Colors.ANSI_RESET);
            scoop.add(color + "   ‾‾‾   " + Colors.ANSI_RESET);

            // Add scoop lines above current ASCII art
            for (int j = scoop.size() - 1; j >= 0; j--) {
                asciiArt.add(0, scoop.get(j));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : asciiArt) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
