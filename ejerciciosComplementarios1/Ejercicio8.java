package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu Nombre y Apellido: ");
        String nombreYApellido = teclado.nextLine();
        System.out.println("Ingresa tu edad: ");
        String edad = teclado.nextLine();
        System.out.println("Ingresa tu direccion: ");
        String direccion = teclado.nextLine();
        System.out.println("Ingresa tu Ciudad: ");
        String ciudad = teclado.nextLine();


        System.out.println(ciudad+" - "+ direccion+" - "+ edad + " - "+ nombreYApellido);
        teclado.close();
    }

}