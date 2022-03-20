package pao.tema4;

public class PasswordTester {
    public static void main(String[] args) {
        PasswordMaker password = new PasswordMaker("Mara");
        System.out.println("Parola: " + password.getPassword());
    }
}
