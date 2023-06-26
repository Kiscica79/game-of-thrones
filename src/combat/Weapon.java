package combat;
public abstract class Weapon {

    protected String name;
    protected int damage;
    protected int range;

    public Weapon(String name, int damage, int range) {
    }


    protected abstract int attack();

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
