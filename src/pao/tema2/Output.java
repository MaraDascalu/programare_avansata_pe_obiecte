package pao.tema2;

public class Output {
    public static void main(String[] args) {
        Person p1 = new Person("Stefanescu", "Ion", 20, 5144233112L, "profesor");
        Person p2 = new Person("Barbu", "Mihai", 15, 23890460L, "laborant");

        System.out.println("Informatii persoana 1: " + p1.ouptupPerson());
        System.out.println("Informatii persoana 2: " + p2.ouptupPerson());
        System.out.println();

        Room r1 = new Room(1, "amfiteatru", 0);
        Room r2 = new Room(15, "laborator", 3);

        System.out.println("Informatii sala 1: " + r1.outputRoom());
        System.out.println("Informatii sala 2: " + r2.outputRoom());
        System.out.println();

        Subject s1 = new Subject(r1, 60, p1);
        Subject s2 = new Subject(r2, 25, p2);

        s1.outputSubject();
        s2.outputSubject();
    }
}
