package dev.anthony;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par");
        } else {
            System.out.println(numero + " es un numero impar");
        }
    }
}
