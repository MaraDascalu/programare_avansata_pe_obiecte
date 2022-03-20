package pao.tema4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrame {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti primul sir: ");
        String input1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti al doilea sir: ");
        String input2 = scanner2.nextLine();

        Boolean anagrame = true;
        if (input1.length() != input2.length()){
            anagrame = false;
        }
        else{
            char[] str1 = input1.toCharArray();
            char[] str2 = input2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            anagrame = Arrays.equals(str1, str2);
        }

        System.out.println(anagrame);
    }

}
