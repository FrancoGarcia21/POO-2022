import java.util.Random;
public class Barbaro  extends Personaje{
	
	public Integer ptos;
	
	public Barbaro(Integer ataque , Integer defensa) {
		super();
		this.setVida(100);
		this.setNivelAtaque(ataque);
		this.setNivelDefensa(defensa);
	}

	
	
//public void setNivelAtaque(Integer nivelAtaque) {
//		
////		Random rnd = new Random();
////		if(rnd.nextBoolean()) {
////			if (this.getNivelDefensa() > ptos)
////			this.setVida(this.getVida() - ((ptos) - (this.getNivelDefensa())));
////			
////		}	
//		}
		
		
	public void defender(Integer ptos) {
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			if (this.getNivelDefensa() > ptos) {
				this.setVida(this.getVida() - ((ptos) - (this.getNivelDefensa())));
			} else {
				this.setVida(this.getVida() - ptos);
			}
		}	
	}

		
		public Integer atacar() {
			return super.atacar();
	
	}
	

}
