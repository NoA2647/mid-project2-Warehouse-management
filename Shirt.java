import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Shirt {
	public Shirt()
	{
	}
	private String kind,color,size,material,id,name,kharid,forosh,brand,type,note;
	
	public static final String KEY_KIND = "kind";
	public static final String KEY_COLOR = "color";
	public static final String KEY_SIZE = "size";
	public static final String KEY_MATERIAL = "material";
	public static final String KEY_ID = "id";
	public static final String KEY_NAME = "name";
	public static final String KEY_KHARID = "kharid";
	public static final String KEY_FOROSH = "forosh";
	public static final String KEY_BRAND = "brand";
	public static final String KEY_TYPE = "type";
	public static final String KEY_NOTE = "note";
	
	public Shirt(String kind, String color, String size,String material,String id,String name,String kharid,String forosh,String brand,String type,String note) {
		this.kind = kind;
		this.color = color;
		this.size = size;
		this.material=material;
		this.id=id;
		this.name=name;
		this.kharid=kharid;
		this.forosh=forosh;
		this.brand=brand;
		this.type=type;
		this.note=note;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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
	

}
