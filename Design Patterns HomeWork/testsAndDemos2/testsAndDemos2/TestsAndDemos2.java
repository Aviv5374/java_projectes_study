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
		System.out.println("strSmallLater cod of chars");
		for (int i = 0; i < strSmallLater.length(); i++) {
			System.out.println(strSmallLater.charAt(i) + " " + strSmallLater.codePointAt(i));
		}
		System.out.println("strCapitolLater cod of chars");
		for (int i = 0; i < strCapitolLater.length(); i++) {
			System.out.println(strCapitolLater.charAt(i) + " " + strCapitolLater.codePointAt(i));
		}
		System.out.println("strSimbols cod of chars");
		for (int i = 0; i < strSimbols.length(); i++) {
			System.out.println(strSimbols.charAt(i) + " " + strSimbols.codePointAt(i));
		}

	}

}
