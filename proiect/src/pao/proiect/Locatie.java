package pao.proiect;

public class Locatie {

    String denumire;
    String teatru;
    int capacitateMaxima;

    public Locatie(String denumire, String teatru ,int capacitateMaxima) {
        this.denumire = denumire;
        this.teatru = teatru;
        this.capacitateMaxima = capacitateMaxima;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getTeatru() {
        return teatru;
    }

    public int getCapacitateMaxima() {
        return capacitateMaxima;
    }
}
