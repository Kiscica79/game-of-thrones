import java.util.HashSet;
import java.util.Set;

public class Noble extends Character {
    private final Set<House> houses = new HashSet<>();


    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, House house, int wealth) {
        super(name, birthPlace, gender, house);
        this.wealth = wealth;
    }

    public void getHouseAsString() {

    }
}
