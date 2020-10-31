package Domain;

public class Freelance extends Empleado {
    private long volarHora;
    private int horasTrabajadas;

    public Freelance(String nombre,long valorHora,int horasTrabajadas) {
        super(nombre);
        this.volarHora = valorHora;
        this.horasTrabajadas =horasTrabajadas;
    }

    public long getVolarHora() {
        return volarHora;
    }

    public void setVolarHora(long volarHora) {
        this.volarHora = volarHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        long sal;
        sal = this.volarHora*this.horasTrabajadas;
        return sal;
    }


}
