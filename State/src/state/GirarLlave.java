package state;

import context.Cerradura;

public class GirarLlave implements State
{
	Cerradura cerradura;

	public GirarLlave(Cerradura cerradura) {
        this.cerradura = cerradura;
    }
	
	@Override
	public void insertarLlave()
	{
		System.out.println("La llave ya esta insertada");
		
	}

	@Override
	public void removerLlave()
	{
		System.out.println("No se puede remover por que la llave se esta girando");
	}

	@Override
	public void girarLlave()
	{
		System.out.println("Girando la llave");
		cerradura.setState(cerradura.getAbierta());
		
		
	}

	@Override
	public void abierta()
	{
		System.out.println("preparando para abrir");
		
	}
	
	public String toString()
	{
		return "cerrada";
	}


}
