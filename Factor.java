
public class Factor {
	public Factor()
	{
	}
	private String customer,date,id,kharid,forosh,number;
	
	public static final String KEY_CUSTOMER = "customer";
	public static final String KEY_DATE = "date";
	public static final String KEY_ID = "id";
	public static final String KEY_KHARID = "kharid";
	public static final String KEY_FOROSH = "forosh";
	public static final String KEY_NUMBER = "number";
	
	public Factor(String customer,String date,String id,String kharid,String forosh,String number) {
		this.customer = customer;
		this.date = date;
		this.id=id;
		this.kharid=kharid;
		this.forosh=forosh;
		this.number=number;
	}

	public String getKharid() {
		return kharid;
	}

	public void setKharid(String kharid) {
		this.kharid = kharid;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getForosh() {
		return forosh;
	}

	public void setForosh(String forosh) {
		this.forosh = forosh;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
