package auto;

public class NpcRojo extends AutoNPC{

	public NpcRojo() {
		this.color = "#ff1313";
		this.posicionX = 150;
		this.posicionY = -200;
		this.velocidad = 20; 
	}

	@Override
	public void realizarChoque(AutoNPC c) {
		c.recibirChoque();
		this.velocidad = 0;
		
	}

	@Override
	public void recibirChoque() {
		this.velocidad = 0;
	}

} 
