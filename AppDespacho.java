// Programa: AppDespacho.java
// Caso de estudio: Cálculo de despacho en una distribuidora de alimentos
// Autor: Hugo (estudiante de informática)
// Objetivo: Calcular el costo de despacho según las reglas de negocio
// y mostrar información del auto de reparto (predeterminado).

import java.util.Scanner;

public class AppDespacho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -----------------------------
        // 0) Mensaje inicial
        // -----------------------------
        System.out.println("========================================");
        System.out.println("   SISTEMA DE DESPACHO - ARAUS ALIMENTOS ");
        System.out.println("========================================");
        System.out.println("Reglas de negocio para el despacho:");
        System.out.println(" - Compras iguales o superiores a $50,000: Despacho GRATIS (dentro de 20 km).");
        System.out.println(" - Compras entre $25,000 y $49,999: $150 por kilómetro recorrido.");
        System.out.println(" - Compras menores a $25,000: $300 por kilómetro recorrido.");
        System.out.println(" - El servicio solo aplica dentro de un radio máximo de 20 km.\n");

        // -----------------------------
        // 1) Entrada de datos
        // -----------------------------
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su correo Gmail: ");
        String gmail = sc.nextLine();

        System.out.print("Ingrese el monto de la compra (CLP): ");
        int montoCompra = sc.nextInt();

        System.out.print("Ingrese la distancia al domicilio (km): ");
        int distanciaKm = sc.nextInt();

        // -----------------------------
        // 2) Validaciones
        // -----------------------------
        if (!gmail.toLowerCase().endsWith("@gmail.com")) {
            System.out.println("Error: El correo debe ser una cuenta Gmail.");
            return;
        }
        if (montoCompra < 0 || distanciaKm < 0) {
            System.out.println("Error: El monto y la distancia deben ser números positivos.");
            return;
        }
        if (distanciaKm > 20) {
            System.out.println("Fuera de cobertura: Solo se realizan despachos dentro de 20 km.");
            return;
        }

        // -----------------------------
        // 3) Cálculo del costo de despacho
        // -----------------------------
        int costoDespacho;
        String detalleDespacho; // para mostrar el cálculo en la salida

        if (montoCompra >= 50000) {
            costoDespacho = 0;
            detalleDespacho = "Despacho gratis por compras iguales o superiores a $50,000.";
        } else if (montoCompra >= 25000) {
            costoDespacho = 150 * distanciaKm;
            detalleDespacho = distanciaKm + " km = 150 x " + distanciaKm + " = $" + costoDespacho;
        } else {
            costoDespacho = 300 * distanciaKm;
            detalleDespacho = distanciaKm + " km = 300 x " + distanciaKm + " = $" + costoDespacho;
        }

        int totalPagar = montoCompra + costoDespacho;

        // -----------------------------
        // 4) Salida
        // -----------------------------
        System.out.println("\n--- RESUMEN DE LA COMPRA ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Correo: " + gmail);
        System.out.println("Monto de la compra: $" + montoCompra);
        System.out.println("Distancia al domicilio: " + distanciaKm + " km");
        System.out.println("Detalle costo despacho: " + detalleDespacho);
        System.out.println("Costo de despacho: $" + costoDespacho);
        System.out.println("TOTAL A PAGAR: $" + totalPagar);

        // -----------------------------
        // 5) Datos del auto (predeterminado)
        // -----------------------------
        System.out.println("\n--- VEHÍCULO DE REPARTO ---");
        System.out.println("Marca vehículo: Toyota");
        System.out.println("Modelo: RAV4");
        System.out.println("Cilindrada: 2000cc");
        System.out.println("Combustible: Bencina");
        System.out.println("Capacidad: 5 pasajeros");

        sc.close();
    }
}
