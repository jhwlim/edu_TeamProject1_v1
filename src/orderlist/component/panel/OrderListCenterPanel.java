package orderlist.component.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class OrderListCenterPanel extends JPanel {

	public OrderListCenterPanel() {
		setBackground(new Color(0x186f3d));
		setPreferredSize(new Dimension(500,500));
		setLayout(new GridLayout(0, 2, 50, 50));
	}

}
