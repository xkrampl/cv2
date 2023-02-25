package sk.stuba.fei.uim.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavesnica = new Scanner(System.in);
        System.out.println("Hello world");

        String a = "a";
        String b = "a";

        System.out.println("Zadaj pismeno: ");
        String c = klavesnica.nextLine();

        System.out.println(a.equals(c));
    }
}
