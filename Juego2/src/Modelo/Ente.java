package Modelo;

public abstract class Ente {

	protected int x;
	protected int y;
	private boolean eliminado = false;
	protected Mapa mapa;
	
	public void acturalizar() {}
	public void mostrar() {}
	public void eliminar() {eliminado = true;}
	public int getX() {return x;}
	public int getY() {return y;}
	public void setX(int x) {this.x += x;}
	public void setY(int y) {this.y += y;}
	public boolean getEliminado() {return eliminado;}
}
