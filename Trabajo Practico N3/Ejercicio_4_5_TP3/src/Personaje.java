import java.util.Random;

public abstract class Personaje {
	Integer vida, nivelAtaque , nivelDefensa;

	/*public Personaje(Integer nivelAtaque, Integer nivelDefensa) {
		super();
		this.nivelAtaque = nivelAtaque;
		this.nivelDefensa = nivelDefensa;
	}*/

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getNivelAtaque() {
		return nivelAtaque;
	}

	public void setNivelAtaque(Integer nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}

	public Integer getNivelDefensa() {
		return nivelDefensa;
	}

	public void setNivelDefensa(Integer nivelDefensa) {
		this.nivelDefensa = nivelDefensa;
	}

	
	
	public Integer atacar() {

		return this.nivelAtaque;
	}
	
	public abstract void defender(Integer ptos);

}
