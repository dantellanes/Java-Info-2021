package ejerciciosComplementarios1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Buenas Ingresa numero 1: ");
        int a = teclado.nextInt();
        System.out.println("Buenas Ingresa numero 2: ");
        int b = teclado.nextInt();
        teclado.close();
        Calculadora ejer1 = new Calculadora(a,b);
        System.out.println(ejer1.suma());
        System.out.println(ejer1.resta());
        System.out.println(ejer1.division());
        System.out.println(ejer1.multiplicacion());
    }
    
}
