package employee.component.panel.menu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmpMenuPanel extends JPanel {

	private static EmpMenuPanel empMenuPanel;
	
	public static final int COLOR = 0xffffff;
	
	private static final int X_MARGIN = 300;
	private static final int Y_MARGIN = 280;
	
	static {
		empMenuPanel = new EmpMenuPanel();	
		empMenuPanel.setDefaultConfig();
	}
	
	private EmpMenuPanel() {
	}
	
	
	public static EmpMenuPanel getInstance() {
		if (empMenuPanel == null) {
			empMenuPanel = new EmpMenuPanel();
			empMenuPanel.setDefaultConfig();		
		}
		
		return empMenuPanel;
	}
	
	private void setDefaultConfig() {
		empMenuPanel.setLayout(new CardLayout(X_MARGIN, Y_MARGIN));
		empMenuPanel.setBackground(new Color(COLOR));
		
		empMenuPanel.setComponents();
	}
	
	private void setComponents() {
		EmpMenuCenterPanel embp = EmpMenuCenterPanel.getInstance();
		empMenuPanel.add(embp);
	}
	
	
}
