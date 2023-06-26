public enum House {

    STARK("Winter is Coming\n",
            "Közeleg a tél\n",
            "wolf\n"),
    LANNINSTER("Hear Me Roar\n",
            "Halld üvöltésem\n",
            "lion\n"),
    TARGARYEN("Fire and Blood\n",
            "Tűz és vér\n",
            "dragon\n"),
    BARATHEON("Ours is the Fury\n",
            "Miénk a harag\n",
            "stag\n"),
    GREYJOY("We Do Not Sow\n",
            "Mi nem vetünk\n",
            "kraken\n"),
    TYRELL("Growing Strong\n",
            "Erőssé növünk\n",
            "rose\n"),
    ;

    private String angolNev;
    private String magyarNev;
    private String sigil;

    House(String angolNev, String magyarNev, String sigil) {
        this.angolNev = angolNev;
        this.magyarNev = magyarNev;
        this.sigil = sigil;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public String getAngolNev() {
        return angolNev;
    }

    public String getSigil() {
        return sigil;
    }
}