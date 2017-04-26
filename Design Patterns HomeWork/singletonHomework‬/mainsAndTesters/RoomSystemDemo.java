package mainsAndTesters;

import java.util.Random;

import student.Student;

public class RoomSystemDemo {

	public static void main(String[] args) {
		Random rand = new Random();
		Student[] students = new Student[10];
		students[0]= new Student("aaaaa", "Aviv");
		students[1]= new Student("bbbbb", "Yosi");
		students[2]= new Student("ccccc", "Rot");
		students[3]= new Student("ddddd", "Tal");
		students[4]= new Student("eeeee", "Moshe");
		students[5]= new Student("fffff", "Baroch");
		
		for (int i = 0; i < 6; i++) {
			int randomIndex = rand.nextInt(6);
			
		}

	}

}
