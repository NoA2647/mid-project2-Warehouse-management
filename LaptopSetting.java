import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LaptopSetting {
	public static List<Laptop> readAllLaptop() {
		List<Laptop> laptops = new ArrayList<Laptop>();
		String json = file.readFromFile("E:\\save\\create\\laptop.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				Laptop laptop = new Laptop(object.getString(Laptop.KEY_COLOR),
						object.getString(Laptop.KEY_WARRANTY),
						object.getString(Laptop.KEY_MEMORY),
						object.getString(Laptop.KEY_OPERATIONSYSTEM),
						object.getString(Laptop.KEY_CORE),
						object.getString(Laptop.KEY_GRAPHIC),
						object.getString(Laptop.KEY_ID),
						object.getString(Laptop.KEY_NAME),
						object.getString(Laptop.KEY_KHARID),
						object.getString(Laptop.KEY_FOROSH),
						object.getString(Laptop.KEY_BRAND),
						object.getString(Laptop.KEY_TYPE),
						object.getString(Laptop.KEY_NOTE));
				laptops.add(laptop);
			}
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		return laptops;
	}
	
	public static void addProduct(Laptop laptop) {
		
		JSONObject object = new JSONObject();
		try {
			object.put(Laptop.KEY_COLOR, laptop.getColor());
			object.put(Laptop.KEY_WARRANTY, laptop.getWarranty());
			object.put(Laptop.KEY_MEMORY, laptop.getMemory());
			object.put(Laptop.KEY_OPERATIONSYSTEM, laptop.getOperationsystem());
			object.put(Laptop.KEY_CORE, laptop.getCore());
			object.put(Laptop.KEY_GRAPHIC, laptop.getGraphic());
			object.put(Laptop.KEY_ID, laptop.getId());
			object.put(Laptop.KEY_NAME, laptop.getName());
			object.put(Laptop.KEY_KHARID, laptop.getKharid());
			object.put(Laptop.KEY_FOROSH, laptop.getForosh());
			object.put(Laptop.KEY_BRAND, laptop.getBrand());
			object.put(Laptop.KEY_TYPE, laptop.getType());
			object.put(Laptop.KEY_NOTE, laptop.getNote());
		} catch (JSONException e1) {
			
			e1.printStackTrace();
		}
		
		String json = file.readFromFile("E:\\save\\create\\laptop.txt");
		try {
			JSONArray array = new JSONArray(json);
			array.put(object);
			file.writeToMyFile(array.toString(), "E:\\save\\create\\laptop.txt");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}
}
