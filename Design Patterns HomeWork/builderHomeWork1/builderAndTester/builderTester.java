package builderAndTester;

import java.awt.Color;
import java.sql.Date;

import builderAndTester.LeasingCar.LevelOfEquipment;

public class builderTester {

	public static void main(String[] args) {
		LeasingCar car1 = new LeasingCar.Builder("volvo", "12-345-78").levelOfEquipment(LevelOfEquipment.BASIC).price(56).build();
		System.out.println(car1);
		LeasingCar car2 = new LeasingCar.Builder("toyota", "23-456-89").color(Color.blue).yearOfManufacture(new Date(17,5,4)).price(47).build();
		System.out.println(car2);

	}

}
