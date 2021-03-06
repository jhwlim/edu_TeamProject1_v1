package order.component.button;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;

import order.controller.button.bottom.OrderMinusBtnClickListener;
import order.controller.button.bottom.OrderPlusBtnClickListener;

public class OrderBtnPlusMinus extends JButton{
	
	
	public OrderBtnPlusMinus(String btnName, JTable table) {
		super(btnName);
		setPreferredSize(new Dimension(50, 50));
		setFont(new Font("맑은고딕", Font.BOLD, 25));
	
		setBorderPainted(false);

		setBackground(new Color(0x663300));
		setForeground(Color.white);
		setFocusPainted(false);
		
	switch (btnName) {
	case "+":
		addActionListener(new OrderPlusBtnClickListener(table));
		break;
	case "-":
		addActionListener(new OrderMinusBtnClickListener(table));
		break;
	}
		
	}
}

