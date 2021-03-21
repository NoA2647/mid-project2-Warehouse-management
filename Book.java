import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Book{
	public Book()
	{
	}
	private String genre,publishers,language,id,name,kharid,forosh,wrighter,type,note;
	
	public static final String KEY_GENRE = "genre";
	public static final String KEY_PUBLISHER = "publisher";
	public static final String KEY_LANGUAGE = "language";
	public static final String KEY_ID = "id";
	public static final String KEY_NAME = "name";
	public static final String KEY_KHARID = "kharid";
	public static final String KEY_FOROSH = "forosh";
	public static final String KEY_WRIGHTER = "wrighter";
	public static final String KEY_TYPE = "type";
	public static final String KEY_NOTE = "note";
	
	public Book(String genre, String publishers, String language,String id,String name,String kharid,String forosh,String wrighter,String type,String note) {
		this.genre = genre;
		this.publishers = publishers;
		this.language = language;
		this.id=id;
		this.name=name;
		this.kharid=kharid;
		this.forosh=forosh;
		this.wrighter=wrighter;
		this.type=type;
		this.note=note;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKharid() {
		return kharid;
	}
	public void setKharid(String kharid) {
		this.kharid = kharid;
	}
	public String getForosh() {
		return forosh;
	}
	public void setForosh(String forosh) {
		this.forosh = forosh;
	}
	public String getWrighter() {
		return wrighter;
	}
	public void setWrighter(String wrighter) {
		this.wrighter = wrighter;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublishers() {
		return publishers;
	}
	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
