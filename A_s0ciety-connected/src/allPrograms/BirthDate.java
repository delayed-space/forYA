package allPrograms;

public class BirthDate {
	String dd;
	String mm;
	String yyyy;
	
	public BirthDate(String dd, String mm, String yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public BirthDate(String mm, String yyyy) {
		this.dd = "unknown";
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public BirthDate(String yyyy) {
		this.dd = "unknown";
		this.mm = "unknown";
		this.yyyy = yyyy;
	}
	
	String getDate() {
		return dd+"/"+mm+"/"+yyyy;
	}
}
