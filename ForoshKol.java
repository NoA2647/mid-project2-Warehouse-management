import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ForoshKol {
	public static int ForoshKol()
	{
		int sum = 0;
		String json = file.readFromFile("E:\\save\\factor\\factor.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				sum+=Integer.parseInt(object.getString(Factor.KEY_FOROSH));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return sum;
	}
}
