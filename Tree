import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Tree {
	public Tree(){
		DefaultMutableTreeNode Mycomputer=new DefaultMutableTreeNode("My computer");
		DefaultMutableTreeNode cDrive=new DefaultMutableTreeNode("c Drive");
		DefaultMutableTreeNode dDrive=new DefaultMutableTreeNode("d Drive");
		DefaultMutableTreeNode Images=new DefaultMutableTreeNode("images");
		Mycomputer.add(cDrive);
		Mycomputer.add(dDrive);
		dDrive.add(Images);
		JTree tree=new JTree(Mycomputer);  //->IMPORTANT LINE
		JFrame j=new JFrame(); 
		j.add(tree); 
		j.setSize(500,500); 
		j.setVisible(true); 
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public static void main(String[] args) {
		new Tree();
	}
}
