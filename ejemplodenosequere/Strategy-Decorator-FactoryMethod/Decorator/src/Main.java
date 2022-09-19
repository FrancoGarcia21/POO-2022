
public class Main {

	public static void main(String[] args) {
		Forma circulo = new Circulo();

		Forma circuloRojo = new BordeRojoDecorator(new Circulo());

		Forma rectanguloRojo = new BordeRojoDecorator(new Rectangulo());
	      System.out.println("Circulo normal: ");
	      circulo.dibujar();

	      System.out.println("\nCirculo con borde rojo");
	      circuloRojo.dibujar();

	      System.out.println("\nRectangulo con borde rojo");
	      rectanguloRojo.dibujar();
	}

}
