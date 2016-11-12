import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SimpleWriter {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		
		//"name/value
		obj.put("name", "Asuna");
		obj.put("age", "15");

		JSONArray cities = new JSONArray();
		cities.add("Aincrad Arc");
		cities.add("Fairy Dance Arc");
		cities.add("Phantom Bullet Arc");

		obj.put("cities", cities);

		try {

			FileWriter file = new FileWriter("SAO.json"); //Didn't specify where to store the file
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj.toJSONString());

	}

}