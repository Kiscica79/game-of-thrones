package combat;

import character.Character;
import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(String name, int damage, MeleeWeaponType range) {
        super(name, damage, 1);
    }

    @Override
    public int attack(Character character, Character enemy) {
        return 0;
    }

    @Override
    public boolean isRanged() {
        return false;
    }

    @Override
    public String toString() {
        return "MeleeWeapon{" +
                super.toString() +
                '}';
    }
}
