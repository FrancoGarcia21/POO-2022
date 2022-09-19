
public class BordeRojoDecorator extends FormaDecorator {

	public BordeRojoDecorator(Forma decoratedForma) {
		super(decoratedForma);
	
	}
	
	public void dibujar(){
		decoratedForma.dibujar();
		setColorRojo(decoratedForma);
	}

	private void setColorRojo(Forma decoratedForma) {
		System.out.println("Color de borde Rojo");
		
	}
	
	

}
