import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Book_Setting {
	public static List<Book> readAllBooks() {
		List<Book> books = new ArrayList<Book>();
		String json = file.readFromFile("E:\\save\\create\\book.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				Book book = new Book(object.getString(Book.KEY_GENRE), 
						object.getString(Book.KEY_PUBLISHER), 
						object.getString(Book.KEY_LANGUAGE),
						object.getString(Book.KEY_ID),
						object.getString(Book.KEY_NAME),
						object.getString(Book.KEY_KHARID),
						object.getString(Book.KEY_FOROSH),
						object.getString(Book.KEY_WRIGHTER),
						object.getString(Book.KEY_TYPE),
						object.getString(Book.KEY_NOTE));
				books.add(book);
			}
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		return books;
	}
	
	public static void addProduct(Book book) {
		
		JSONObject object = new JSONObject();
		try {
			object.put(Book.KEY_GENRE, book.getGenre());
			object.put(Book.KEY_PUBLISHER, book.getPublishers());
			object.put(Book.KEY_LANGUAGE, book.getLanguage());
			object.put(Book.KEY_ID, book.getId());
			object.put(Book.KEY_NAME, book.getName());
			object.put(Book.KEY_KHARID, book.getKharid());
			object.put(Book.KEY_FOROSH, book.getForosh());
			object.put(Book.KEY_WRIGHTER, book.getWrighter());
			object.put(Book.KEY_TYPE, book.getType());
			object.put(Book.KEY_NOTE, book.getNote());
		} catch (JSONException e1) {
			
			e1.printStackTrace();
		}
		
		String json = file.readFromFile("E:\\save\\create\\book.txt");
		try {
			JSONArray array = new JSONArray(json);
			array.put(object);
			file.writeToMyFile(array.toString(), "E:\\save\\create\\book.txt");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}

}
