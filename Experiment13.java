package dao;

import java.io.File;
import java.util.Scanner;

class MyFile{
	private String path;
	private File myFile;
	public MyFile(String path) {
		this.path = path;
		myFile = new File(path);
		System.out.println(myFile.getAbsolutePath());
	}
	public void getInfo() {
		if(myFile.exists()) {
			if(myFile.isDirectory()) {
				System.out.println(" "+myFile.getName()+ " is a directory");
			}
			else if(myFile.isFile()) {
				System.out.println("Name of file is: "+myFile.getName());
				System.out.println("Is "+myFile.getName()+ " Readable ? "+myFile.canRead());
				System.out.println("Is "+myFile.getName()+ " Writable ? "+myFile.canWrite());
				System.out.println("Is "+myFile.getName()+ " Executable ? "+myFile.canExecute());
				System.out.println("Size of "+myFile.getName()+ " :  "+myFile.length() + " bytes");
			}
		}
		else {
			System.out.println(" "+myFile.getName()+ " doesn't exists");
		}
	}
	
}
public class Experiment13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Read a file");
		String path  = scan.nextLine();
		new MyFile(path).getInfo();
	}
}
