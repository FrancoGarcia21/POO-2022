package Vista;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import Modelo.Mapa;
import Modelo.Pantalla;
import Controlador.JuegoController;

public class JuegoVista extends Canvas{
	
	private static final long serialVersionUID = 1L;
	
	private final static int ANCHO = 800;
	private final static int ALTO = 600;
	
	public static JFrame ventana;
	public static final String NOMBRE = "Juego";
	private JuegoController controlador;
	
	private int aps = 0;
	private int fps = 0;
	
	public static int x = 0;
	public static int y = 0;
	
	private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);
	private static int[] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData(); //Accede a la imagen en forma de un array de pixeles de la imagen

	public JuegoVista(JuegoController controlador) {
		this.controlador = controlador;
		setPreferredSize(new Dimension(ANCHO,ALTO));
		ventana = new JFrame(NOMBRE);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setLayout(new BorderLayout());
		ventana.add(this,BorderLayout.CENTER);//agrego el canvas
		ventana.pack(); //sireve para que todo el contenido de la ventana se ajuste al tamaño
		ventana.setLocationRelativeTo(null);//fija la ventana en el centro de la pantalla
		ventana.setVisible(true);
	}
	
	public void mostrar() {
		BufferStrategy estrategia = getBufferStrategy();
		if(estrategia == null) {
			createBufferStrategy(3);//le pasamos la cantidad de buffer que vamos a usar
			/*Un buffer es un espacio de memoria para guardar los dibujos.*/
			return;
		}
		Graphics g = estrategia.getDrawGraphics();
		//super.paint(g);
		controlador.mostrar(g);
		
		estrategia.show();
		setFps(getFps()+1);
	}

	public int getAps() {
		return aps;
	}

	public void setAps(int aps) {
		this.aps = aps;
	}

	public int getFps() {
		return fps;
	}

	public void setFps(int fps) {
		this.fps = fps;
	}
	
	public static int[] getPixeles() {
		return pixeles;
	}
	
	public static BufferedImage getImagen() {
		return imagen;
	}

	public static int getAncho() {
		return ANCHO;
	}

	public static int getAlto() {
		return ALTO;
	}

	public static void setImagen(BufferedImage imagen) {
		JuegoVista.imagen = imagen;
	}

}
