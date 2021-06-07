package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Buenas Ingresa tu usuario: ");
        String usuario = teclado.nextLine();
        System.out.println("Bienvenido " + usuario + " En que te puedo ayudar!");
        teclado.close();
        
    }
}