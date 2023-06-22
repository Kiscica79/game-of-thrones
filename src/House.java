public enum House {

    STARK("Winter is Coming\n",
            "Közeleg a tél\n"),
    LANNINSTER("Hear Me Roar\n",
            "Halld üvöltésem\n"),
    TARGARYEN("Fire and Blood\n",
            "Tűz és vér"),
    BARATHEON("Ours is the Fury\n",
            "Miénk a harag"),
    GREYJOY("We Do Not Sow\n",
            "Mi nem vetünk"),
    TYRELL("Growing Strong\n",
            "Erőssé növünk"),
    ;

    private String angolNev;
    private String magyarNev;

    House(String angolNev, String magyarNev) {
        this.magyarNev = magyarNev;
        this.angolNev = angolNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public String getAngolNev() {
        return angolNev;
    }


}
