package Controlador;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Modelo.Jugador;
import Modelo.Mapa;
import Modelo.MapaCargado;
import Modelo.Pantalla;
import Modelo.Sprite;
import Vista.JuegoVista;

public class JuegoController implements Runnable{
	
	JuegoVista vista;
	private static Thread thread;
	private static volatile boolean enFuncionamiento = false; //volatile significa que la variable no se puede usar por los dos thread al mismo tiempo
	private static Teclado teclado;
	private static Pantalla pantalla;
	private static Jugador jugador;
	private static Mapa mapa;
	private int[][] matriz;
	
	public JuegoController() {
		this.vista = new JuegoVista(this);
		generarMatriz();
		teclado = new Teclado();
		mapa = new MapaCargado(this.getMatriz());
		pantalla = new Pantalla(JuegoVista.getAncho(), JuegoVista.getAlto());
		jugador = new Jugador(teclado,  109, 183, Sprite.ABAJO0,mapa);
		this.vista.addKeyListener(teclado);
		this.iniciar();
	}
	
	@Override
	public void run() {
		final int NS_POR_SEGUNDO = 1000000000;//Equivalencia de cuantos nanos segundos hay en un segundo
		final byte APS_OBJETIVO = 60;//Cuantas actualizacion por segundo
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;//cuantos nanos segundos por actaulizacion
		long referenciaActualizacion = System.nanoTime();
		long referenciaContador = System.nanoTime();
		double tiempoTranscurrido;
		double delta = 0;//cantidad de tiempo transucrrido hasta que se realiza una actualizacion
		
		while(enFuncionamiento) {
			final long inicioBucle = System.nanoTime();
			tiempoTranscurrido = inicioBucle - referenciaActualizacion;//Cuanto a pasado entre el tiempo de inicio y el transucrrido
			referenciaActualizacion = inicioBucle;
			delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;
			
			this.vista.requestFocus();
			
			while (delta >= 1){
				actualizar();
				delta--;
			}
			
			vista.mostrar();
			
			if(System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {
				//JuegoVista.ventana.setTitle(JuegoVista.NOMBRE+" || APS: "+ this.vista.getAps() + " || FPS: " + this.vista.getFps());
				this.vista.setAps(0);
				this.vista.setFps(0);
				referenciaContador = System.nanoTime();
			}
			
		}
	}
	
	private synchronized void iniciar() {
		enFuncionamiento = true;
		thread = new Thread(this, "Graficos");
		thread.start();
	}
	
	private synchronized void detener() {
		enFuncionamiento = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void actualizar() {
		teclado.actualizar();
		jugador.actualizar();
		this.vista.setAps(this.vista.getAps()+1);
	}
	
	public void mostrar(Graphics g) {
		pantalla.limpiar();
		mapa.mostrar(jugador.getX() - pantalla.getAncho()/2 + jugador.getSprite().getLado()/2, 
				jugador.getY() - pantalla.getAlto() / 2 + jugador.getSprite().getLado()/2, pantalla);
		jugador.mostrar(pantalla);
		System.arraycopy(pantalla.pixeles, 0,JuegoVista.getPixeles() ,0, JuegoVista.getPixeles().length);
		//g.drawString("FPS = "+this.vista.getFps(), 10, 20);
		g.drawImage(JuegoVista.getImagen(), 0, 0, this.vista.getWidth(), this.vista.getHeight(), null);
		g.dispose();

	}
	
	public void generarMatriz() {
		int[][] map = {{6,6,6,6,6,6,6,6,6},{6,4,4,4,4,4,4,17,6},{6,4,4,4,4,4,4,17,6},{6,4,11,11,11,11,11,17,6},{6,4,11,8,9,10,11,17,6},{6,4,11,12,13,15,2,17,6},
				{6,4,11,11,0,0,11,17,6},{6,4,11,11,0,0,11,17,6},{6,4,11,11,3,0,11,17,6},{6,16,16,16,16,16,16,16,6},{6,14,14,14,14,14,14,14,6},
				{6,6,6,6,6,6,6,6,6},{6,6,6,6,6,6,6,6,6},{6,6,6,6, 6,6,6,6,6}};
		this.setMatriz(map);
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

}
