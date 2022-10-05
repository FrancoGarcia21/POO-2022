package state;

import context.Cerradura;

public class SinLlave implements State
{
	Cerradura cerradura;
	
	public SinLlave(Cerradura cerradura) {
        this.cerradura = cerradura;
    }
	
	@Override
	public void insertarLlave()
	{
		System.out.println("se inserta la llave en la cerradura.");
		cerradura.setState(cerradura.getTieneLlave());
		
	}

	@Override
	public void removerLlave()
	{
		System.out.println("la llave nunca fue removida.");
		
	}

	@Override
	public void girarLlave()
	{
		System.out.println("Intentaste girar, pero la llave no esta en la cerradura.");
		
	}

	@Override
	public void abierta()
	{
		System.out.println("esta cerrada");
		
	}
	
	public String toString()
	{
		return "esperando por la llave.";
	}
	
	


}
