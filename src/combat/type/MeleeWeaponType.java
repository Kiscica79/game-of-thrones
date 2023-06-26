package combat.type;

public enum MeleeWeaponType {
    KARD("sword"),
    BALTA("axe"),
    BUZOGANY("mace"),
    LANDZSA("spear"),
    TOR("dagger");

    private String angolNev;

    MeleeWeaponType(String angolNev) {
        this.angolNev = angolNev;
    }
}
