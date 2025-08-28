package strategy;

public class WeaponStars extends WeaponBehavior {
    @Override
    public void attack() {
        String[] frames = {
            "  *",
            "    *",
            "      *",
            "        *"
        };

        for (String frame : frames) {
            Resources.clear();
            System.out.println(frame);
            Resources.sleep(300);
        }
        System.out.println("Throws sharp stars!");
    }
}
