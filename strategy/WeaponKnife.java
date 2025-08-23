package strategy;

public class WeaponKnife extends WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Stabs swiftly with a knife!");
    }
}
