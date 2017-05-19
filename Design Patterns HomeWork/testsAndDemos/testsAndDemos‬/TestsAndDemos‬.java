package testsAndDemos‬;

public class TestsAndDemos‬{
  public static void main(String[] args) {
	  String strNumber = "0123456789";
	  String strSmallLater = "abcdefghijklmnopqrstuvwxyz";
	  String strCapitolLater = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
	  String strSimbols = "@.";
	  
	  for (int i =0; i<strNumber.length(); i++) {
		  System.out.println(strNumber.charAt(i)+" "+strNumber.codePointAt(i));
	}
	  
  }
}