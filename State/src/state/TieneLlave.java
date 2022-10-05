package state;
import context.Cerradura;

public class TieneLlave implements State
{
	Cerradura cerradura;

	public TieneLlave(Cerradura cerradura) {
        this.cerradura = cerradura;
    }
	
	@Override
	public void insertarLlave()
	{
		System.out.println("Llave ya esta dentro!");
		
	}

	@Override
	public void removerLlave()
	{
		System.out.println("Sacando Llave!");
		cerradura.setState(cerradura.getSinLlave());
	}

	@Override
	public void girarLlave()
	{
		System.out.println("Llave girada!");
		cerradura.setState(cerradura.getAbierta());
	}

	@Override
	public void abierta()
	{
		System.out.println("Hace falta girar la llave!");
		
	}
	
	public String toString()
	{
		return "cerrada";
	}

}
