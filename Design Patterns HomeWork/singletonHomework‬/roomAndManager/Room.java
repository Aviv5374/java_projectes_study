package roomAndManager;

public class Room {
  private enum RoomState{Full,HaifFull,Free};
  private RoomState roomState;
  private final int roomNumber;
  private int roomSize;
  private Chair[] chairsInRoom;
  

public RoomState getRoomState() {
	return roomState;
}

public void setRoomState(RoomState roomState) {
	this.roomState = roomState;
}

public int getRoomSize() {
	return roomSize;
}
//?
private void setRoomSize(int roomSize) {
	this.roomSize = roomSize;
}
public Chair[] getChairsInRoom() {
	return chairsInRoom;
}
public void setChairsInRoom(Chair[] chairsInRoom) {
	this.chairsInRoom = chairsInRoom;
}
public int getRoomNumber() {
	return roomNumber;
}
  
  
}
