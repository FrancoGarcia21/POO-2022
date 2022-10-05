package Main;

import context.Cerradura;

public class Main
{

	public static void main(String[] args)
	{
		Cerradura cerradura = new Cerradura();

		System.out.println(cerradura);
		
		//Test sin llave
		cerradura.removerLlave();
		cerradura.girarLlave();
		System.out.println(cerradura);
		
		//inserta llave
		cerradura.insertarLlave();
		
		//abre cerradura
		cerradura.girarLlave();
		System.out.println(cerradura);
		
		//cierra cerradura
		cerradura.girarLlave();
		System.out.println(cerradura);
		cerradura.removerLlave();
		System.out.println(cerradura);
		cerradura.insertarLlave();
		cerradura.girarLlave();
		cerradura.insertarLlave();
		cerradura.girarLlave();

		System.out.println(cerradura);
		

	}

}
