package Seminar;

import java.util.Scanner;


public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print your name: ");
        String name = sc.nextLine();

        System.out.printf("Hello, %s", name);

    }
}
