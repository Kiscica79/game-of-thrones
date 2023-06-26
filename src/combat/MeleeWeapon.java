package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(String name, int damage, MeleeWeaponType range) {
        super(name, damage, 1);
    }

    @Override
    protected int attack() {
        return 0;
    }

    @Override
    public String toString() {
        return "MeleeWeapon{" +
                super.toString() +
                '}';
    }
}
