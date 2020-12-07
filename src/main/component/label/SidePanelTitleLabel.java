package main.component.label;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import common.font.SidePanelTitleLabelFont;
import main.component.btn.MenuBtnEnum;
import main.component.panel.SideUpPanel;

public class SidePanelTitleLabel extends JLabel {
	
	static final int PANEL_WIDTH = SideUpPanel.PANEL_WIDTH;
	static final int PANEL_HEIGHT = SideUpPanel.PANEL_HEIGHT;
	
	static final int LABLE_WIDTH = (int) (PANEL_WIDTH * 0.8);
	static final int LABLE_HEIGHT = (int) (PANEL_HEIGHT * 0.8);
	static final int LABLE_X_LOCATION = (PANEL_WIDTH - LABLE_WIDTH) / 2;
	static final int LABLE_Y_LOCATION = (PANEL_HEIGHT - LABLE_HEIGHT) / 2;
	
	static final String FONT_TYPE = "궁서";
	static final int FONT_STYLE = Font.BOLD;
	static final int FONT_SIZE = 40;
	
	public SidePanelTitleLabel() {
		super("", SwingConstants.CENTER);
		super.setLocation(LABLE_X_LOCATION, LABLE_Y_LOCATION);
		super.setBounds(LABLE_X_LOCATION, LABLE_Y_LOCATION, LABLE_WIDTH, LABLE_HEIGHT);
		
		super.setFont(new SidePanelTitleLabelFont()); 
	
	}
	public SidePanelTitleLabel(MenuBtnEnum mbe) {
		super(mbe.btnName, SwingConstants.CENTER);
		super.setLocation(LABLE_X_LOCATION, LABLE_Y_LOCATION);
		super.setBounds(LABLE_X_LOCATION, LABLE_Y_LOCATION, LABLE_WIDTH, LABLE_HEIGHT);
		
		super.setFont(new SidePanelTitleLabelFont()); 
	}
}