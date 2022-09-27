
public class Participante {
	
	/*
	 * sé que asi lo especificaba el diseño del ejercicio pero en los siguientes nombres
	 * de atributos la palabra Participante es redundante. Al menos en el nombre, que no estaba asi
	 * en el diseño de clases se sobre entiende que es el nombre del participante
	 * ya que el atributo pertenece a la clase Participante
	 * */
	private Integer numeroParticipante;
	private String nombreParticipante;
	
	
	
	public Participante(Integer numeroParticipante, String nombreParticipante) {
		/* Participante no hereda de ninguna clase nuestra
		 * llamar al super no tiene mucho sentido
		 *  tampoco es un problema
		 *  */
		super();
		this.numeroParticipante = numeroParticipante;
		this.nombreParticipante = nombreParticipante;
	}
	
	
	/* Sé que estaba asi en el diseño de clases pero a partir de este año
	 * estamos insistiendo en que solo se generen setters y getters si finalmente se van a utilizar
	 * esto es para que se entienda que a no siempre vamos a querer ofrecer metodos para setear nuestros atributos
	 * podriamos querer atributos privados y exclusivos para la clase internamente
	 *  
	 *  */
	public Integer getNumeroParticipante() {
		return numeroParticipante;
	}
	public void setNumeroParticipante(Integer numeroParticipante) {
		this.numeroParticipante = numeroParticipante;
	}
	public String getNombreParticipante() {
		return nombreParticipante;
	}
	public void setNombreParticipante(String nombreParticipante) {
		this.nombreParticipante = nombreParticipante;
	}



	@Override
	public String toString() {
		return "Paticipante N°" + numeroParticipante +" "+ nombreParticipante
			;
	}
	
	
	

}
