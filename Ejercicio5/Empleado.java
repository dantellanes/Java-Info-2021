package Ejercicio5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado {
    
    String nombre;
    String apellido;
    LocalDate fechNac;
    float sueldo;

    public Empleado(String nombre, String apellido, String fechNac, float sueldo ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechNac = LocalDate.parse(fechNac, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sueldo = sueldo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public LocalDate getFechaNac(){
        return fechNac;
    }
    public float getSueldo(){
        return sueldo;
    }
    public int getEdad() {
        Period edad = Period.between(this.fechNac, LocalDate.now());
        return edad.getYears();
    }

    @Override
    public String toString() {
        return String.valueOf(this.apellido + "-" + this.nombre +" - " + this.fechNac+ " - " + this.sueldo);
    }
}
