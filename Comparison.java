
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Comparison {
	public static boolean Comparison(String str,int num)
	{
		if(num==0)
		{
			String json = file.readFromFile("E:\\save\\create\\shirt.txt");
			try {
				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					if(str.equals(object.getString(Shirt.KEY_ID)))
						return true;
				}
				
			} catch (JSONException e) {
				
				e.printStackTrace();
			}
			return false;
		}
		if(num==1)
		{
			String json = file.readFromFile("E:\\save\\create\\pants.txt");
			try {
				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					if(str.equals(object.getString(Pants.KEY_ID)))
						return true;
				}
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		if(num==2)
		{
			String json = file.readFromFile("E:\\save\\create\\television.txt");
			try {

				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					if(str.equals(object.getString(Television.KEY_ID)))
						return true;
				}
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		if(num==3)
		{
			String json = file.readFromFile("E:\\save\\create\\mobile.txt");
			try {

				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					if(str.equals(object.getString(Mobile.KEY_ID)))
						return true;
				}
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		if(num==4)
		{
			String json = file.readFromFile("E:\\save\\create\\laptop.txt");
			try {

				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					if(str.equals(object.getString(Laptop.KEY_ID)))
						return true;
				}
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		if(num==5)
		{
			String json = file.readFromFile("E:\\save\\create\\book.txt");
			try {

				JSONArray array = new JSONArray(json);
				for(int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					if(str.equals(object.getString(Book.KEY_ID)))
						return true;
				}
				
			} catch (JSONException e) {
				
				e.printStackTrace();
			}
			return false;
		}
		return false;
	}
}
