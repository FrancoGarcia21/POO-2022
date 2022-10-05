package facade;

import modelo.Bateria;
import modelo.GPS;
import modelo.Pago;

public class Facade {
    GPS gps = new GPS();
    Pago pago = new Pago();
    Bateria bateria = new Bateria();

    public void desbloquear() {
        if (!gps.hayConexion() ) gps.conectar();
        if (!bateria.hayCarga()) bateria.cargar();
        if (!pago.estaPagado()) pago.pagar();
    }


}
