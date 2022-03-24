package charactersBuild;

public class MainPanel {

	public static void main(String[] args) {
		CharactersFight lutasPersonagens = new CharactersFight();
		CharacterImage imagemPersonagens = new CharacterImage();
		
		PanelVisualEditor.mudarPainel();
		
		final CharacterPowers leonePoderes = new CharacterPowers("Garra", "Mordida", "Bote", 50, 75, 100);
		CharacterData leone = new CharacterData("Leone", 500, 20, 1.70, leonePoderes, leonePoderes, leonePoderes, imagemPersonagens);
		leone.showCharacterStatus();
		
		final CharacterPowers sheelePoderes = new CharacterPowers("Corte", "Duplo-corte", "Triplo-corte", 35, 70, 105);
		CharacterData sheele = new CharacterData("Sheele", 250, 20, 1.60, sheelePoderes, sheelePoderes, sheelePoderes, imagemPersonagens);
		sheele.showCharacterStatus();
		
		lutasPersonagens.showCharactersFight(leone, sheele);
		lutasPersonagens.randomFightersAttacks(leonePoderes, sheelePoderes, leone, sheele);
	}
}
