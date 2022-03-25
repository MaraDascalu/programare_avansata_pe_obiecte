package pao.proiect;

public class Spectacol {

    String denumire;
    int durata;
    int numarBileteVandute;
    Locatie locatie;
    Actor[] actori;
    int pret;
    Genul gen;

    public Spectacol(String denumire, int durata, Locatie locatie, Actor[] actori, int pret, Genul gen) {
        this.denumire = denumire;
        this.durata = durata;
        this.numarBileteVandute = 0;
        this.locatie = locatie;
        this.actori = actori;
        this.pret = pret;
        this.gen = gen;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getDurata() {
        return durata;
    }

    public int getNumarBileteVandute() {
        return numarBileteVandute;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public Actor[] getActori() {
        return actori;
    }

    public int getPret() {
        return pret;
    }

    public Genul getGen() {
        return gen;
    }
}
