package Domain;

public class Promotor extends Empleado {
    public static long COMPRA = 15000;
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre,int volantesRepartidos,long valorVolante,int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante =valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {
        long sal;
        sal = this.valorVolante*this.volantesRepartidos +(COMPRA * this.comprasVolante);
        return sal;
    }

}
