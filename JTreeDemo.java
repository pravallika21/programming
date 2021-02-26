package ui;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame implements TreeSelectionListener{
	JTree myTree;
	public JTreeDemo() {
		//Create Nodes : DefaultMutableTreeNode
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Market");
		DefaultMutableTreeNode vegNode = new DefaultMutableTreeNode("Vegetables");
		DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
		DefaultMutableTreeNode brinjalNode = new DefaultMutableTreeNode("Brinjal");
		DefaultMutableTreeNode potatoNode = new DefaultMutableTreeNode("Potato");
		DefaultMutableTreeNode appleNode = new DefaultMutableTreeNode("Apple");
		DefaultMutableTreeNode bananaNode = new DefaultMutableTreeNode("Banana");
		fruitNode.add(appleNode);
		fruitNode.add(bananaNode);
		vegNode.add(brinjalNode);
		vegNode.add(potatoNode);
		rootNode.add(vegNode);
		rootNode.add(fruitNode);
		
		myTree = new JTree(rootNode);
		myTree.getSelectionModel().addTreeSelectionListener(this);
		
		
		add(myTree);
		setVisible(true);
		setTitle("JTree Demo");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(myTree.getLastSelectedPathComponent().toString());
	}
}
