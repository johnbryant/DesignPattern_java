public abstract class File {

	public File() {

	}

	protected abstract String getName();
	
	protected abstract int getSize();

	protected abstract void printList();

	protected abstract void add(File file);

}
