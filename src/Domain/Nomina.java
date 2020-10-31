package Domain;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private ArrayList<Empleado> empleado = new ArrayList<>();

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void calcularNomina()
    {
        this.empleado.forEach(empleados->{
            System.out.println("El empleado:" + empleados.getNombre() + " tiene un salario de: " + empleados.calcularSalario());
        });
    }
    public void listarDirectos()
    {
        empleado.forEach(empleados ->{
            if (empleados instanceof Vendedor)
            {
                System.out.println(empleados.getNombre()+ " es una Vendedor");
            }
            else if (empleados instanceof  Directo)
            {
                System.out.println(empleados.getNombre()+ " es una empleado Directo ");
            }
        });

    }
    public void listarFreelancers()
    {
        empleado.forEach(empleados ->{
            if (empleados instanceof Freelance)
            {
                System.out.println(empleados.getNombre()+ " es un Freelance");
            }
        });

    }
    public void listarPromotores()
    {
        empleado.forEach(empleados ->{
            if (empleados instanceof Promotor)
            {
                System.out.println(empleados.getNombre()+ " es un Promotor");
            }
        });

    }

}
