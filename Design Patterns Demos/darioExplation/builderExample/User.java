package builderExample;

import java.sql.Date;
public class User {

	private static int currentId = 0;
	
	private String name;    // requiered fields
	private String email ;  // requiered fields

	private long id;
	private Date birthday;  // optional fields 
	private String telNum;
	private boolean gender;
	private double  weight;
	private double  height;
	
	
	private User (Builder builder) {
		super();
		this.name = builder.name;
		this.email = builder.email;
		this.id = builder.id;
		this.birthday = builder.birthday;
		this.gender = builder.gender;
		this.telNum =builder.telNum;
		this.height =builder.height;
		this.weight =builder.weight;
	}
	
	public static class Builder
	{
		private String name;    // requiered fields
		private String email ;  // requiered fields

		private long id;
		private Date birthday;  // optional fields 
		private String telNum;
		private boolean gender;
		private double  weight;
		private double  height;
		
		public Builder (String name, String email)
		{
			this.name =name;
			this.email =email;
			this.id = ++currentId;			
		}
		
		public User build()
		{
			return new User (this);			
		}
		
		public Builder id(int id)
		{
			this.id = id;
			return this;			
		}
		
		public Builder birthday(Date birthday)
		{
			this.birthday = birthday;
			return this;
			
		}
		
		public Builder telNum (String telNum)
		{
			this.telNum = telNum;
			return this;
		}		

		public Builder gender (boolean gender)
		{
			this.gender = gender;
			return this;
		}
		public Builder weight (double weight)
		{
			this.weight = weight;
			return this;
		}

		public Builder height (double height)
		{
			this.height = height;
			return this;
		}			
	}	
	
	public static int getCurrentId() {
		return currentId;
	}

	public static void setCurrentId(int currentId) {
		User.currentId = currentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "\n email=" + email + "\n id=" + id
				+ "\n birthday=" + birthday + "\n telNum=" + telNum + "\n gender="
				+ gender + "\n weight=" + weight + "\n height=" + height + "]";
	}	
}
