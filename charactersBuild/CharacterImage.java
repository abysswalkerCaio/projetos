package charactersBuild;

import javax.swing.ImageIcon;

public class CharacterImage {
	ImageIcon leone = new ImageIcon("leone.png");	
	ImageIcon sheele = new ImageIcon("sheele.png");
	static ImageIcon leoneAttack = new ImageIcon("leone_attack.png");	
	static ImageIcon sheeleAttack = new ImageIcon("sheele_attack.png");
	static ImageIcon leoneWin = new ImageIcon("leone_win.png");	
	static ImageIcon sheeleWin = new ImageIcon("sheele_win.png");
	static ImageIcon battle = new ImageIcon("battle.png");
	
	public ImageIcon getImagemLeone() {
		return this.leone;
	}
	
	public ImageIcon getImagemSheele() {
		return this.sheele;
	}
}
