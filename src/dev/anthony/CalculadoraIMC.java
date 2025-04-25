package dev.anthony;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kg: ");
        double pesoKg = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingresa tu altura en metros: ");
        double alturaMetros = Double.parseDouble(scanner.nextLine());

        double imc = pesoKg / (alturaMetros * alturaMetros);

        System.out.printf("Tu IMC es: %.2f\n", imc);

        String categoria;
        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 25) {
            categoria = "Peso Normal";
        } else if (imc < 30) {
            categoria = "Sobre peso";
        } else {
            categoria = "Obesidad";
        }

        System.out.println("Categoria: " + categoria);
    }
}