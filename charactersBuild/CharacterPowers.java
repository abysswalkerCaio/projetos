package charactersBuild;

public class CharacterPowers {
	private String poderUm, poderDois, poderTres;
	private int danoPoderUm, danoPoderDois, danoPoderTres;

	// Constructor;
	public CharacterPowers(String poderUm, String poderDois, String poderTres, int danoPoderUm, int danoPoderDois,
			int danoPoderTres) {
		this.poderUm = poderUm;
		this.poderDois = poderDois;
		this.poderTres = poderTres;
		this.danoPoderUm = danoPoderUm;
		this.danoPoderDois = danoPoderDois;
		this.danoPoderTres = danoPoderTres;
	}

	// Getters;
	public String getPoderUm() {
		return this.poderUm;
	}

	public String getPoderDois() {
		return this.poderDois;
	}

	public String getPoderTres() {
		return this.poderTres;
	}

	public int getDanoPoderUm() {
		return this.danoPoderUm;
	}

	public int getDanoPoderDois() {
		return this.danoPoderDois;
	}

	public int getDanoPoderTres() {
		return this.danoPoderTres;
	}

	// Setters;
	public void setPoderUm(String poderUm) {
		this.poderUm = poderUm;
	}

	public void setPoderDois(String poderDois) {
		this.poderDois = poderDois;
	}

	public void setPoderTres(String poderTres) {
		this.poderTres = poderTres;
	}
}
