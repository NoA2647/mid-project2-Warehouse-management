import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShirtSetting {
	public static List<Shirt> readAllShirt() {
		List<Shirt> shirts = new ArrayList<Shirt>();
		String json = file.readFromFile("E:\\save\\create\\shirt.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				Shirt shirt = new Shirt(object.getString(Shirt.KEY_KIND),
						object.getString(Shirt.KEY_COLOR),
						object.getString(Shirt.KEY_SIZE),
						object.getString(Shirt.KEY_MATERIAL),
						object.getString(Shirt.KEY_ID),
						object.getString(Shirt.KEY_NAME),
						object.getString(Shirt.KEY_KHARID),
						object.getString(Shirt.KEY_FOROSH),
						object.getString(Shirt.KEY_BRAND),
						object.getString(Shirt.KEY_TYPE),
						object.getString(Shirt.KEY_NOTE));
				shirts.add(shirt);
			}
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		return shirts;
	}
	
	public static void addProduct(Shirt shirt) {
		
		JSONObject object = new JSONObject();
		try {
			object.put(Shirt.KEY_KIND, shirt.getKind());
			object.put(Shirt.KEY_COLOR, shirt.getColor());
			object.put(Shirt.KEY_SIZE, shirt.getSize());
			object.put(Shirt.KEY_MATERIAL, shirt.getMaterial());
			object.put(Shirt.KEY_ID, shirt.getId());
			object.put(Shirt.KEY_NAME, shirt.getName());
			object.put(Shirt.KEY_KHARID, shirt.getKharid());
			object.put(Shirt.KEY_FOROSH, shirt.getForosh());
			object.put(Shirt.KEY_BRAND, shirt.getBrand());
			object.put(Shirt.KEY_TYPE, shirt.getType());
			object.put(Shirt.KEY_NOTE, shirt.getNote());
		} catch (JSONException e1) {
			
			e1.printStackTrace();
		}
		
		String json = file.readFromFile("E:\\save\\create\\shirt.txt");
		try {
			JSONArray array = new JSONArray(json);
			array.put(object);
			file.writeToMyFile(array.toString(), "E:\\save\\create\\shirt.txt");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}
}
