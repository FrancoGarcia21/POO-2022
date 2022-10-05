
public class Singleton {
	   private static  Singleton instance;
	   private Singleton(){}

	   public static Singleton getInstance(){
	       if (instance == null){

	           System.out.println("se crea una nueva instancia");
	           return instance = new Singleton();
	       }
	       System.out.println("se devuelve la instancia ya creada");
	       return instance;
	   }
	   
	   public void mostrarMensaje() {
		   System.out.println("Esta clase deberia gestionar recursos como archivos, conexiones a base de datos, peticiones a servidores, etc..");
	   }
	}