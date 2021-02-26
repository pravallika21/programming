package dao;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Experiment15 extends JFrame implements ActionListener {
	private JMenu fileMenu;
	private JPanel canvas;
	private String shape = "";
	private int x, y;

	public Experiment15() {
		JMenuItem drawLineItem = new JMenuItem("Line");
		JMenuItem drawSquareItem = new JMenuItem("Square");
		JMenuItem drawRectangleItem = new JMenuItem("Rectangle");
		JMenuItem drawOvalItem = new JMenuItem("Oval");
		JMenuItem drawCircleItem = new JMenuItem("Circle");
		JMenuItem closeMenu = new JMenuItem("Close");
		JMenu drawShapes = new JMenu("Draw Shapes");
		fileMenu = new JMenu("File");

		drawLineItem.addActionListener(this);
		drawSquareItem.addActionListener(this);
		drawRectangleItem.addActionListener(this);
		drawOvalItem.addActionListener(this);
		drawCircleItem.addActionListener(this);
		closeMenu.addActionListener(this);

		drawShapes.add(drawLineItem);
		drawShapes.add(drawSquareItem);
		drawShapes.add(drawRectangleItem);
		drawShapes.add(drawOvalItem);
		drawShapes.add(drawCircleItem);

		fileMenu.add(drawShapes);
		fileMenu.add(closeMenu);

		JMenuBar menuBar = new JMenuBar();
		menuBar.add(fileMenu);

		setJMenuBar(menuBar);
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Experiment15();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		switch (shape) {
		case "Line":
			g.drawLine(150, 100, 200, 100);
			break;
		case "Oval":
			g.drawOval(100, 100, 200, 100);
			break;
		case "Rectangle":
			g.drawRect(100, 200, 100, 50);
			break;
		case "Square":
			g.drawRect(100, 200, 100, 100);
			break;
		case "Circle":
			g.drawOval(100, 100, 100, 100);
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		shape = e.getActionCommand();
		repaint();
	}

}
