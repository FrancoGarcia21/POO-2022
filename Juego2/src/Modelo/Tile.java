package Modelo;

public class Tile {
	
	public int x;
	public int y;
	
	public static final int LADO = 32;
	public Sprite sprite;
	private boolean solido;
	
	public static final Tile ROCA = new Tile(Sprite.ROCA, true);
	public static final Tile MAR = new Tile(Sprite.MAR, true);
	public static final Tile MAR_BORDE = new Tile(Sprite.MAR_BORDE, true);
	public static final Tile ARBOLES = new Tile(Sprite.ARBOLES, true);
	public static final Tile CAMINO_CON_ENTRADA = new Tile(Sprite.CAMINO_CON_ENTRADA);
	public static final Tile CESPED_BARRANCO = new Tile(Sprite.CESPED_BARRANCO);
	public static final Tile CESPED_BARRANCO_DER = new Tile(Sprite.CESPED_BARRANCO_DER);
	public static final Tile CESPED_BARRANCO_IZQ = new Tile(Sprite.CESPED_BARRANCO_IZQ);
	public static final Tile CESPED_BARRANCO_INV = new Tile(Sprite.CESPED_BARRANCO_INV);
	public static final Tile CESPED = new Tile(Sprite.CESPED);
	public static final Tile CAMINO = new Tile(Sprite.CAMINO);
	public static final Tile TIERRA = new Tile(Sprite.TIERRA);
	public static final Tile TECHO_GYM_IZQ = new Tile(Sprite.TECHO_GYM_IZQ, true);
	public static final Tile TECHO_GYM_CEN = new Tile(Sprite.TECHO_GYM_CEN, true);
	public static final Tile TECHO_GYM_DER = new Tile(Sprite.TECHO_GYM_DER, true);
	public static final Tile PARED_GYM_IZQ = new Tile(Sprite.PARED_GYM_IZQ, true);
	public static final Tile PARED_GYM_CEN = new Tile(Sprite.PARED_GYM_CEN, true);
	public static final Tile PARED_GYM_DER = new Tile(Sprite.PARED_GYM_DER, true);
	public static final Tile CARTEL_GYM = new Tile(Sprite.CARTEL_GYM, true);
	public static final Tile CESPED_YERBA = new Tile(Sprite.CESPED_YERBA);
	
	public static final Tile VACIO = new Tile(Sprite.MAR, true);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
		solido = false;
	}
	
	public Tile(Sprite sprite, boolean solido) {
		this.sprite = sprite;
		this.solido = solido;
	}
	
	public void mostrar(int x, int y, Pantalla pantalla) {
		pantalla.mostrarTile(x << 5, y << 5,this);
	}
	
	public boolean solido() {
		return solido;
	}

}
