package pao.tema4;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Introduceti string-ul dorit: ");
        String input = scanner.nextLine();

        String rev = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            rev = ch + rev;
        }

        System.out.println(input.equals(rev));
    }
}
