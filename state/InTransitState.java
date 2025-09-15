package state;

import java.util.Random;


public class InTransitState extends State {
    private int days;

    public InTransitState(Package pkg) {
        super(pkg);
    }

    @Override
    public String getStatus() {
        return "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " out for delivery.";
    }

    @Override
    public String getETA() {
        days = 5; // base days
        StringBuilder sb = new StringBuilder();

        // 30% chance of delay
        if (random.nextInt(100) < 30) {
            int delay = random.nextInt(7) + 1; // 1–7 days
            days += delay;
            sb.append("The " + pkg.getName() + " " + pkg.getVerb("has", "have") +
                      " experienced a delay in shipping.\n");
        }

        sb.append("The " + pkg.getName() + " should arrive within " + days + " business days.");
        return sb.toString();
    }
}
