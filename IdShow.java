import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IdShow {
	public static void IdShow(int num) {
		List<String> IDs=new ArrayList<String>();
		if(num==0)
		{
			String json = file.readFromFile("E:\\save\\create\\shirt.txt");
			try {
				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					IDs.add(object.getString(Shirt.KEY_ID));
				}
				
			} catch (JSONException e) {
				
				e.printStackTrace();
			}
		}
	if(num==1)
	{
		String json = file.readFromFile("E:\\save\\create\\pants.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				IDs.add(object.getString(Pants.KEY_ID));
			}
			
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}

if(num==2)
{
	String json = file.readFromFile("E:\\save\\create\\television.txt");
	try {
		JSONArray array = new JSONArray(json);
		for(int i = 0; i < array.length(); i++) {
			JSONObject object = array.getJSONObject(i);
			IDs.add(object.getString(Television.KEY_ID));
		}
		
	} catch (JSONException e) {
		
		e.printStackTrace();
	}
}
if(num==3)
{
	String json = file.readFromFile("E:\\save\\create\\mobile.txt");
	try {
		JSONArray array = new JSONArray(json);
		for(int i = 0; i < array.length(); i++) {
			JSONObject object = array.getJSONObject(i);
			IDs.add(object.getString(Mobile.KEY_ID));
		}
		
	} catch (JSONException e) {
		
		e.printStackTrace();
	}
}

if(num==4)
{
	String json = file.readFromFile("E:\\save\\create\\laptop.txt");
	try {
		JSONArray array = new JSONArray(json);
		for(int i = 0; i < array.length(); i++) {
			JSONObject object = array.getJSONObject(i);
			IDs.add(object.getString(Laptop.KEY_ID));
		}
		
	} catch (JSONException e) {
		
		e.printStackTrace();
	}
}

		if(num==5)
		{
			String json = file.readFromFile("E:\\save\\create\\book.txt");
			try {
				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					IDs.add(object.getString(Book.KEY_ID));
				}
				
			} catch (JSONException e) {
				
				e.printStackTrace();
			}
		}
		JOptionPane.showMessageDialog(null, IDs,"ID",JOptionPane.INFORMATION_MESSAGE);
	}
}
