public class CuentaCheque extends Cuenta{

    private double costoManejoMensual;
    public CuentaCheque (int numero, double saldo, double costoManejoMensual) {
        super(numero, saldo);
        this.costoManejoMensual = costoManejoMensual;
    }
    public Double getCostoManejoMensual() {
        return costoManejoMensual;
    }
    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual= costoManejoMensual;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta de Cheque:");
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Fecha de Apertura: " + fechaApertura);
        System.out.println("Costo Manejo Mensual de Cuenta: " + costoManejoMensual + "%");
    }
}
