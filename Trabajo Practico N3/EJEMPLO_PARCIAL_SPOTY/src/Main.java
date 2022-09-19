import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Cancion cancion1 = new Cancion("la vaca lola", 400,10, "la granja 2000");
		CapituloPodcast capitupodc = new CapituloPodcast("poo cap" ,500 , 100, "urldellribo");
		AudioLibro audilib = new AudioLibro("conociendo la vida",300,200, "inglish");
		
		
		// esto es par)a ordenar por un atributo si me llegan a pedi un top o algo
		//canciones.sort(Comparator.comparing (x-> x.getTitulo()));

		
//		
//		ArrayList<Sonido> rankingGeneral = new ArrayList<Sonido>();
//		rankingGeneral.addAll(canciones);
//		rankingGeneral.addAll(Libros);
//		rankingGeneral.addAll(capitulos);
//		
//		canciones.sort(Comparator.comparing (x-> x.getTitulo()));

		
	}
}
