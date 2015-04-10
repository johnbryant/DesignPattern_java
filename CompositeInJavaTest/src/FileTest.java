
public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleFile f1 = new SingleFile("file1",10);
		SingleFile f2 = new SingleFile("Dota2",100);
		f1.printList();
		f2.printList();
		
		Directory dir1 = new Directory("dir1");
		dir1.add(f1);
		dir1.printList();
		
		Directory dir2 = new Directory("dir2");
		dir2.add(dir1);
		dir2.add(f2);
		dir2.printList();
		
	}

}
