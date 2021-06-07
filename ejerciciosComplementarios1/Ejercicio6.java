package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Buenas Ingresa numero 1: ");
        int a = teclado.nextInt();
        System.out.println("Buenas Ingresa numero 2: ");
        int b = teclado.nextInt();
        teclado.close();
        int result=1;
        for (int i = 1; i <= b; i++) {
            //System.out.println(a);
            result=result*a;
            //System.out.println(result);
        }
        System.out.println(a+" elevado a "+b+" = "+result);
    }
}
