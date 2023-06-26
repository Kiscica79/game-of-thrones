import combat.Weapon;

import java.util.HashSet;
import java.util.Set;

public class Character implements Mortal {

    private House house;
    private String name;
    private final String birthPlace;
    private Gender gender;
    private static int worldPopulation;
    private Set<Weapon> weapons = new HashSet<>();


    public Character(String name, String birthPlace, Gender gender, House house, Set<Weapon> weapons) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.house = house;
        worldPopulation++;
        this.weapons = weapons;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (this.gender == Gender.MALE && gender == Gender.EUNUCH) {
            this.gender = Gender.EUNUCH;
        }
    }

    public House getHouse() {
        return house;
    }

    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public static int getWorldPopulation() {
        return worldPopulation;
    }

    public void die() {
        System.out.println(worldPopulation--);
    }

    public boolean hasWeapons() {
        return !weapons.isEmpty();
    }
    public void addWeapon(Weapon valyrianDagger) {
        weapons.add(valyrianDagger);
    }
    public void removeWeapon(String stolenBow) {
        weapons.remove(stolenBow);
    }


}






