package assistant;

public class Author {
	private int authorID;
	private String name;
	private int age;
	private String country;
	
	public Author()
	{
		authorID = 0;
		name = "";
		age = 0;
		country = "";
	}
	
	public void setAuthorID(int authorID) { this.authorID = authorID; }
	public int getAuthorID() { return authorID; }
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	
	public void setAge(int age) { this.age = age; }
	public int getAge() { return age; }
	
	public void setCountry(String country) { this.country = country; }
	public String getCountry() { return country; }
}
