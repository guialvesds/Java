package org.example.Juros.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int number =sc.nextInt();
        System.out.println("(dd/MM/yyyy): ");


        sc.close();

    }
}
