package modelo;

public class GPS {

    private boolean signal = false;

    public boolean hayConexion() {
        return signal;
    }

    public void conectar() {
        signal = true;
    }

    public void desconectar() {
        signal = false;
    }


}
