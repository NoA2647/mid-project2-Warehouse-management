import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PantsSetting {
	public static List<Pants> readAllPants() {
		List<Pants> pants = new ArrayList<Pants>();
		String json = file.readFromFile("E:\\save\\create\\pants.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				Pants pant = new Pants(object.getString(Pants.KEY_KIND),
						object.getString(Pants.KEY_COLOR),
						object.getString(Pants.KEY_SIZE),
						object.getString(Pants.KEY_MATERIAL),
						object.getString(Pants.KEY_ID),
						object.getString(Pants.KEY_NAME),
						object.getString(Pants.KEY_KHARID),
						object.getString(Pants.KEY_FOROSH),
						object.getString(Pants.KEY_BRAND),
						object.getString(Pants.KEY_TYPE),
						object.getString(Pants.KEY_NOTE));
				pants.add(pant);
			}
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		return pants;
	}
	
	public static void addProduct(Pants pant) {
		
		JSONObject object = new JSONObject();
		try {
			object.put(Pants.KEY_KIND, pant.getKind());
			object.put(Pants.KEY_COLOR, pant.getColor());
			object.put(Pants.KEY_SIZE, pant.getSize());
			object.put(Pants.KEY_MATERIAL, pant.getMaterial());
			object.put(Pants.KEY_ID, pant.getId());
			object.put(Pants.KEY_NAME, pant.getName());
			object.put(Pants.KEY_KHARID, pant.getKharid());
			object.put(Pants.KEY_FOROSH, pant.getForosh());
			object.put(Pants.KEY_BRAND, pant.getBrand());
			object.put(Pants.KEY_TYPE, pant.getType());
			object.put(Pants.KEY_NOTE, pant.getNote());
		} catch (JSONException e1) {
			
			e1.printStackTrace();
		}
		
		String json = file.readFromFile("E:\\save\\create\\pants.txt");
		try {
			JSONArray array = new JSONArray(json);
			array.put(object);
			file.writeToMyFile(array.toString(), "E:\\save\\create\\pants.txt");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}
}
