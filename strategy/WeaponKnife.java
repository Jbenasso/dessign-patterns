package strategy;

public class WeaponKnife extends WeaponBehavior {
    @Override
    public void attack() {
        String[] frames = {
            "   >==>",       // frame 1
            "    >==>",      // frame 2
            "     >==>",     // frame 3
            "      >==>"     // frame 4
        };

        for (String frame : frames) {
            Resources.clear();
            System.out.println(frame);
            Resources.sleep(300); // pause 0.3 seconds
        }
        System.out.println("Stabs swiftly with a knife!");
    }
}
