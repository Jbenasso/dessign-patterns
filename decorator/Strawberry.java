/**
 * Strawberry scoop decorator.
 */
public class Strawberry extends ScoopDecorator {

    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    @Override
    protected void addScoops() {
        prependScoops(Colors.ANSI_RED, "o");
    }
}
