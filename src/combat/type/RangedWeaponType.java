package combat.type;

public enum RangedWeaponType {
    IJ("bow"),
    SZAMSZERIJ("crossbow"),
    DOBOKES("throwing knife"),
    GERELY("javelin");

    private String angolNev;

    RangedWeaponType(String angolNev) {
        this.angolNev = angolNev;
    }


}
