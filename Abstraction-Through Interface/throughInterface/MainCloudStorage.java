package throughInterface;

public class MainCloudStorage {
	public static void main(String[] args) {
		CloudStorage c;

		c = new GoogleDrive();
		c.uploadFile();
		c.downloadFile();

		c = new DropBox();
		c.uploadFile();
		c.downloadFile();
	}
}
