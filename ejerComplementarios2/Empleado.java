package ejerComplementarios2;

class Empleado {
    String nombre;
    int dni;
    float horasTrabajadas;
    float precioXHora;

    public Empleado(String nombre, int dni, float horasTrabajadas, float precioXHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.precioXHora = precioXHora;
    }

    public int getDni() {
        return dni;
    }

    public float getSalario() {
        return this.horasTrabajadas * this.precioXHora;
    }
}
