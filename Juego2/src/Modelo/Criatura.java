package Modelo;

public abstract class Criatura extends Ente{
	
	protected Sprite sprite;
	protected char direccion = 'n';
	protected boolean enMovimiento = false;
	
	public void actualizar() {}
	public void mostrar() {}
	
	public void mover(int despalazamientoX , int desplazamientoY) {
		if(despalazamientoX > 0) {
			direccion = 'e';
		}
		if(despalazamientoX < 0) {
			direccion = 'o';
		}
		if(desplazamientoY > 0) {
			direccion = 's';
		}
		if(desplazamientoY < 0) {
			direccion = 'n';
		}
		
		if(!getEliminado()) {
			if(!enColision(despalazamientoX,0)) {
				setX(despalazamientoX);
			}
			if(!enColision(0, desplazamientoY)) {
				setY(desplazamientoY);
			}
		}
	}
	
	private boolean enColision(int desplazamientoX, int desplazamientoY) {
		
		boolean colision = false;
		
		int posicionX = x + desplazamientoX;
		int posicionY = y + desplazamientoY;
		
		int margenIzquierdo = -6; //revisar estos valores para ver si funciona sino ir modificando los valores
		int margenDerecho = 18;
		
		int margenSuperior = -4;
		int margenInferior = 31;
		
		int bordeIzquierdo = (posicionX + margenDerecho) / sprite.getLado();
		int bordeDerecho = (posicionX + margenDerecho + margenIzquierdo) / sprite.getLado();
		int bordeSuperior = (posicionY + margenInferior) / sprite.getLado();
		int bordeInferior = (posicionY + margenInferior + margenSuperior) / sprite.getLado();
		
		if(mapa.getCuadrosCatologo(bordeIzquierdo+bordeSuperior*mapa.getAncho()).solido()) {
			colision = true;
		}
		if(mapa.getCuadrosCatologo(bordeIzquierdo+bordeInferior*mapa.getAncho()).solido()) {
			colision = true;
		}
		if(mapa.getCuadrosCatologo(bordeDerecho+bordeSuperior*mapa.getAncho()).solido()) {
			colision = true;
		}
		if(mapa.getCuadrosCatologo(bordeDerecho+bordeInferior*mapa.getAncho()).solido()) {
			colision = true;
		}
		
		return colision;
	}

	public Sprite getSprite() {
		return sprite;
	}
	
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
}
