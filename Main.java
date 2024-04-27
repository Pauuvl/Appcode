import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la siguiente información:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Número de identificación: ");
        String id = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("\nInformación Nutricional:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Identificación: " + id);
        System.out.println("Dirección: " + direccion);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + String.format("%.2f", imc));

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}