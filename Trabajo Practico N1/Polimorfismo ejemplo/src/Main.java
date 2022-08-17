
public class Main {

	public static void main(String[] args) {
Cuadrado unCuadrado = new Cuadrado ("azul",7.0);
Circulo unCirculo = new Circulo ("verde", 20.0);
Figura unaFigura = new Cuadrado ("rojo", 40.0);
unCuadrado.getLado();
unCuadrado.area();
unaFigura.area();
System.out.println( unaFigura.area() );

	}

}
