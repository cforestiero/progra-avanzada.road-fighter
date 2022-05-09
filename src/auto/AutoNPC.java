package auto;

public abstract class AutoNPC {

	protected String color;
	protected int posicionX;
	protected int posicionY;
	protected int velocidad;

	public abstract void realizarChoque(AutoNPC c);

	public abstract void recibirChoque();
}
