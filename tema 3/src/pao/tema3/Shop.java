package pao.tema3;

public class Shop {

    public static void main(String[] args) {
        Milka m1 = new Milka("capsune", "spania", 10, 30);
        Milka m2 = new Milka("alune de padure", "germania", 10, 30);
        Milka m3 = new Milka("stracciatella", "italia", 10, 30);

        CandyBox[] cbox1 = {m1, m2, m3};
        CandyBag cbag1 = new CandyBag(cbox1, 3);

        Milka m4 = new Milka("oreo", "franta", 20,30);
        Lindt l1 = new Lindt("portocale", "spania", 5, 4, 2);
        Merci me1 = new Merci("martipan", "italia", 6);

        CandyBox[] cbox2 = {m4, l1, me1};
        CandyBag cbag2 = new CandyBag(cbox2, 3);

        Area a1 = new Area(cbag1, 10, "B-dul Iuliu Maniu");
        Area a2 = new Area(cbag2, 25, "St. Brasov");

        a1.printAddress();
        a2.printAddress();

    }
}
