package charactersBuild;

import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class PanelVisualEditor {

	static public void mudarPainel() {
		UIManager.put("OptionPane.background", new ColorUIResource(220, 220, 220));
		UIManager.put("Panel.background", new ColorUIResource(220, 220, 220));
		UIManager.put("OptionPane.okButtonText", "Continuar");
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 13));
		JDialog.setDefaultLookAndFeelDecorated(true);
	}
}
