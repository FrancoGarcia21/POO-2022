package modelo;

public class Bateria {

    private int carga;

    public boolean hayCarga(){
        return carga > 10;
    }

    public void cargar(){
    	carga = 100;
    }

}
