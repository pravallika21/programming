package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorUI extends JFrame implements ActionListener {
	private JButton buttons[];
	private JPanel buttonPanel;
	private JTextField inputField;
	private String operand1, operand2, operator;

	public CalculatorUI() {
		setSize(400, 300);
		buttonPanel = new JPanel();
		inputField = new JTextField();
		inputField.setPreferredSize(new Dimension(320, 30));
		inputField.setEditable(false);
		buttons = new JButton[15];
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton(String.valueOf(i));
		}
		buttons[10] = new JButton("+");
		buttons[11] = new JButton("-");
		buttons[12] = new JButton("*");
		buttons[13] = new JButton("/");
		buttons[14] = new JButton("=");
		for (int i = 0; i < 15; i++)
			buttons[i].addActionListener(this);

		GridBagLayout layout = new GridBagLayout();
		buttonPanel.setLayout(layout);

		int x = 0, y = 0;
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		for (int i = 1; i < 10; i++) {
			if (x == 3) {
				x = 0;
				y++;
			}
			c.gridx = x;
			c.gridy = y;
			buttonPanel.add(buttons[i], c);
			x++;
		}
		c.gridx = 1;
		c.gridy = 3;
		buttonPanel.add(buttons[0], c);
		c.gridx = 0;
		c.gridy = 3;
		buttonPanel.add(buttons[12], c);
		c.gridx = 2;
		c.gridy = 3;
		buttonPanel.add(buttons[13], c);
		c.gridx = 3;
		c.gridy = 3;
		buttonPanel.add(buttons[14], c);
		c.gridx = 3;
		c.gridy = 0;
		c.gridheight = 2;
		buttonPanel.add(buttons[10], c);
		c.gridx = 3;
		c.gridy = 2;
		c.gridheight = 1;
		buttonPanel.add(buttons[11], c);
		operand1 = operand2 = operator = "";

	
		setVisible(true);
		add(inputField, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//revalidate();
		pack();
	}

	public static void main(String args[]) {
		new CalculatorUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = e.getActionCommand();
		
		if(input .equals("+")|| input.equals("-") 
				|| input.equals("*") || input.equals("/")) {
			 if(operand1!="")
			{
				operator = input;
			}
		}
		else if(input.equals("=")) {
			if(operand2 != "") {
				double val1 = Double.parseDouble(operand1);
				double val2 = Double.parseDouble(operand2);
				double result = 0.0;
				switch (operator) {
				case "+":
					result = val1 + val2;
					break;
				case "-":
					result = val1 - val2;
					break;
				case "*":
					result = val1 * val2;
					break;
				case "/":
					result = val1 / val2;
					break;
				}
				System.out.println(result);
				operand1 = operand2 = operator = "";
				inputField.setText(String.valueOf(result));
				
			}
		}
		else {
			if(!operator.equals("")) {
				operand2 = operand2 + "" + input;
				inputField.setText(operand2);
			}
			else {
				operand1 = operand1 + "" + input;
				inputField.setText(operand1);
			}
		}
	}
}
	
	