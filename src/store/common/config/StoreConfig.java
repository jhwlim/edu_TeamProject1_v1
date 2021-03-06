package store.common.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class StoreConfig {

	private static int storeId;
	
	private static final String prefix = "resources/settings/";
	private static final String fileName = "store.sav"; 
	
	private static final String STORE_ID = "STORE_ID";
	
	public static final int DEFAULT_STORE_ID = 0;
	
	
	public static String getFilePath() {
		return prefix + fileName;
	}
	
	public static int getStoreId() {
		try {
			File folder = new File(prefix);
			if (!folder.exists()) {
				folder.mkdir();
			}
			
			BufferedReader br = new BufferedReader(new FileReader(prefix + fileName));
			
			String str = br.readLine();
			if (str != null) {
				JSONParser parser = new JSONParser();
				JSONObject ob = (JSONObject) parser.parse(str);
				
				storeId = Integer.parseInt(ob.get(STORE_ID).toString());
			} else {
				storeId = DEFAULT_STORE_ID;
			}
			
		} catch (FileNotFoundException e) {	
			storeId = DEFAULT_STORE_ID;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return storeId;
	}
}
