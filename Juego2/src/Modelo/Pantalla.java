package Modelo;

public class Pantalla {
	
	private final int ancho;
	private final int alto;
	public final int[] pixeles;
	
	private int diferenciaX;
	private int diferenciaY;
	
	public Pantalla (final int ancho, final int alto) {
		this.ancho = ancho;
		this.alto = alto;
		pixeles = new int[ancho * alto];
	}
	
	//Recorre todos los pixeles y lo pinta en negro para que redibuje bien las pantallas
	public void limpiar() {
		for(int i = 0; i < pixeles.length; i++) {
			pixeles[i] = 0;//color en hexadecimal
		}
	}
	
	public void mostrarTile(int compensacionX, int compensacionY, Tile tile) {
		compensacionX -= diferenciaX;
		compensacionY -= diferenciaY;
		
		for(int y = 0;y < tile.sprite.getLado(); y++) {
			int posicionY = y + compensacionY;
			for(int x = 0; x < tile.sprite.getLado(); x++) {
				int posicionX = x + compensacionX;
				if(posicionX < -tile.sprite.getLado() || posicionX >= ancho || posicionY < 0 || posicionY >= alto) {
					break;
				}
				if(posicionX < 0) {
					posicionX = 0;
				}
				pixeles[posicionX + posicionY * ancho] = tile.sprite.pixeles[x + y * tile.sprite.getLado()];
			}
		}
	}
	
	public void mostrarJugador(int compensacionX, int compensacionY, Jugador jugador) {
		compensacionX -= diferenciaX;
		compensacionY -= diferenciaY;
	
		for(int y = 0;y < jugador.getSprite().getLado(); y++) {
			int posicionY = y + compensacionY;
			for(int x = 0; x < jugador.getSprite().getLado(); x++) {
				int posicionX = x + compensacionX;
				if(posicionX < -jugador.getSprite().getLado() || posicionX >= ancho || posicionY < 0 || posicionY >= alto) {
					break;
				}
				if(posicionX < 0) {
					posicionX = 0;
				}
				
				int colorPixelJugador = jugador.getSprite().pixeles[x + y * jugador.getSprite().getLado()];
				if(colorPixelJugador != 0xffff00ff) {
					pixeles[posicionX + posicionY * ancho] = colorPixelJugador;
				}
			}
		}
	}
	
	
	
	public void estableceDiferencia(final int diferenciaX, final int diferenciaY) {
		this.diferenciaX = diferenciaX;
		this.diferenciaY = diferenciaY;
	}
	
	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}

}
