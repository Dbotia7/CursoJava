public class CuentaAhorro extends Cuenta {

private double tasaInteresMensual;

    public CuentaAhorro (int numero, double saldo, double tasaInteresMensual) {
        super(numero, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }
    public Double getTasaInteresMensual() {
        return tasaInteresMensual;
    }
    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual= tasaInteresMensual;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta de Ahorro:");
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Fecha de Apertura: " + fechaApertura);
        System.out.println("Tasa de Interés Mensual: " + tasaInteresMensual + "%");
    }
}
