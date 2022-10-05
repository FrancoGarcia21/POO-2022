package modelo;

public class Pago {

    private double importeRecibido;

    public boolean estaPagado() {
        return importeRecibido >= 50;
    }

    public void pagar() {
    	importeRecibido = 50;
    }

}
