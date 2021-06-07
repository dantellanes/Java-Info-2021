package ejerComplementarios2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int num1=0;
        int num2=0;
        System.out.println("Ingrese primer numero: ");
        num1=str.nextInt();
        System.out.println("Ingrese 2do numero(tiene que ser mayor que el primero): ");
        num2=str.nextInt();
        while(num1>num2){
            System.out.println("numero ingresado es menro que l primer numero ");
            System.out.println("Ingrese primer numero: ");
        num1=str.nextInt();
        System.out.println("Ingrese 2do numero(tiene que ser mayor que el primero): ");
        num2=str.nextInt();
        }
        String[] array = arreglo(num1, num2);
        for (String s : array) {
            System.out.print(s + " - ");
        }
        
    }

    private static String[] arreglo(int num1, int num2) {
        String[] array = new String[num2 - 1];
        array[0] = String.valueOf(num1);
        for (int i = 1; i < array.length; i++) {
            if (((num1 + i) % 2 == 0) && ((num1 + i) % 3 == 0)) {
                array[i] = "FizzBuzz";
            } else if ((num1 + i) % 3 == 0) {
                array[i] = "Buzz";
            } else if ((num1 + i) % 2 == 0) {
                array[i] = "Fizz";
            } else {
                array[i] = String.valueOf(num1 + i);
            }
        }
        return array;
    }
}


