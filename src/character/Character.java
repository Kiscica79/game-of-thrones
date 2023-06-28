package character;
import character.type.Gender;
import character.type.House;
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
    private int health =100;


    public Character(String name, String birthPlace, Gender gender) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
        worldPopulation++;

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

    private void initiateFight(Weapon weapon, Character enemy, FightType fightType) {
        String fightTypeName = fightType == FightType.MELEE ? "melee" : "ranged";
        System.out.println(this.getName() + " engages in " + fightTypeName + " combat with " + enemy.getName() + ".");
        weapon.attack(this, enemy);
    }
    public void fight(Character enemy, FightType fightType) {
        if (this.hasWeapons()) {
            for (Weapon weapon : this.getWeapons()) {
                if ((fightType == FightType.MELEE && !weapon.isRanged()) ||
                        (fightType == FightType.RANGED && weapon.isRanged())) {
                    initiateFight(weapon, enemy, fightType);
                }
            }
        } else {
            System.out.println(this.getName() + " has no weapons to fight with.");
        }
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.getName() + "'s health dropped to " + this.health + "/100.");
    }
}






