package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Buenas Ingresa numero 1: ");
        int a = teclado.nextInt();
        System.out.println("Buenas Ingresa numero 2: ");
        int b = teclado.nextInt();
        teclado.close();
        int suma=0;
        for (int i = 0; i < b; i++) {
            suma=suma+a;
            System.out.println(i);
        }
        System.out.println(a+"*"+b+"="+suma);
    }
}
