package roomManagerSingleton;

import java.util.Random;

import javax.sql.rowset.spi.TransactionalWriter;

public class RoomManager {
	
	
	private static RoomManager roomManager = new RoomManager();
	
	private Room [] rooms;  
	
	
	private RoomManager() { 
		
		initRooms();
		
		
	}

	public static RoomManager getInstance( ) {
		   return roomManager;
		}
	
	
	private void initRooms() {
		
		Random rand = new Random ();
		rooms = new Room [rand.nextInt(4)+5];
		int roomNumber = 100; 
		for (int i = 0 ; i< rooms.length ;i++)
		{
			
			rooms[i] = new Room(roomNumber , rand.nextInt(4) + 2);
			roomNumber++;
			
		}
		
		
	}
	
	
	private boolean isPresent(Student s)
	{
		
		for (Room r : rooms)
		{
			if (s.equals(r.getOwner()))
					return true;
		}
		return false;
	}
	
	
	public void allocateRoom (Student s , int size) throws RoomManagerExcepion
	{
		
		if (isPresent(s))
		{
			throw new RoomManagerExcepion("Student already allocate.");
		}
		
		
		for (Room r : rooms)
		{
			if (r.isRoomState()==false && r.getRoomSize()<=size)
			{
				r.setOwner(s);
				r.setRoomState(true);
				return;
			}
		}
		
		throw new RoomManagerExcepion("No room avialable for that size.");
		
	}
	
	public void releaseRoom (Student s) throws RoomManagerExcepion
	{
		for (Room r : rooms)
		{
			if (s.equals(r.getOwner()))
			{
				r.setOwner(null);
				r.setRoomState(false);
				return;
			}
		}
		
		throw new RoomManagerExcepion("Student " + s.getName() + " dont have a room.");
		
	}
	
	public void printRoomsReport ()
	{
		System.out.printf("%12s%13s%12s%12s\n","roomNumber","roomState","roomSize","owner"); 
		        
		for (Room r : rooms)
		{
			System.out.println(r);
			
		}
		
		
		
	}
	

}
