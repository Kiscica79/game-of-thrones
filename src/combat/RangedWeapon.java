package combat;

import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {

    public int ammunition;

    public RangedWeapon(String name, int damage, int range, int ammunition, RangedWeaponType ij) {
        super(name, damage, range);
        this.ammunition = ammunition;
    }

    @Override
    protected int attack() {
        return ammunition--;
    }

    @Override
    public String toString() {
        return "RangedWeapon{" +
                "ammunition= " + ammunition +
                super.toString() +
                '}';
    }
}

