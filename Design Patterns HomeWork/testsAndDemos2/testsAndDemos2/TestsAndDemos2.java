package testsAndDemos2;

public class TestsAndDemos2 {

	public static void main(String[] args) {
		String strNumber = "0123456789";
		String strSmallLater = "abcdefghijklmnopqrstuvwxyz";
		String strCapitolLater = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
		String strSimbols = "@.";

		System.out.println("strNumber cod of chars");
		for (int i = 0; i < strNumber.length(); i++) {
			System.out.println(strNumber.charAt(i) + " " + strNumber.codePointAt(i));
		}

	}

}
