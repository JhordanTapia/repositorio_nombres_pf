package proyectofinal;

import java.util.Scanner;

public class Final {

    public static void main(String[] args) {

        // 1. Declaración de variables y Scanner
        Scanner entrada = new Scanner(System.in);

        String nombreCliente;
        double compra1, compra2, compra3;
        double tc, pc;

        // 2. Entrada de datos
        System.out.print("Ingrese nombre de cliente: ");
        nombreCliente = entrada.nextLine();

        System.out.print("Ingrese compra 1: ");
        compra1 = entrada.nextDouble();

        System.out.print("Ingrese compra 2: ");
        compra2 = entrada.nextDouble();

        System.out.print("Ingrese compra 3: ");
        compra3 = entrada.nextDouble();

        // 3. Cálculos (Tus fórmulas)
        tc = compra1 + compra2 + compra3;
        pc = tc / 3;

        // 4. Salida de resultados
        System.out.println("Nombre de cliente: " + nombreCliente);
        System.out.println("Total (tc): " + tc);
        System.out.println("Promedio (pc): " + pc);

        entrada.close();
        System.out.println("Tapia Espinoza Jhordan");
    }

}