package strategy;

public class WeaponBow extends WeaponBehavior {
    @Override
    public void attack() {
        String[] frames = {
            "  \\--->",
            "   \\--->",
            "    \\--->",
            "     \\--->"
        };

        for (String frame : frames) {
            Resources.clear();
            System.out.println(frame);
            Resources.sleep(300);
        }
        System.out.println("Shoots an arrow with the bow!");
    }
}
