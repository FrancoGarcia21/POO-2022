package context;
import state.Abierta;
import state.GirarLlave;
import state.SinLlave;
import state.State;
import state.TieneLlave;

public class Cerradura
{
	State sinLlave;
	State hasLlave;
	State girarLlave;
	State abierta;
	
	private State state;
	
	public Cerradura()
	{
		sinLlave = new SinLlave(this);
		hasLlave = new TieneLlave(this);
		girarLlave = new GirarLlave(this);
		abierta = new Abierta(this);
		state = sinLlave;
	}
	
	public void insertarLlave()
	{
		state.insertarLlave();
	}
	
	public void removerLlave()
	{
		state.removerLlave();
	}
	
	public void girarLlave()
	{
		state.girarLlave();
	}
	
	
	public void setState(State state)
	{
		this.state = state;
	}
	
	public State getState()
	{
		return this.state;
	}

    public State getSinLlave() 
    {
    	return sinLlave;
    }

    public State getTieneLlave() 
    {
    	return hasLlave;
    }
    
    public State getGirarLlave()
    {
    	return girarLlave;
    }

    public State getAbierta() 
    {
    	return abierta;
    }
	
    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("La cerradura esta " + this.getState() + "\n");
		return result.toString();
	}

}
