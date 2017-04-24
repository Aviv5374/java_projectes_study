package roomAndManager;

public class Room {
  private enum RoomState{Full,HaifFull,Free};
  private RoomState roomState=RoomState.Free;
  private final int roomNumber;
  private int roomSize;
  private Chair[] chairsInRoom;
  

public Room(int number, int size) {
	super();
	this.roomNumber = number;
	setRoomSize(size);
	this.chairsInRoom = new Chair[getRoomSize()];
	for(int i=0; i < chairsInRoom.length; i++){
		chairsInRoom[i] = new Chair(); 
	}
}

public RoomState getRoomState() {
	return roomState;
}

private void setRoomState(RoomState state) {
	this.roomState = roomState;
}

public int getRoomSize() {
	return roomSize;
}

private void setRoomSize(int size) {
	if(size<3)
	this.roomSize = 3;
	else
		this.roomSize = roomSize;
}
//?
public Chair[] getChairsInRoom() {
	return chairsInRoom;
}
//?
public void setChairsInRoom(Chair[] chairsInRoom) {
	this.chairsInRoom = chairsInRoom;
}

public int getRoomNumber() {
	return roomNumber;
}
  
public boolean CheckForFreeChair(){
	
}
//?
public Chair GetChairByIndex(){
	
}

}
