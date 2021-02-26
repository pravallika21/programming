package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadDataFromExcel {
	
}
class JTableDemo extends JFrame{
	private JTable myTable;
	private List<List<String>> tableData;
	private List<String> tableColumns;
	private File fileName;

	public JTableDemo(File fileName) {		
		this.fileName = fileName;
		myTable = new JTable();
		JScrollPane scrollPane = new JScrollPane(myTable);
			
		add(scrollPane);
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	

	public void readFile() throws IOException{

		System.out.println(fileName.getAbsolutePath());
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		FormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
		tableData = new ArrayList<List<String>>();
		for (Row row : sheet) {
			List<String> tableRow = new ArrayList<>();
			for(Cell cell:row){
				switch (fe.evaluateInCell(cell).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					tableRow.add(""+cell.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_STRING:
					tableRow.add(cell.getStringCellValue());
					break;
				}
				
			}
			tableData.add(tableRow);
		}
		tableColumns = new ArrayList<>();
		DefaultTableModel model = new DefaultTableModel(0,0);
		for(String s:tableData.get(0)) {
			tableColumns.add(s);
		}
		model.setColumnIdentifiers(tableColumns.toArray());
		for(int i=1;i<tableData.size();i++) {
			model.addRow(tableData.get(i).toArray());
		}
		myTable.setModel(model);
		
	}
	
}
public class Experiment16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Read an Excel Sheet");
		String fileName = scan.nextLine();
		File myFile = new File(fileName);
		try {
			new JTableDemo(myFile).readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan.close();
	}
}
