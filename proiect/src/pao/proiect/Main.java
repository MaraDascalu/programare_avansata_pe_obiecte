package pao.proiect;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Locatie l1 = new Locatie("Sala mica", "TNB", 70);
        Actor a1 = new Actor("blaa", "blaa", "bal", 4);
        Spectacol s1 = new Spectacol("alba ca zapada", 120, l1, 15, Genul.ANIMATIE);

        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        LocalDate d2 = d1.plusDays(30);
        System.out.println(d2);

        Program p1 = new Program(d1, d2);
    }
}
