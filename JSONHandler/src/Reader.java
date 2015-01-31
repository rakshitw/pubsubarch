import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;

public class Reader {
	
	public static void readAndPublish(File fin) throws IOException, JSONException {
		FileInputStream fis = new FileInputStream(fin);
	 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		while ((line = br.readLine()) != null) {
			
			// convert to JSON and send over Http
			/*
			 * Depending upon the web service JSON can be extracted and a query
			 * can be built and sent over by using HTTP function
			 */
			
		    JSONObject jsonObj = new JSONObject(line);	
		    /*
		     * makes a JSON, which consists of a list of JSONS
		     * which can further be converted as a JSON array 
		     * if required
		     */
			System.out.println(jsonObj.get("topic"));

			/*
			 * Commented out, this call can be used to send data
			 * to the web service
			 */
			
			//Httppost(String username, String password, String url,JONObject json)
			System.out.println(line);
		}
	 
		br.close();
	}
	
}
