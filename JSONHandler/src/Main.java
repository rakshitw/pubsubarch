import java.io.File;
import java.io.IOException;

import org.json.JSONException;


public class Main {

	public static void main(String[] args) throws IOException, JSONException {
		// TODO Auto-generated method stub
		File readFile = new File("Data");
		Reader.readAndPublish(readFile);
		

	}

}
