package Modelo;

public class Sprite {
	private final int lado;
	private int x;
	private int y;
	public int[] pixeles;
	private HojaSprites hoja;
	
	public static final Sprite ABAJO0 = new Sprite(32, 0, 0, 0, HojaSprites.jugador);
	public static final Sprite ABAJO1 = new Sprite(32, 1, 0, 0, HojaSprites.jugador);
	public static final Sprite ABAJO2 = new Sprite(32, 2, 0, 0, HojaSprites.jugador);
	public static final Sprite ABAJO3 = new Sprite(32, 3, 0, 0, HojaSprites.jugador);
	public static final Sprite ABAJO4 = new Sprite(32, 4, 0, 0, HojaSprites.jugador);
	public static final Sprite ABAJO5 = new Sprite(32, 5, 0, 0, HojaSprites.jugador);
	
	public static final Sprite IZQUIERDA0 = new Sprite(32, 0, 1, 0, HojaSprites.jugador);
	public static final Sprite IZQUIERDA1 = new Sprite(32, 1, 1, 0, HojaSprites.jugador);
	public static final Sprite IZQUIERDA2 = new Sprite(32, 2, 1, 0, HojaSprites.jugador);
	public static final Sprite IZQUIERDA3 = new Sprite(32, 3, 1, 0, HojaSprites.jugador);
	public static final Sprite IZQUIERDA4 = new Sprite(32, 4, 1, 0, HojaSprites.jugador);
	public static final Sprite IZQUIERDA5 = new Sprite(32, 5, 1, 0, HojaSprites.jugador);
	
	public static final Sprite DERECHA0 = new Sprite(32, 0, 1, 1, HojaSprites.jugador);
	public static final Sprite DERECHA1 = new Sprite(32, 1, 1, 1, HojaSprites.jugador);
	public static final Sprite DERECHA2 = new Sprite(32, 2, 1, 1, HojaSprites.jugador);
	public static final Sprite DERECHA3 = new Sprite(32, 3, 1, 1, HojaSprites.jugador);
	public static final Sprite DERECHA4 = new Sprite(32, 4, 1, 1, HojaSprites.jugador);
	public static final Sprite DERECHA5 = new Sprite(32, 5, 1, 1, HojaSprites.jugador);
	
	public static final Sprite FRENTE0 = new Sprite(32, 0, 2, 0, HojaSprites.jugador);
	public static final Sprite FRENTE1 = new Sprite(32, 1, 2, 0, HojaSprites.jugador);
	public static final Sprite FRENTE2 = new Sprite(32, 2, 2, 0, HojaSprites.jugador);
	public static final Sprite FRENTE3 = new Sprite(32, 3, 2, 0, HojaSprites.jugador);
	public static final Sprite FRENTE4 = new Sprite(32, 4, 2, 0, HojaSprites.jugador);
	public static final Sprite FRENTE5 = new Sprite(32, 5, 2, 0, HojaSprites.jugador);
	
	public static final Sprite ROCA = new Sprite(32, 0, 0, 0,HojaSprites.hSprite);
	public static final Sprite MAR = new Sprite(32, 3, 0, 0,HojaSprites.hSprite);
	public static final Sprite MAR_BORDE = new Sprite(32, 4, 1, 0,HojaSprites.hSprite);
	public static final Sprite ARBOLES = new Sprite(32, 0, 1, 0,HojaSprites.hSprite);
	public static final Sprite CAMINO_CON_ENTRADA = new Sprite(32, 1, 1, 0,HojaSprites.hSprite);
	public static final Sprite CESPED_BARRANCO = new Sprite(32, 2, 1, 0,HojaSprites.hSprite);
	public static final Sprite CESPED_BARRANCO_IZQ = new Sprite(32, 2, 1, 4,HojaSprites.hSprite);
	public static final Sprite CESPED_BARRANCO_DER = new Sprite(32, 2, 1, 5,HojaSprites.hSprite); //no me anda
	public static final Sprite CESPED_BARRANCO_INV = new Sprite(32, 2, 1, 2,HojaSprites.hSprite); //no me anda
	public static final Sprite CESPED = new Sprite(32, 1, 2, 0,HojaSprites.hSprite);
	public static final Sprite CAMINO = new Sprite(32, 2, 2, 0,HojaSprites.hSprite);
	public static final Sprite TIERRA = new Sprite(32, 5, 2, 0,HojaSprites.hSprite);
	public static final Sprite TECHO_GYM_IZQ = new Sprite(32, 4, 3, 0,HojaSprites.hSprite);
	public static final Sprite TECHO_GYM_CEN = new Sprite(32, 6, 3, 0,HojaSprites.hSprite);
	public static final Sprite TECHO_GYM_DER = new Sprite(32, 8, 3, 0,HojaSprites.hSprite);
	public static final Sprite PARED_GYM_IZQ = new Sprite(32, 3, 4, 0,HojaSprites.hSprite);
	public static final Sprite PARED_GYM_CEN = new Sprite(32, 5, 4, 0,HojaSprites.hSprite);
	public static final Sprite PARED_GYM_DER = new Sprite(32, 7, 4, 0,HojaSprites.hSprite);
	public static final Sprite CESPED_YERBA = new Sprite(32, 4, 5, 0,HojaSprites.hSprite);
	public static final Sprite CARTEL_GYM = new Sprite(32, 8, 5, 0,HojaSprites.hSprite);
	public static final Sprite VACIO = new Sprite(32, 0);
	
	public Sprite(final int lado, final int columna, final int fila, final int version, final HojaSprites hoja) {
		this.lado = lado;
		pixeles = new int[lado * lado];
		this.x = columna * lado;
		this.y = fila * lado;
		this.hoja = hoja;
		
		cargarSprite(version);
	}
	
	public Sprite(final int lado,final int color) {
		this.lado = lado;
		pixeles = new int[this.lado * this.lado];
		for(int i = 0; i < pixeles.length; i++) {
			pixeles[i] = color;
		}
	}
	
	private void cargarSprite(int version) {
		if(version == 0) {
			cargaNormal();
		}else {
			cargaManipulada(version);
		}
	}
	
	private void cargaNormal() {
		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				/*Porque no usar una matriz? porque es mucho mas lento con un array normal*/
				pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
			}
		}
	}
	
	private void cargaManipulada(int version) {
		int[] pixelesTemp = iniciarPixelesTemp();
		switch(version) {
			case 1:
				invertirX(pixelesTemp);
				break;
			case 2:
				invertirY(pixelesTemp);
				break;
			case 3:
				invertirXY(pixelesTemp);
				break;
			case 4:
				rotar90izq(pixelesTemp);
				break;
			case 5:
				rotar90der(pixelesTemp);
				break;
			case 6:
				rotar90IzqInvertidoY(pixelesTemp);
				break;
			case 7:
				rotar90derInvertidoY(pixelesTemp);
				break;
			default:
				cargaNormal();
		}
		
	}
	
	private int[] iniciarPixelesTemp () {
		int[] pixelesTemp = new int[lado * lado];
		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				pixelesTemp[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
			}
		}
		return pixelesTemp;
	}
	
	private void invertirXY(int[] pixelesTemp) {
		for(int i = 0; i < pixeles.length; i++) {
			pixeles[i] = pixelesTemp[pixelesTemp.length - 1 - i];
		}
	}
	
	private void invertirX(int[] pixelesTemp) {
		int i = 0;
		for(int y = 0; y < lado; y++) {
			for(int x = lado - 1; x > -1; x--) {
				pixeles[i] = pixelesTemp[x + y * lado];
				i++;
			}
		}
	}
	
	private void invertirY(int[] pixelesTemp) {
		int i = 0;
		for(int y = lado - 1; y > -1; y--) {
			for(int x = 0; x < 0; x++) {
				pixeles[i] = pixelesTemp[x + y * lado];
				i++;
			}
		}
	}
	
	private void rotar90izq(int[] pixelesTemp) {
		int i = 0;
		for(int x = lado - 1; x > -1; x--) {
			for(int y = 0; y < lado; y++) {
				pixeles[i] = pixelesTemp[x + y * lado];
				i++;
			}
		}
	}
	
	private void rotar90der(int[] pixelesTemp) {
		int i = 0;
		System.out.println(i);
		for(int x = 0; x < lado; x++) {
			for(int y = lado - 1; y > -1; y--) {
				pixeles[i] = pixelesTemp[x + y * lado];
				i++;
			}
		}
	}
	
	private void rotar90IzqInvertidoY(int[] pixelesTemp) {
		int i = 0;
		for(int x = 0; x < lado; x++) {
			for(int y = 0; y < 0; y++) {
				pixeles[i] = pixelesTemp[x + y * lado];
				i++;
			}
		}
	}
	
	private void rotar90derInvertidoY(int[] pixelesTemp) {
		int i = 0;
		for(int x = lado - 1; x > -1; x--) {
			for(int y = lado - 1; y > -1; y--) {
				pixeles[i] = pixelesTemp[x + y * lado];
				i++;
			}
		}
	}
	
	public int getLado() {
		return lado;
	}
	
}
