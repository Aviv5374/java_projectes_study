package test4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface FieldEvaluation {
	boolean isValid(String submitText);
}

class NumberFieldEvaluation implements FieldEvaluation {

	@Override
	public boolean isValid(String submitText) {
		for (int i = 0; i < submitText.length(); i++) {
			if (submitText.codePointAt(i) < 48 || submitText.codePointAt(i) > 57)
				return false;
		}
		return true;
	}

}

class EmailFieldEvaluation implements FieldEvaluation {

	@Override
	public boolean isValid(String submitText) {
		Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
		Matcher mat = pattern.matcher(submitText);
		return mat.matches();
	}

}
