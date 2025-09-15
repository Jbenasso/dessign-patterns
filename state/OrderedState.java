package state;

import java.util.Random;

public class OrderedState extends State {
    private int days;

    public OrderedState(Package pkg) {
        super(pkg);
    }

    @Override
    public String getStatus() {
        return "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " ordered.";
    }

    @Override
    public String getETA() {
        days = 2; // base days
        StringBuilder sb = new StringBuilder();

        // 20% chance of delay
        if (random.nextInt(100) < 20) {
            int delay = random.nextInt(3) + 1; // 1–3 days
            days += delay;
            sb.append("The " + pkg.getName() + " " + pkg.getVerb("has", "have") +
                      " experienced a slight delay in manufacturing.\n");
        }

        sb.append("The " + pkg.getName() + " will be shipped within " + days + " business days.");
        return sb.toString();
    }
}
