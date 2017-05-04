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
	//private static enum LevelOfEquipment {BASIC, MEDIUM, COMFORT} ;
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
		public static enum LevelOfEquipment {BASIC, MEDIUM, COMFORT} ;
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
		
		p
	
	
	
	}
	
	
	
	
	

}
