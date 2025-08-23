package strategy;

public class WeaponNone extends WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Has no weapon to attack with.");
    }
}
