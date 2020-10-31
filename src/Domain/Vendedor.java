package Domain;

public class Vendedor extends Directo{

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
            comision = (long) (this.ventasDelMes* 0.4);
       }
       else
       {
           comision = (long) (this.ventasDelMes*0.35);
       }
       return  comision;
    }
}
