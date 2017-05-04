package builderAndTester;

import java.awt.Color;
import java.sql.Date;

import javax.xml.crypto.Data;


public class LeasingCar {
	private static int currentId = 0;
	private long id;
	// requiered fields
	private String licenseNumber;
	private String companyName;
	// optional fields
	private Date yearOfManufacture;
	private Color color;
	public static enum LevelOfEquipment {BASIC, MEDIUM, COMFORT} ;
	private LevelOfEquipment levelOfEquipment;
	private double price;
	
	private LeasingCar(Builder builder) {
		super();
		this.id = builder.id;
		this.licenseNumber = builder.licenseNumber;
		this.companyName = builder.companyName;
		this.yearOfManufacture = builder.yearOfManufacture;
		this.color = builder.color;
		this.levelOfEquipment = builder.levelOfEquipment;
		this.price = builder.price;
	}
	
	public static class Builder{
		private long id;
		
		// requiered fields
		private String licenseNumber;
		private String companyName;
		// optional fields
		private Date yearOfManufacture;
		private Color color;
		private LevelOfEquipment levelOfEquipment;
		private double price;
	
		public Builder (String companyName, String licenseNumber)
		{
			this.companyName =companyName;
			this.licenseNumber =licenseNumber;
			this.id = ++currentId;			
		}
		
		public LeasingCar build(){
			return new LeasingCar(this); 
		}
		
		public Builder yearOfManufacture(Date yearOfManufacture) {
			this.yearOfManufacture=yearOfManufacture;
			return this;
		}
		
		public Builder color(Color color) {
			this.color=color;
			return this;
		}
		
		public Builder levelOfEquipment(LevelOfEquipment levelOfEquipment) {
			this.levelOfEquipment=levelOfEquipment;
			return this;
		}
		
		public Builder price(double price) {
			this.price=price;
			return this;
		}		
	}
	
	public static int getCurrentId() {
		return currentId;
	}

	public static void setCurrentId(int currentId) {
		LeasingCar.currentId = currentId;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(Date yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public LevelOfEquipment getLevelOfEquipment() {
		return levelOfEquipment;
	}

	public void setLevelOfEquipment(LevelOfEquipment levelOfEquipment) {
		this.levelOfEquipment = levelOfEquipment;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LeasingCar [id=" + id + ", licenseNumber=" + licenseNumber + ", companyName=" + companyName
				+ ", yearOfManufacture=" + yearOfManufacture + ", color=" + color + ", levelOfEquipment="
				+ levelOfEquipment + ", price=" + price + "]";
	}

	

	

}
