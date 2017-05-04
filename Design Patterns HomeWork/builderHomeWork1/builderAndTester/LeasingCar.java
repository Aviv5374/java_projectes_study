package builderAndTester;

import java.awt.Color;
import java.sql.Date;

import javax.xml.crypto.Data;

import builderExample.User.Builder;

public class LeasingCar {
	private static int currentId = 0;
	
	// requiered fields
	private String licenseNumber;
	private String companyName;
	// optional fields
	private Date yearOfManufacture;
	private Color color;
	private static enum LevelOfEquipment {BASIC, MEDIUM, COMFORT} ;
	private LevelOfEquipment levelOfEquipment;
	private double price;
	
	private LeasingCar(Builder builder) {
		super();
		this.licenseNumber = builder.licenseNumber;
		this.companyName = builder.companyName;
		this.yearOfManufacture = builder.yearOfManufacture;
		this.color = builder.color;
		this.levelOfEquipment = builder.levelOfEquipment;
		this.price = builder.price;
	}
	
	public static class Builder{
		// requiered fields
		private String licenseNumber;
		private String companyName;
		// optional fields
		private Date yearOfManufacture;
		private Color color;
		private static enum LevelOfEquipment {BASIC, MEDIUM, COMFORT} ;
		private LevelOfEquipment levelOfEquipment;
		private double price;
	}
	

}
