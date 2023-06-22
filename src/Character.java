public class Character {

    private House house;
    private String name;
    private final String birthPlace;
    private Gender gender;

    public Character(String name, String birthPlace, Gender gender, House house) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.house = house;
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


}






