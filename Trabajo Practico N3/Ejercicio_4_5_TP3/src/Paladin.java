import java.util.Random;

public class Paladin extends Personaje {
	
	

	public Paladin(Integer nivelAtaque , Integer nivelDefensa) {
		super();
		this.nivelAtaque = nivelAtaque;
		this.nivelDefensa = nivelDefensa;
		this.setVida(800);
	}

	public Integer ptos;
	
	public void defender(Integer ptos) {
		
	
			if (this.getNivelDefensa() > ptos) {
				this.setVida(this.getVida() - ((ptos/2) - (this.getNivelDefensa())));
			} else {
				this.setVida(this.getVida() - ptos);
			}
		}
	
		
		
		
	
	
	public void setNivelAtaque(Integer nivelAtaque) {
		
		
		
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			if (this.getNivelDefensa() > ptos)
			this.setVida(this.getVida() - ((ptos/2) - (this.getNivelDefensa())));
			}
		
	}

	
public Integer atacar() {
	return super.atacar()*2;
}
	
}