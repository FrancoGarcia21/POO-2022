
public abstract class FormaDecorator implements Forma {
	protected Forma decoratedForma;
	
	public FormaDecorator(Forma decoratedForma) {
		this.decoratedForma = decoratedForma;
	}
	
	public void dibujar() {
		decoratedForma.dibujar();
	}
	

}
