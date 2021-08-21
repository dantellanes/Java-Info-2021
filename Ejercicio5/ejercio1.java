package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercio1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Buenas Ingresa numero 1: ");
        int a = teclado.nextInt();
        System.out.println("Buenas Ingresa numero 2: ");
        int b = teclado.nextInt();
        teclado.close();
        int result= gcd(a, b);
        if (result==1){
            System.out.println("son coprimos");
        }else{
            System.out.println("No soy coprimos");
        } 
    }
    public static int gcd(final int a, final int b) {
        int dividend = a;
        int divisor = b;
        int rest;
        while ((rest = dividend % divisor) != 0) {
            dividend = divisor;
            divisor = rest;
        }
        return divisor;
    }

}