package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.common.io.Files;

public class JsonDataReader {

	public String retrievevalue(String arg) {
		JSONParser parser = new JSONParser();

		try {
			Object obj = parser.parse(
					new FileReader(System.getProperty("user.dir") + "/src/test/java/testData/testData.json"));
			JSONObject jsonObject = (JSONObject) obj;
			return (String) jsonObject.get(arg);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public void writeValue(String key, String value) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(
				new FileReader(System.getProperty("user.dir") + "/src/test/java/testData/testData.json"));
		JSONObject jsonObject = (JSONObject) obj;

		jsonObject.put(key, value);
		System.out.println(jsonObject.toJSONString());
		@SuppressWarnings("resource")
		FileWriter fileToWrite = new FileWriter(
				System.getProperty("user.dir") + "/src/test/java/testData/testData.json", false);

		fileToWrite.write(jsonObject.toJSONString());
		fileToWrite.flush();
		fileToWrite.close();

	}
}
