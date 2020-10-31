package Domain;

public class Vendedor extends Directo{
    private static final double COMISIOMENOR =  0.04;
    private static final double COMISIOMAYOR =  0.035;
    private long ventasDelMes;

    public Vendedor(String nombre, long salario,long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    public long calcularSalario() {
        long sal;
        sal = this.getSalario()+calcularComision();
        return sal;
    }

    public long calcularComision()
    {
        long comision;
       if(this.getSalario()<1000000)
       {
            comision = (long) (this.ventasDelMes* COMISIOMENOR);
       }
       else
       {
           comision = (long) (this.ventasDelMes*COMISIOMAYOR);
       }
       return  comision;
    }
}
