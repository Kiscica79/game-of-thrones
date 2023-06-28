package character;

import character.type.Gender;
import character.type.House;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Noble extends Character {
    private Set<House> houses = new HashSet<>();
    private Map<String, Integer> coins = new HashMap<>();


    public Noble(String name, String birthPlace, Gender gender, Set<House> houses) {
        super(name, birthPlace, gender);
        this.houses = houses;
    }

    public void addCoins(String coinType, int amount) {
        System.out.println(coins.put(coinType, amount));
    }

    public void removeCoins(String coinType, int amount) {
        System.out.println(coins.remove(coinType, amount));
    }

    public int getWealth() {
        int totalWealth = 0;
        for (var actual : coins.entrySet()) {
            String actualCoinType = actual.getKey();
            switch (actualCoinType) {
                case "gold" -> totalWealth += actual.getValue() * 100;
                case "silver" -> totalWealth += actual.getValue() * 10;
                case "copper" -> totalWealth += actual.getValue();
            }
        }

        return 0;
    }

    @Override
    public void die() {
        for (var actual : houses) {
            System.out.println(actual.getAngolNev());
        }
    }

    public Set<House> getHouses() {
        return houses;
    }


    public void getHouseAsString() {

    }



}
