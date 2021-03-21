import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.bind.ParseConversionEvent;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class KharidKol {
	public static int KharidKol()
	{
		int sum=0;
		String json = file.readFromFile("E:\\save\\factor\\factor.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				sum+=Integer.parseInt(object.getString(Factor.KEY_KHARID));
				
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return sum;
	}
	public static String Kharid(String ID,int num)
	{
		if(num==0)
		{
			String json = file.readFromFile("E:\\save\\create\\shirt.txt");
			try {
				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					if(ID.equals(object.getString(Shirt.KEY_ID)))
						return object.getString(Shirt.KEY_KHARID);
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
					if(ID.equals(object.getString(Pants.KEY_ID)))
						return object.getString(Pants.KEY_KHARID);
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
					if(ID.equals(object.getString(Television.KEY_ID)))
						return object.getString(Television.KEY_KHARID);
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
					if(ID.equals(object.getString(Mobile.KEY_ID)))
						return object.getString(Mobile.KEY_KHARID);
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
					if(ID.equals(object.getString(Laptop.KEY_ID)))
						return object.getString(Laptop.KEY_KHARID);
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
					if(ID.equals(object.getString(Book.KEY_ID)))
						return object.getString(Book.KEY_KHARID);
				}
				
			} catch (JSONException e) {
				
				e.printStackTrace();
			}
		}
		return ("not found");
	}
}
