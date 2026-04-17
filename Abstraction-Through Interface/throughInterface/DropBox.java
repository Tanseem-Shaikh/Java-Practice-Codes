package throughInterface;

public class DropBox implements CloudStorage {

	@Override
	public void uploadFile() {
		System.out.println("File Upload on Drop Box");

	}

	@Override
	public void downloadFile() {
		System.out.println("File Download from Drop Box");

	}

}
