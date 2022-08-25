import java.util.Random;

public class Paladin extends Personaje {
	
	
	private int ptos;

	public Paladin(Integer ataque , Integer defensa) {
		super();
		this.setNivelAtaque(ataque);
		this.setNivelDefensa(defensa);
	}

	
	public void defender(Integer ptos) {
		
		
	}
	
	public void setNivelAtaque(Integer nivelAtaque) {
		
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			if (this.getNivelDefensa() > ptos)
			this.setVida(this.getVida() - ((ptos/2) - (this.getNivelDefensa())));
			}
		
	}

	
public Integer atacar() {
	return super.atacar()*10;
}
	
}