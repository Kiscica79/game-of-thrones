package combat;

import character.Character;

public abstract class Weapon {

    protected String name;
    protected int damage;
    protected int range;

    public Weapon(String name, int damage, int range) {
    }


    public abstract int attack(Character character, Character enemy);

    public abstract boolean isRanged();

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
