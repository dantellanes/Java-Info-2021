package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresa texto: ");
    String cadena = teclado.nextLine();
    System.out.println("Ingresa letra a buscar: ");
    char letra = teclado.next().charAt(0);
    teclado.close();
    char str[]=cadena.toCharArray();
    int cont=0;
   for (char c : str) {
       //System.out.println(c);
       if (letra== c) {
           cont=cont+1;
       }
   }
   System.out.println("se encontro "+letra+": "+cont);
}
}
