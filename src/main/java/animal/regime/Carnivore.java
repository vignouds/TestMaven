package animal.regime;

public class Carnivore extends Regime {
	public Carnivore() {
		super("carnivore");
	}
	
	public String manger() {
		String str = "je mange de la viande";
		return str;
	}
}
