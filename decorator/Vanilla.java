/**
 * Vanilla scoop decorator.
 */
public class Vanilla extends ScoopDecorator {

    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }

    @Override
    protected void addScoops() {
        prependScoops(Colors.ANSI_WHITE, "o");
    }
}
