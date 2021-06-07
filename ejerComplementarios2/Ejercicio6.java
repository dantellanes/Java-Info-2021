package ejerComplementarios2;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleados= new HashSet<>();
        HashMap<Integer, Float> sueldos = new HashMap<>();
        empleados.add(new Empleado("dante", 31887866, 10, 99654));
        empleados.add(new Empleado("Paiva ", 46632223, 6, 54233));
        empleados.add(new Empleado("Emma ", 12553232, 8, 56432));
        empleados.add(new Empleado("Estela", 16449134, 6, 11225));

        for (Empleado e : empleados) {
            sueldos.put(e.getDni(), e.getSalario());
        }

        sueldos.forEach((dni, sueldo) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + sueldo));
    }
}

