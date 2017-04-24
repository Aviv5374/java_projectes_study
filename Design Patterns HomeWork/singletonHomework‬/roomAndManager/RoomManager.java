package roomAndManager;

import java.util.Random;

public class RoomManager {
  
	private static RoomManager instance = null;
	private Room[] rooms;
	
	private RoomManager() {
		this.rooms = new Room[5];
		Random rand = new Random();
		for (int i = 0; i < rooms.length; i++) {
			int size = rand.nextInt(6)+3;
			int num = i+1;
			rooms[i]= new Room(num,size);
		}
	}
	
	public static RoomManager getInstance() {
		if(instance=null)
			return instance = new RoomManager();
		else
		return instance;
	}
	//?
	public Room[] getRooms() {
		return rooms;
	}
	
	public Room GetRoomByNumber(int roomNumber){
		
	}
	
	public Room CheckForFreeRoom(){
		
	}
	
	public void FreeRoom(){
		
	}
	
	public void StateOfTheRooms(){
		
	}
}
