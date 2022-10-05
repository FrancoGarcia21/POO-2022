package state;

import context.Cerradura;

public class Abierta implements State
{
	Cerradura cerradura;
	
	public Abierta(Cerradura Cerradura) {
        this.cerradura = Cerradura;
    }
	
	@Override
	public void insertarLlave()
	{
		System.out.println("La llave ya esta insertada");
		
	}

	@Override
	public void removerLlave()
	{
		System.out.println("No se puede sacar la llave, ya esta abierta.");
	}

	@Override
	public void girarLlave()
	{
		System.out.println("Girando la llave para cerrar.");
		cerradura.setState(cerradura.getTieneLlave());
		
		
	}

	@Override
	public void abierta()
	{
		System.out.println("la cerradura esta abierta");
		cerradura.setState(cerradura.getSinLlave());
		
	}
	
	public String toString()
	{
		return "abierta";
	}


}
