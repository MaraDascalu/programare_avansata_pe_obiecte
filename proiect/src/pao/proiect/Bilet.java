package pao.proiect;

public class Bilet {
    private int id;
    private Spectacol spectacol;
    private Client client;

    public Bilet(int id, Spectacol spectacol, Client client) {
        this.id = id;
        this.spectacol = spectacol;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public Spectacol getSpectacol() {
        return spectacol;
    }

    public Client getClient() {
        return client;
    }
}
