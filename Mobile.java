import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Mobile {
	public Mobile() 
	{
	}
	private String color,operationSystem,warranty,memory,id,name,kharid,forosh,brand,type,note;
	public static final String KEY_MEMORY = "memory";
	public static final String KEY_COLOR = "color";
	public static final String KEY_OPERATIONSYSTEM = "operationsystem";
	public static final String KEY_WARRANTY = "warranty";
	public static final String KEY_ID = "id";
	public static final String KEY_NAME = "name";
	public static final String KEY_KHARID = "kharid";
	public static final String KEY_FOROSH = "forosh";
	public static final String KEY_BRAND = "brand";
	public static final String KEY_TYPE = "type";
	public static final String KEY_NOTE = "note";
	
	public Mobile(String color, String warranty,String memory,String operationsystem,String id,String name,String kharid,String forosh,String brand,String type,String note) {
		this.color = color;
		this.warranty = warranty;
		this.memory = memory;
		this.operationSystem=operationsystem;
		this.id=id;
		this.name=name;
		this.kharid=kharid;
		this.forosh=forosh;
		this.brand=brand;
		this.type=type;
		this.note=note;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
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
