
public class Figura {
	private String color;
	
	public String getColor() {
		return color;
		
	}
	public abstract Double area();
	public void setColor(String color) {
		this.color = color;
		
	}
	public Figura (String color) {
	super();
	this.color = color;
	}
	public String toString() {
		return "color-" + color;
	}
	
	

}
