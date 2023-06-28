package combat;

import character.Character;
import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {

    public int ammunition;

    public RangedWeapon(String name, int damage, int range, int ammunition, RangedWeaponType ij) {
        super(name, damage, range);
        this.ammunition = ammunition;
    }

    @Override
    public int attack(Character character, Character enemy) {
        return ammunition--;
    }

    @Override
    public boolean isRanged() {
        return false;
    }

    @Override
    public String toString() {
        return "RangedWeapon{" +
                "ammunition= " + ammunition +
                super.toString() +
                '}';
    }
}

