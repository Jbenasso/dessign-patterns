package strategy;

public class WeaponBow extends WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Shoots an arrow with the bow!");
    }
}
