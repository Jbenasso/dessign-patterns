package strategy;

public abstract class Character {
    protected String name;
    private WeaponBehavior weaponBehavior;

    public Character(String name) {
        this.name = name;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void attack() {
    if (weaponBehavior != null) {
        weaponBehavior.attack();   // ✅ use the instance, not WeaponBehavior
    } else {
        System.out.println(name + " has no weapon equipped!");
    }
}


    @Override
    public String toString() {
        return name + " the " + this.getClass().getSimpleName();
    }
}
