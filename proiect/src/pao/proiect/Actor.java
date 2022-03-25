package pao.proiect;

public class Actor {
    String nume;
    String prenume;
    String numeDeScena;
    int aniDeExperienta;

    public Actor(String nume, String prenume, String numeDeScena, int aniDeExperienta) {
        this.nume = nume;
        this.prenume = prenume;
        this.numeDeScena = numeDeScena;
        this.aniDeExperienta = aniDeExperienta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNumeDeScena() {
        return numeDeScena;
    }

    public int getAniDeExperienta() {
        return aniDeExperienta;
    }
}
