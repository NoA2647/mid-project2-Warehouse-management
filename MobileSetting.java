import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MobileSetting {
		public static List<Mobile> readAllmobile() {
			List<Mobile> mobiles = new ArrayList<Mobile>();
			String json = file.readFromFile("E:\\save\\create\\mobile.txt");
			try {
				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					Mobile mobile = new Mobile(object.getString(Mobile.KEY_COLOR),
							object.getString(Mobile.KEY_WARRANTY),
							object.getString(Mobile.KEY_MEMORY),
							object.getString(Mobile.KEY_OPERATIONSYSTEM),
							object.getString(Mobile.KEY_ID),
							object.getString(Mobile.KEY_NAME),
							object.getString(Mobile.KEY_KHARID),
							object.getString(Mobile.KEY_FOROSH),
							object.getString(Mobile.KEY_BRAND),
							object.getString(Mobile.KEY_TYPE),
							object.getString(Mobile.KEY_NOTE));
					mobiles.add(mobile);
				}
			} catch (JSONException e) {
				
				e.printStackTrace();
			}
			return mobiles;
		}
		
		public static void addProduct(Mobile mobile) {
			
			JSONObject object = new JSONObject();
			try {
				object.put(Mobile.KEY_COLOR, mobile.getColor());
				object.put(Mobile.KEY_WARRANTY, mobile.getWarranty());
				object.put(Mobile.KEY_MEMORY, mobile.getMemory());
				object.put(Mobile.KEY_OPERATIONSYSTEM, mobile.getOperationSystem());
				object.put(Mobile.KEY_ID, mobile.getId());
				object.put(Mobile.KEY_NAME, mobile.getName());
				object.put(Mobile.KEY_KHARID, mobile.getKharid());
				object.put(Mobile.KEY_FOROSH, mobile.getForosh());
				object.put(Mobile.KEY_BRAND, mobile.getBrand());
				object.put(Mobile.KEY_TYPE, mobile.getType());
				object.put(Mobile.KEY_NOTE, mobile.getNote());
			} catch (JSONException e1) {
				
				e1.printStackTrace();
			}
			
			String json = file.readFromFile("E:\\save\\create\\mobile.txt");
			try {
				JSONArray array = new JSONArray(json);
				array.put(object);
				file.writeToMyFile(array.toString(), "E:\\save\\create\\mobile.txt");
			} catch (JSONException e) {
				
				e.printStackTrace();
			}
		}
	
}
