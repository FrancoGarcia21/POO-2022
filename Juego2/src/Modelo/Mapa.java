package Modelo;

public abstract class Mapa {

	protected int ancho;
	protected int alto;
	protected int[] tiled;
	protected Tile[] tiledCatalogo;
	
	public Mapa(int ancho, int alto) {
		this.alto = alto;
		this.ancho = ancho;
		
		tiled = new int[ancho * alto];
		generarMapa();
	}
	
	public Mapa(int[][] matriz) {
		this.alto = matriz.length;
		this.ancho = matriz[0].length;
		
		cargarMapa(matriz);
		generarMapa();
	}
	
	protected void generarMapa() {}
	
	protected void cargarMapa(int[][] matriz) {}
	
	public void actualizar() {}
	
	public void mostrar(int compesacionX, int compensacionY, Pantalla pantalla) {
		pantalla.estableceDiferencia(compesacionX, compensacionY);
		int oeste = compesacionX >> 5;//es lo mismo que dividir por 32 pero mas rapido, se llama bit shifting
		//Sirve para multiplos de dos solamente
	
		int este = (compesacionX + pantalla.getAncho() + Tile.LADO) >> 5;
		int norte = compensacionY >>5;
		int sur = (compensacionY + pantalla.getAlto() + Tile.LADO);
		for(int y = norte;y < sur;y++) {
			for(int x = oeste;x < este; x++) {
				if(x < 0 || y < 0 || x >= ancho || y >= alto) {
					Tile.VACIO.mostrar(x, y, pantalla);
				}else {
					tiledCatalogo[x+y*ancho].mostrar(x, y, pantalla);
				}
			}
		}
	}
	
	public Tile obtenerTile(final int x, final int y) {
		if(x < 0 || y < 0 || x >= ancho || y >= alto) {
			return Tile.VACIO;
		}
		switch (tiled[x + y * ancho]) {
		case 0:
			return Tile.ROCA;
		case 1:
			return Tile.MAR;
		case 2:
			return Tile.MAR_BORDE;
		case 3:
			return Tile.ARBOLES;
		case 4:
			return Tile.CAMINO_CON_ENTRADA;
		case 5:
			return Tile.CESPED_BARRANCO;
		case 6:
			return Tile.CESPED;
		case 7:
			return Tile.CAMINO;
		case 8:
			return Tile.TIERRA;
		case 9:
			return Tile.TECHO_GYM_IZQ;
		case 10:
			return Tile.TECHO_GYM_CEN;
		case 11:
			return Tile.TECHO_GYM_DER;
		case 12:
			return Tile.PARED_GYM_IZQ;
		case 13:
			return Tile.PARED_GYM_CEN;
		case 14:
			return Tile.PARED_GYM_DER;
		case 15:
			return Tile.CARTEL_GYM;
		default:
			return Tile.VACIO;
		}
	
	}
	
	public Tile getCuadrosCatologo(int posicion) {
		return tiledCatalogo[posicion];
	}
	
	public int getAncho() {
		return ancho;
	}
}
