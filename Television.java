import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Television{
	public Television()
	{
	}
	private String power,color,energylabel,warranty,kind;
	private String id,name,kharid,forosh,brand,type,note;
	
	public static final String KEY_KIND = "kind";
	public static final String KEY_COLOR = "color";
	public static final String KEY_POWER = "power";
	public static final String KEY_WARRANTY = "warranty";
	public static final String KEY_ENERGYLABEL = "energylabel";
	public static final String KEY_ID = "id";
	public static final String KEY_NAME = "name";
	public static final String KEY_KHARID = "kharid";
	public static final String KEY_FOROSH = "forosh";
	public static final String KEY_BRAND = "brand";
	public static final String KEY_TYPE = "type";
	public static final String KEY_NOTE = "note";
	
	public Television(String power, String color, String energylabel,String warranty,String kind,String id,String name,String kharid,String forosh,String brand,String type,String note) {
		this.power = power;
		this.color = color;
		this.energylabel = energylabel;
		this.warranty=warranty;
		this.kind=kind;
		this.id=id;
		this.name=name;
		this.kharid=kharid;
		this.forosh=forosh;
		this.brand=brand;
		this.type=type;
		this.note=note;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEnergylabel() {
		return energylabel;
	}

	public void setEnergylabel(String energylabel) {
		this.energylabel = energylabel;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
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
