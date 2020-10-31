package Domain;

public class Directo extends Empleado{
    private static final double SALUD =  0.05;
    private static final double PENSION =  0.065;
    private long salario;

    public Directo(String nombre,long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {
        long sal, salud ,pencion;
        salud = calcularSalud();
        pencion = calcularPension();
        sal = this.salario - salud - pencion;
        return sal;
    }
    private long calcularSalud()
    {
        long salud;
        salud = (long) (this.salario*SALUD);
        return salud;
    }
    private long calcularPension()
    {
        long pension;
        pension = (long) (this.salario*PENSION);
        return pension;
    }

}
