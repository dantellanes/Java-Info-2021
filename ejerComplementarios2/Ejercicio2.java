package ejerComplementarios2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); 
        numeros.add(17);
        numeros.add(23);
        numeros.add(1);
        numeros.add(7);
        numeros.add(217);

        System.out.println("Lista inicial");
        System.out.println("Tamaño: " + numeros.size());
        for (int i : numeros) {
            System.out.println(i);
        }
        numeros.add(0, 48);
        numeros.add(59);
        System.out.println("Lista Final");
        System.out.println("Tamaño: "+ numeros.size());
        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
