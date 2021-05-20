package empleados;

/* 
 . En comercial, si tiene más de 30 años y cobra una comisión de más de 200 soles, se le aplicara el plus.
 . En repartidor, si tiene menos de 25 y reparte en la “Lima”, este recibirá el plus.

 */
public class Comercial extends Empleado {

    private double comision;

    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Comision : " + comision;
    }

    @Override
    public boolean plus() {
        //si tiene más de 30 años y cobra una comisión de más de 200
        if (super.getEdad() > 30 && this.comision > 200) { //la palabra super hace referencia a la super clase
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("\nSe la ha añadido el PLUS al empleado " + super.getNombre());
            System.out.println("Su salario actual es : " + nuevoSalario);
            return true;
        } else {
            System.out.println("\nEl empleado no cumple con los requisitos para el PLUS . ");
            return false;
        }
    }

}
