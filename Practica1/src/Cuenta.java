public abstract class Cuenta implements Comparable<Cuenta> {
    protected int numero;
    protected String fechaApertura;
    protected double saldo;
    private String fechaCancelacion;


    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.fechaApertura = "13-09-2024";
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero= numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo= saldo;
    }
    public String getFechaApertura(){
        return fechaApertura;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    @Override
    public int compareTo(Cuenta cuenta) {
        return Double.compare(this.saldo, cuenta.getSaldo());
    }
    public abstract void mostrarDetalles();

}
