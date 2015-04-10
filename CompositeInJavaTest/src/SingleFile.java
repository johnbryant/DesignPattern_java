import javax.print.attribute.Size2DSyntax;

public class SingleFile extends File {

	private String name;
	private int size;

	public SingleFile() {

	}

	public SingleFile(String name, int size) {
		this.name = name;
		this.size = size;
	}

	protected int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	protected void printList() {
		// TODO Auto-generated method stub
		System.out.println("Filename: " + this.getName() + "  Filesize: "
				+ this.getSize());

	}

	@Override
	protected void add(File file) {
		// TODO Auto-generated method stub

	}

	protected void setSize() {
		// TODO Auto-generated method stub

	}

}
