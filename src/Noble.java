import combat.Weapon;

import java.util.HashSet;
import java.util.Set;

public class Noble extends Character {
    private final Set<House> houses = new HashSet<>();


    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, House house, Set<Weapon> weapons, int wealth) {
        super(name, birthPlace, gender, house, weapons);
        this.wealth = wealth;
    }

    public Set<House> getHouses() {
        return houses;
    }

    public int getWealth() {
        return wealth;
    }

    public void getHouseAsString() {

    }

    @Override
    public void die() {
        for (House house : houses) {
            System.out.println(house.getAngolNev());
        }
    }



}
