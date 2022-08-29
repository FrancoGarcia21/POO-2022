import java.util.Random;

public class Paladin extends Personaje {
	
	
	private Integer ptos;

	public Paladin(Integer ataque , Integer defensa) {
		super();
		this.setVida(120);
		this.setNivelAtaque(ataque);
		this.setNivelDefensa(defensa);
	}

	public void defender(Integer ptos) {
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			if (this.getNivelDefensa() > ptos) {
				this.setVida(this.getVida() - ((ptos/2) - (this.getNivelDefensa())));
			} else {
				this.setVida(this.getVida() - ptos);
			}
		}
		
		
		
	}
	
//	public void setNivelAtaque(Integer nivelAtaque) {
//		
////		Random rnd = new Random();
////		if(rnd.nextBoolean()) {
////			if (this.getNivelDefensa() > ptos)
////			this.setVida(this.getVida() - ((ptos/2) - (this.getNivelDefensa())));
////			}
//		
//	}

	
public Integer atacar() {
	return super.atacar()*10;
}
	
}