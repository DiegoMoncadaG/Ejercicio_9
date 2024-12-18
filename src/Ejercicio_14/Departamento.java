package Ejercicio_14;

public class Departamento {
    private double ventasDepto1;
    private double ventasDepto2;
    private double ventasDepto3;
    private double salarioBase;

    public Departamento(double ventasDepto1, double ventasDepto2, double ventasDepto3, double salarioBase) {
        this.ventasDepto1 = ventasDepto1;
        this.ventasDepto2 = ventasDepto2;
        this.ventasDepto3 = ventasDepto3;
        this.salarioBase = salarioBase;
    }

    public double[] calcularSalarios() {
        double totalVentas = ventasDepto1 + ventasDepto2 + ventasDepto3;
        double porcentajeVentas = totalVentas * 0.33;

        double salarioDepto1 = ventasDepto1 > porcentajeVentas ? salarioBase * 1.2 : salarioBase;
        double salarioDepto2 = ventasDepto2 > porcentajeVentas ? salarioBase * 1.2 : salarioBase;
        double salarioDepto3 = ventasDepto3 > porcentajeVentas ? salarioBase * 1.2 : salarioBase;

        return new double[]{salarioDepto1, salarioDepto2, salarioDepto3};
    }
}
