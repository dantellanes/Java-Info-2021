package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio82 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresa tu Nombre y Apellido: ");
    String nombreYApellido = teclado.nextLine();
    System.out.println("Ingresa tu edad: ");
    int edad = teclado.nextInt();
    System.out.println("Ingresa tu direccion: ");
    String dire = teclado.nextLine();
    System.out.println("Ingresa tu Ciudad: ");
    String ciudad = teclado.nextLine();

    Persona persona = new Persona(nombreYApellido, edad, dire, ciudad);
    System.out.println(persona.toString());
    


    //System.out.println(ciudad+" - "+ direccion+" - "+ edad + " - "+ nombreYApellido);
    teclado.close();
   }
}
