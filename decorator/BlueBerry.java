/**
 * Blueberry scoop decorator.
 */
public class BlueBerry extends ScoopDecorator {

    public BlueBerry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    @Override
    protected void addScoops() {
        prependScoops(Colors.ANSI_BLUE, "o");
    }
}
