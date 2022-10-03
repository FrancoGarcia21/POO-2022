package Modelo;

public class MapaCargado extends Mapa{

		private int[] pixeles;
		
		public MapaCargado(int[][] matriz) {
			super(matriz);
		}

		protected void cargarMapa(int[][] matriz) {
			tiledCatalogo = new Tile[ancho * alto];
			pixeles = new int[ancho * alto];
			int pos = 0;
			for(int x = 0;x < alto; x++) {
				for(int y = 0; y < ancho; y++) {
					pixeles[pos] = matriz[x][y];
					pos++;
				}
			}
		}
		
		protected void generarMapa() {
			for(int i = 0; i < pixeles.length; i++) {
				switch(pixeles[i]) {
				case 0:
					tiledCatalogo[i] = Tile.CAMINO;
					continue;
				case 1:
					tiledCatalogo[i] = Tile.ARBOLES;
					continue;
				case 2:
					tiledCatalogo[i] = Tile.CARTEL_GYM;
					continue;
				case 3:
					tiledCatalogo[i] = Tile.CAMINO_CON_ENTRADA;
					continue;
				case 4:
					tiledCatalogo[i] = Tile.CESPED;
					continue;
				case 5:
					tiledCatalogo[i] = Tile.ROCA;
					continue;
				case 6:
					tiledCatalogo[i] = Tile.MAR;
					continue;
				case 7:
					tiledCatalogo[i] = Tile.TIERRA;
					continue;
				case 8:
					tiledCatalogo[i] = Tile.TECHO_GYM_IZQ;
					continue;
				case 9:
					tiledCatalogo[i] = Tile.TECHO_GYM_CEN;
					continue;
				case 10:
					tiledCatalogo[i] = Tile.TECHO_GYM_DER;
					continue;
				case 11:
					tiledCatalogo[i] = Tile.CESPED_YERBA;
					continue;
				case 12:
					tiledCatalogo[i] = Tile.PARED_GYM_IZQ;
					continue;
				case 13:
					tiledCatalogo[i] = Tile.PARED_GYM_CEN;
					continue;
				case 14:
					tiledCatalogo[i] = Tile.MAR_BORDE;
					continue;
				case 15:
					tiledCatalogo[i] = Tile.PARED_GYM_DER;
					continue;
				case 16:
					tiledCatalogo[i] = Tile.CESPED_BARRANCO;
					continue;
				case 17:
					tiledCatalogo[i] = Tile.CESPED_BARRANCO_IZQ;
					continue;
				case 18:
					tiledCatalogo[i] = Tile.CESPED_BARRANCO_DER;
					continue;
				case 19:
					tiledCatalogo[i] = Tile.CESPED_BARRANCO_INV;
					continue;
				default:
					tiledCatalogo[i] = Tile.TIERRA;
				}
			}
				
		}
		
	}
