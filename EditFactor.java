
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EditFactor {
	public static ArrayList<String> FindFactor(String ID) {
		String json = file.readFromFile("E:\\save\\factor\\factor.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				if(ID.equals(object.getString(Factor.KEY_ID)))
				{
					ArrayList<String> string= new ArrayList<String>();
					string.add("customer:"+object.getString(Factor.KEY_CUSTOMER)+"\n");
					string.add("date:"+object.getString(Factor.KEY_DATE)+"\n");
					string.add("id:"+object.getString(Factor.KEY_ID)+"\n");
					string.add("forosh:"+object.getString(Factor.KEY_FOROSH)+"\n");
					string.add("number:"+object.getString(Factor.KEY_NUMBER));
					return string;
				}
			}
			
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	public static void EditFactor(String ID,JSONObject string) {
		String json = file.readFromFile("E:\\save\\factor\\factor.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				if(ID.equals(object.getString(Factor.KEY_ID)))
				{
					
					object.put(Factor.KEY_CUSTOMER, string.get(Factor.KEY_CUSTOMER));
					object.put(Factor.KEY_DATE, string.get(Factor.KEY_DATE));
					object.put(Factor.KEY_ID, string.get(Factor.KEY_ID));
					object.put(Factor.KEY_KHARID, string.get(Factor.KEY_KHARID));
					object.put(Factor.KEY_FOROSH, string.get(Factor.KEY_FOROSH));
					object.put(Factor.KEY_NUMBER, string.get(Factor.KEY_NUMBER));
				}
			}
			file.writeToMyFile(array.toString(), "E:\\save\\factor\\factor.txt");
			JOptionPane.showMessageDialog(null,"changed sucssesfully","edit",JOptionPane.INFORMATION_MESSAGE);
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}
	
}
