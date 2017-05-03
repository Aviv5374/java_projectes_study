package mainsAndTesters;

import java.util.Random;

import roomAndManager.RoomManager;
import student.Student;

public class RoomSystemDemo {

	public static void main(String[] args) {
		RoomManager roomManagerInsctans = RoomManager.getInstance();
		Random rand = new Random();
		Student[] students = new Student[10];
		students[0]= new Student("aaaaa", "Aviv");
		students[1]= new Student("bbbbb", "Yosi");
		students[2]= new Student("ccccc", "Rot");
		students[3]= new Student("ddddd", "Tal");
		students[4]= new Student("eeeee", "Moshe");
		students[5]= new Student("fffff", "Baroch");
		
		students[0].OrderRoom();
		students[2].OrderRoom();
		students[5].OrderRoom();
		roomManagerInsctans.StateOfTheRooms();
		
		students[3].OrderRoom();
		students[0].ReleaseRoom();
		students[4].OrderRoom();
		roomManagerInsctans.StateOfTheRooms();
		
		students[0].OrderRoom();
		students[2].ReleaseRoom();
		students[1].OrderRoom();
		roomManagerInsctans.StateOfTheRooms();

	}

}
