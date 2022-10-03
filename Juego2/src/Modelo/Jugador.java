package Modelo;

import Controlador.Teclado;

public class Jugador extends Criatura{

	private int animacion;
	private Teclado teclado;
	
	public Jugador(Teclado teclado, Sprite sprite, Mapa mapa) {
		this.teclado = teclado;
		this.sprite = sprite;
		this.mapa = mapa;
	}
	
	public Jugador(Teclado teclado, int posicionX, int posicionY, Sprite sprite, Mapa mapa) {
		this.mapa = mapa;
		this.teclado = teclado;
		this.x = posicionX;
		this.y = posicionY;
		this.sprite = sprite;
	}
	
	public void actualizar() {
		int desplazamientoX = 0;
		int desplazamientoY = 0;
		
		int velocidadMovimiento = 1;
		
		if(animacion < 32767) {
			animacion++;
		}else {
			animacion = 0;
		}
		
		if(teclado.correr) {
			velocidadMovimiento = 2;
		}
		
		if(teclado.arriba) {
			desplazamientoY-=velocidadMovimiento;
		}
		if(teclado.abajo) {
			desplazamientoY+=velocidadMovimiento;
		}
		if(teclado.izquierda) {
			desplazamientoX-=velocidadMovimiento;
		}
		if(teclado.derecha) {
			desplazamientoX+=velocidadMovimiento;
		}
		
		if(desplazamientoX != 0 || desplazamientoY != 0) {
			mover(desplazamientoX,desplazamientoY);
			enMovimiento = true;
		}else {
			enMovimiento = false;
		}
		
		int resto = animacion % 60; 
		
		if(direccion == 'n') {
			sprite = Sprite.ABAJO0;
			if(enMovimiento) {
				if(resto > 10 && resto <= 20) {
					sprite = sprite.ABAJO3;
				}else if(resto > 20 && resto <= 30) {
					sprite = sprite.ABAJO2;
				}else if(resto > 30 && resto <= 40) {
					sprite = sprite.ABAJO1;
				}else if(resto > 40 && resto <= 50){
					sprite = sprite.ABAJO4;
				}else{	
					sprite = sprite.ABAJO5;
				}
			}
		}
		if(direccion == 's') {
			sprite = Sprite.FRENTE0;
			if(enMovimiento) {
				if(resto > 10 && resto <= 20) {
					sprite = sprite.FRENTE3;
				}else if(resto > 20 && resto <= 30) {
					sprite = sprite.FRENTE2;
				}else if(resto > 30 && resto <= 40) {
					sprite = sprite.FRENTE1;
				}else if(resto > 40 && resto <= 50){
					sprite = sprite.FRENTE4;
				}else {	
					sprite = sprite.FRENTE5;
				}
			}
		}
		if(direccion == 'o') {
			sprite = Sprite.IZQUIERDA0;
			if(enMovimiento) {
				if(resto > 10 && resto <= 20) {
					sprite = sprite.IZQUIERDA1;
				}else if(resto > 20 && resto <= 30) {
					sprite = sprite.IZQUIERDA2;
				}else if(resto > 30 && resto <= 40) {
					sprite = sprite.IZQUIERDA3;
				}else if(resto > 40 && resto <= 50){
					sprite = sprite.IZQUIERDA4;
				}else {	
					sprite = sprite.IZQUIERDA5;
				}
			}
		}
		if(direccion == 'e') {
			sprite = Sprite.DERECHA0;
			if(enMovimiento) {
				if(resto > 10 && resto <= 20) {
					sprite = sprite.DERECHA1;
				}else if(resto > 20 && resto <= 30) {
					sprite = sprite.DERECHA2;
				}else if(resto > 30 && resto <= 30) {
					sprite = sprite.DERECHA3;
				}else if(resto > 40 && resto <= 50){
					sprite = sprite.DERECHA4;
				}else {	
					sprite = sprite.DERECHA5;
				}
			}
		}
	}
	
	public void mostrar(Pantalla pantalla) {
		pantalla.mostrarJugador(x, y, this);
	}
}
