import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
    LocalDate fechaNac = LocalDate.now();
	Persona persona1 = new Persona("-","-", fechaNac);
	Persona persona2 = new Persona("-","-", fechaNac);
    Persona persona3 = new Persona("-","-", fechaNac);

    
    System.out.println(persona1.toString());
    System.out.println(persona2.toString());
    System.out.println(persona3.toString());
    
    
    System.out.println(persona1.getEdad());
    System.out.println(persona2.getEdad());
    System.out.println(persona3.getEdad());
	}
}
