
public class Participante {
	private Integer numeroParticipante;
	private String nombreParticipante;
	
	
	
	public Participante(Integer numeroParticipante, String nombreParticipante) {
		super();
		this.numeroParticipante = numeroParticipante;
		this.nombreParticipante = nombreParticipante;
	}
	
	
	
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
		return "Paticipante=" + numeroParticipante + ", nombre del Participante " + nombreParticipante
			;
	}
	
	
	

}
