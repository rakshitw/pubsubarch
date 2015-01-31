import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;


public class Writer {
	/*/
	 * USE writeSubscribed in subscribe method 
	 * to write to File.
	 * The subscribed thread is exactly the same as in
	 * corresponding Android app
	 * 
	 * To bypass subscribe method get call of http can be directly used
	 * public String Httpget(String username, String password, String url)
	 * <<HTTP_Functions.java>>
	 */
	public static void writeSubscribed (JSONObject json) {
		try {
			String content = json.toString();
			File file = new File("Received");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
