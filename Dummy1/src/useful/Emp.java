package jdbcfirstprgm.com.example;

public class Emp {
	private int id;
	private String eName;
	private String email;
	private String eSalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String geteSalary() {
		return eSalary;
	}
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", eName=" + eName + ", email=" + email + ", eSalary=" + eSalary + "]";
	}
	

}
