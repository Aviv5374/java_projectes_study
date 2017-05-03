package roomManagerSingleton;

public class RoomManagerDemoMain {
	
	
	
   public static void main(String[] args) throws InterruptedException {
	
	String [] names = {"yossi","avi","albert","gil","itay","sapir","moshe","amir","dany", "sigal"};
	String [] ids = {"111111111","222222222","3333333333","444444444","555555555","666666666","777777777","888888888","999999999", "123456789"};
	 
	Student [] students = new Student[10];
	
	for(int i=0;i<students.length;i++)
	{
		
		try {
			students[i] = new Student(ids[i],names[i]);
		} catch (InvalidStudentException e) {
		
			System.err.println(e.getReason());
		}
	}
	
	
	RoomManager  manager = RoomManager.getInstance();
	manager.printRoomsReport();
	
	 for (Student s : students)
		try {
			System.out.println("try to allocate room for " + s.getName() + "...");
			Thread.sleep(1000);
			s.allocateRoom();
			Thread.sleep(1000);
			System.out.println("room allocated for " + s.getName() + "...");
			
		} catch (RoomManagerExcepion e) {
			
			System.err.println(e.getReason());
			
		}
	 manager.printRoomsReport();   
    }
	

}
