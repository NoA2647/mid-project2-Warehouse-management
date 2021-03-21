import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FactorSetting {
	public static List<Factor> readAllfactors() {
		List<Factor> factors = new ArrayList<Factor>();
		String json = file.readFromFile("E:\\save\\factor\\factor.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				Factor factor = new Factor(object.getString(Factor.KEY_CUSTOMER), 
						object.getString(Factor.KEY_DATE),
						object.getString(Factor .KEY_ID),
						object.getString(Factor .KEY_KHARID),
						object.getString(Factor.KEY_FOROSH),
						object.getString(Factor.KEY_NUMBER));
				factors.add(factor);
			}
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		return factors;
	}
	
	public static void addFactor(Factor factor) {
		
		JSONObject object = new JSONObject();
		try {
			object.put(Factor.KEY_CUSTOMER, factor.getCustomer());
			object.put(Factor.KEY_DATE, factor.getDate());
			object.put(Factor.KEY_ID, factor.getId());
			object.put(Factor.KEY_KHARID, factor.getKharid());
			object.put(Factor.KEY_FOROSH, factor.getForosh());
			object.put(Factor.KEY_NUMBER, factor.getNumber());
		} catch (JSONException e1) {
			
			e1.printStackTrace();
		}
		
		String json = file.readFromFile("E:\\save\\factor\\factor.txt");
		try {
			JSONArray array = new JSONArray(json);
			array.put(object);
			file.writeToMyFile(array.toString(), "E:\\save\\factor\\factor.txt");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}
}