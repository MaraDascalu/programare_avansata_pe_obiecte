package pao.proiect;

public class ClientFidel extends Client{
    private int discount;

    public ClientFidel(String nume, String prenume, String numarDeTelefon, String email, int discount) {
        super(nume, prenume, numarDeTelefon, email);
        this.discount = discount;
    }

    public ClientFidel(String nume, String prenume, String email, int discount) {
        super(nume, prenume, email);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
