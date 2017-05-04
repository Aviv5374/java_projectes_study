package student;

import roomAndManager.RoomManager;

public class Student {
   private String sudentID;
   private String studentName;
   private int sitInRoomNumber = 0;
   private RoomManager roomManagerInsctans = RoomManager.getInstance();
   
   public Student(String id, String name){//throws Exception {
	this.sudentID = id;
	this.studentName = name;
}
   
public String getSudentID() {
	return sudentID;
}

public void setSudentID(String id) {
	this.sudentID = id;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String name) {
	this.studentName = name;
}

public int getSitInRoomNumber() {
	return sitInRoomNumber;
}

public void setSitInRoomNumber(int roomNumber) {
	if(roomNumber <0)
		this.sitInRoomNumber=0;
	else
	this.sitInRoomNumber = roomNumber;
}

public void OrderRoom(){
	setSitInRoomNumber(roomManagerInsctans.CheckForFreeRoom());
}

public void ReleaseRoom(){
	roomManagerInsctans.FreeRoom(getSitInRoomNumber());
	setSitInRoomNumber(0);
}

}
