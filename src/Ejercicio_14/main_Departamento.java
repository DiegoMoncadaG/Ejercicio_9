package Ejercicio_14;

import java.util.Scanner;

public class main_Departamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las ventas del Departamento 1: ");
        double ventasDepto1 = scanner.nextDouble();

        System.out.print("Ingrese las ventas del Departamento 2: ");
        double ventasDepto2 = scanner.nextDouble();

        System.out.print("Ingrese las ventas del Departamento 3: ");
        double ventasDepto3 = scanner.nextDouble();

        System.out.print("Ingrese el salario base de los vendedores: ");
        double salarioBase = scanner.nextDouble();

        Departamento departamento = new Departamento(ventasDepto1, ventasDepto2, ventasDepto3, salarioBase);
        double[] salarios = departamento.calcularSalarios();

        System.out.printf("Salario vendedores departamento 1: $%.2f\n", salarios[0]);
        System.out.printf("Salario vendedores departamento 2: $%.2f\n", salarios[1]);
        System.out.printf("Salario vendedores departamento 3: $%.2f\n", salarios[2]);
    }
}
