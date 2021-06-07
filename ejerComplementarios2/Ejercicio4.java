package ejerComplementarios2;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> Estudiantes = new ArrayList<>();

        Estudiantes.add("LLanes Dante");
        Estudiantes.add("Muchutti Conztanza");
        Estudiantes.add("Martinez Estela");
        Estudiantes.add("Vegas Sophia");
        Estudiantes.add("Libardi juan Diego");
        Estudiantes.add("Martinez Carlos");
        Estudiantes.add("Emilce Reyes");
        Estudiantes.add("Pierandrey Yanina");
        Estudiantes.add("Dellamea Juan");
        Estudiantes.add("Giovanini Luca");
        Estudiantes.add("Tofalletti Isolina");
        Estudiantes.add("Gonzalez Jenny");

        List<String> clase1 = Estudiantes.subList(0,4);
        List<String> clase2 = Estudiantes.subList(4,8);
        List<String> clase3 = Estudiantes.subList(8, Estudiantes.size());

        System.out.println("Primer A");
        for (String student : clase1) {
            System.out.println(student);
        }

        System.out.println("\nSegundo B");
        for (String student : clase2) {
            System.out.println(student);
        }

        System.out.println("\nTercer C");
        for (String student : clase3) {
            System.out.println(student);
        }
    }
}
