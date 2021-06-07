package ejerciciosComplementarios1;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String ciudad;

    public Persona(String nombre, int edad, String direccion, String ciudad){
        this.nombre= nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return (this.ciudad+" - "+ this.direccion+" - "+ this.edad + " - "+ this.nombre);
    }

}
