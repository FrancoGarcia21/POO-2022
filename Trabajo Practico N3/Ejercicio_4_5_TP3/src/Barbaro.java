import java.io.IOException;
import java.util.Random;
public class Barbaro  extends Personaje{
	
	
	
	public Barbaro(Integer nivelAtaque , Integer nivelDefensa) {
		super();
		this.nivelAtaque = nivelAtaque;
		this.nivelDefensa = nivelDefensa;
		this.setVida(1000);
		
	}

	
	public Integer ptos;
public void setNivelAtaque(Integer nivelAtaque) {
		
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			if (this.getNivelDefensa() > ptos)
			this.setVida(this.getVida() - ((ptos) - (this.getNivelDefensa())));
			
		}	
		}
		
		
	public void defender(Integer ptos) {
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			if (this.getNivelDefensa() > ptos) {
				this.setVida(this.getVida() - ((ptos) - (this.getNivelDefensa())));
			} else {
				this.setVida(this.getVida() - ptos);
			}
			try {  
				
				
				
			}
			catch (IOException e) {
				this.setVida(0);
				System.out.println("EL GUERRERO MURIO HORRIBLEMENTE");
			}
		}
		}	

		
		public Integer atacar() {
			return super.atacar();
	
	}
	

}
