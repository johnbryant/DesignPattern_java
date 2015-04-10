import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;


public class Directory extends File {

	private Vector<File> dir;
	private String name;
	private int size;
	
	public Directory() {
		this.name="NewDIR";
		this.size = 0;
		dir = new Vector<File>();
	}
	
	public Directory(String name) {
		dir = new Vector<File>();
		this.name = name;
		this.size = 0;
	}
	@Override
	protected int getSize() {
		// TODO Auto-generated method stub
		int size = 0;
		Iterator<File> i = dir.iterator();
		while(i.hasNext()) {
			File file = (File)i.next();
			size += file.getSize();
		}
		return size;
	}

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	protected void printList() {
		// TODO Auto-generated method stub
		System.out.println("\nMy name is " + this.name + ", The follow is my contents:");
		Iterator<File> i = dir.iterator();
		while (i.hasNext()) {
			File file = (File)i.next();
			file.printList();
		}

	}

	@Override
	protected void add(File file) {
		// TODO Auto-generated method stub
		dir.add(file);

	}

}
