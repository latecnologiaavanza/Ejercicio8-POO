package empleados;

/* 
 . En comercial, si tiene más de 30 años y cobra una comisión de más de 200 soles, se le aplicara el plus.
 . En repartidor, si tiene menos de 25 y reparte en la “Lima”, este recibirá el plus.

 */
public abstract class Empleado {

    //Atributos
    private String nombre;
    private int edad;
    private double salario;

    //creamos la constante PLUS que no va ha cambiar
    public final double PLUS = 300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nNombre : " + nombre + "\nEdad : " + edad + "\nSalario : " + salario;
    }

    //el metodo se va a implementar en sus clases hijas
    public abstract boolean plus();
}
