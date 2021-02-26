package ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class JTableUI extends JFrame implements ListSelectionListener {
	private String[][] tableData;
	private String[] tableColumns;
	private JTable myTable;

	public JTableUI() {
		// TODO Auto-generated constructor stub
		tableColumns = new String[] { "S.No.", "Name," };
		tableData = new String[][] { { "1", "ABC" }, { "2", "DEF" }, { "3", "GHI" } };

		setBounds(30, 30, 300, 300);
		myTable = new JTable(tableData, tableColumns);
		JScrollPane sp = new JScrollPane(myTable);
		add(sp);
		myTable.setCellSelectionEnabled(true);

		ListSelectionModel model = myTable.getSelectionModel();
		model.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		model.addListSelectionListener(this);
		// add(myTable);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		String cell=null;
		int[] rows = myTable.getSelectedRows();
		int[]  columns = myTable.getSelectedColumns();
		for(int i=0;i<rows.length;i++)
			for(int j=0;j<columns.length;j++)
				cell = (String) myTable.getValueAt(rows[i],columns[j]);
		
		JOptionPane.showMessageDialog(myTable, "Selected "+cell);
	}

}

public class JTableDemo {
	public static void main(String[] args) {
		new JTableUI();
	}
}
