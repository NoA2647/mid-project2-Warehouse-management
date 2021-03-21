import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class televisionSetting {
	public static List<Television> readAllTelevision() {
		List<Television> tels = new ArrayList<Television>();
		String json = file.readFromFile("E:\\save\\create\\television.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				Television tel = new Television(object.getString(Television.KEY_POWER),
						object.getString(Television.KEY_COLOR),
						object.getString(Television.KEY_ENERGYLABEL),
						object.getString(Television.KEY_WARRANTY),
						object.getString(Television.KEY_KIND),
						object.getString(Television.KEY_ID),
						object.getString(Television.KEY_NAME),
						object.getString(Television.KEY_KHARID),
						object.getString(Television.KEY_FOROSH),
						object.getString(Television.KEY_BRAND),
						object.getString(Television.KEY_TYPE),
						object.getString(Television.KEY_NOTE));
				tels.add(tel);
			}
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		return tels;
	}
	
	public static void addProduct(Television tel) {
		
		JSONObject object = new JSONObject();
		try {
			object.put(Television.KEY_POWER, tel.getPower());
			object.put(Television.KEY_COLOR, tel.getColor());
			object.put(Television.KEY_ENERGYLABEL, tel.getEnergylabel());
			object.put(Television.KEY_WARRANTY, tel.getWarranty());
			object.put(Television.KEY_KIND, tel.getKind());
			object.put(Television.KEY_ID, tel.getId());
			object.put(Television.KEY_NAME, tel.getName());
			object.put(Television.KEY_KHARID, tel.getKharid());
			object.put(Television.KEY_FOROSH, tel.getForosh());
			object.put(Television.KEY_BRAND, tel.getBrand());
			object.put(Television.KEY_TYPE, tel.getType());
			object.put(Television.KEY_NOTE, tel.getNote());
		} catch (JSONException e1) {
			
			e1.printStackTrace();
		}
		
		String json = file.readFromFile("E:\\save\\create\\television.txt");
		try {
			JSONArray array = new JSONArray(json);
			array.put(object);
			file.writeToMyFile(array.toString(), "E:\\save\\create\\television.txt");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}
}
