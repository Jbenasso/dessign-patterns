package state;

import java.util.Random;

public class DeliveredState extends State {
    public DeliveredState(Package pkg) {
        super(pkg);
    }

    @Override
    public String getStatus() {
        return "The " + pkg.getName() + " " + pkg.getVerb("has", "have") + " arrived.";
    }

    @Override
    public String getETA() {
        return "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " here.";
    }
}
