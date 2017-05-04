package builderExample;

import java.sql.Date;
public class UserTest {
	public static void main(String[] args) {		
	  User user = new User.Builder("dario", "dario@gmail.com").
	    	               gender(true).
			               height(171.5).
			               telNum("052-3454321").build();
	  System.out.println(user);
	}
}
