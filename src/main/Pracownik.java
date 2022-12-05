package pl.edu.pw.mini.jrafalko.main;

import pl.edu.pw.mini.jrafalko.censor.ReplaceInt;

public abstract class Pracownik {

    protected String imie;
    protected String nazwisko;
    @ReplaceInt
    protected int wiek;
    protected int wypracowanyZysk;

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        wypracowanyZysk = 0;
    }

    @Override
    public String toString() {
        return "Pracownik:" +
                " imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", wypracowanyZysk=" + wypracowanyZysk;
    }

    protected abstract void zwiekszZysk();
}
