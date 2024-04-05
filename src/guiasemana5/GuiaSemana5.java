/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiasemana5;
import java.util.Scanner;

/**
 *
 * @author alons
 */
public class GuiaSemana5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("### MENU ###");
            System.out.println("1. Contar digitos");
            System.out.println("2. Suma de digitos");
            System.out.println("3. Maximo comun divisor (MCD)");
            System.out.println("4. Invertir cadena");
            System.out.println("5. CERRAR MENU");
            System.out.println("Eliga una opcion: ");
            opcion = leer.nextInt();
            
            Funciones operacion;
            int numero1, numero2;
            String caracter;

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingrese los digitos a contar: ");
                        try {
                            numero1 = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);

                    operacion = new Funciones(numero1);
                    int contar = operacion.getContar();
                    System.out.println("La cantidad de digitos es: " + contar);
                    System.out.println();
                    break;
                case 2:
                    do {
                        System.out.println("Ingrese los digitos a sumar: ");
                        try {
                            numero1 = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);

                    operacion = new Funciones(numero1);
                    int suma = operacion.getSuma();
                    System.out.println("La suma de los digitos es: " + suma);
                    System.out.println();
                    break;
                case 3:
                    do {
                        System.out.println("Ingrese los numeros para calcular el MCD: ");
                        try {
                            System.out.println("Numero 1: ");
                            numero1 = leer.nextInt();
                            System.out.println("Numero 2: ");
                            numero2 = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);

                    operacion = new Funciones(numero1, numero2);
                    int mcd = operacion.getMCD();
                    System.out.println("El minimo comun divisor es: " + mcd);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Ingrese la palabra a invertir: ");
                    caracter = leer.next();

                    Palabra cadena = new Palabra(caracter);
                    String invertir = cadena.getInvertir();
                    System.out.println("La palabra invertida es: " + invertir);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Cerrando menu");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo");
            }
        } while (opcion != 5);
    }
}
    

