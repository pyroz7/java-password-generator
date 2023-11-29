package org.lessons.java.security;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // chiedo all'utente il nome
        System.out.print("Insert Name: ");
        String name = scan.nextLine();

        System.out.print("Insert Surname: ");
        String surname = scan.nextLine();

        System.out.print("Insert Favorite Color: ");
        String favoriteColor = scan.nextLine();

        System.out.print("Date of Birth: ");
        int dateBirth = scan.nextInt();



        scan.close();









    }
}
