import java.io.IOException;
import java.io.InputStream;

public class JarRunner {
	public static void main(String[] args) {
		openJar("C:\\Users\\ZaraSOFT\\OneDrive\\Desktop\\Tasks.jar");
	}

	public static void openJar(String link) {
		Process proc = null;
		try {
			proc = Runtime.getRuntime().exec("java -jar " + link);
		} catch (IOException e) {
			e.printStackTrace();
		}
		@SuppressWarnings("unused")
		InputStream in = proc.getInputStream();
	}
}
