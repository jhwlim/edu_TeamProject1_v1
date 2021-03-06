package order.component.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import common.model.MenuVO;
import order.controller.button.menu.OrderMenuBtnClickAddListener;
import order.controller.mouse.MenuMouseClickListener;
import order.dao.MenuDao;
import order.dao.MenuDaoImpl;
import order.dao.StockDao;
import order.dao.StockDaoImpl;

public class OrderMenuPanel extends JPanel {
	
	public OrderMenuPanel(DefaultTableModel dtm) {
		
		this.setLayout(new CardLayout(10, 10));
		this.setPreferredSize(new Dimension(0, 580));

		JPanel drinkPanel = new JPanel();	
		JPanel foodPanel = new JPanel();	
		JPanel mdPanel = new JPanel();		

		this.setBackground(new Color(0x006600));

		this.add(drinkPanel, "Drink");
		this.add(foodPanel, "Food");
		this.add(mdPanel, "MD");
		
		MenuDao dao = MenuDaoImpl.getInstance();
	
		List<MenuVO> list = dao.selectAll();

		for (int i = 0; i < list.size(); i++) {
			MenuVO menu = list.get(i);
			String imgPath = menu.getMenuImg();
			String category = menu.getMenuCategory();
			
			Image image = new ImageIcon(imgPath).getImage()
												.getScaledInstance(175, 175, Image.SCALE_REPLICATE);
			ImageIcon imageIcon = new ImageIcon(image);

			JButton btn = new JButton(imageIcon);

			
			btn.addActionListener(new OrderMenuBtnClickAddListener(dtm, menu));
			btn.addMouseListener(new MenuMouseClickListener(menu.getMenuId()));
			
			switch (category) {
			case "drink" :
				drinkPanel.add(btn).setPreferredSize(new Dimension(175, 175));
				break;
			case "food" :
				foodPanel.add(btn).setPreferredSize(new Dimension(175, 175));
				break;
			case "md" :
				mdPanel.add(btn).setPreferredSize(new Dimension(175, 175));
				break;
			}
		}
		
	}
}
