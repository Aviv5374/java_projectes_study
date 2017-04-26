package student;

import roomAndManager.RoomManager;

public class Student {
   private String sudentID;
   private String studentName;
   private int sitInRoomNumber;
   private RoomManager roomManagerInsctans = RoomManager.getInstance();
   
   public Student(String sudentID, String studentName) {
	super();
	this.sudentID = sudentID;
	this.studentName = studentName;
}
   
public String getSudentID() {
	return sudentID;
}

public void setSudentID(String sudentID) {
	this.sudentID = sudentID;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public int getSitInRoomNumber() {
	return sitInRoomNumber;
}

public void setSitInRoomNumber(int sitInRoomNumber) {
	this.sitInRoomNumber = sitInRoomNumber;
}

public void OrderRoom(){
	setSitInRoomNumber(roomManagerInsctans.CheckForFreeRoom());
}

public void ReleaseRoom(){
	roomManagerInsctans.FreeRoom(getSitInRoomNumber());
	setSitInRoomNumber(0);
}

}
