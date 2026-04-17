package throughInterface;

public class GoogleDrive implements CloudStorage {

	@Override
	public void uploadFile() {
		System.out.println("File Upload on Google drive");

	}

	@Override
	public void downloadFile() {
		System.out.println("File Download ");

	}

}
