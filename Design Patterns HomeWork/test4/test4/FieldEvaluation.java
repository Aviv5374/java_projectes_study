package test4;

public interface FieldEvaluation {
	boolean isValid(String submitText);
}

class NumberFieldEvaluation implements FieldEvaluation{

	@Override
	public boolean isValid(String submitText) {
		for (int i = 0; i < submitText.length(); i++) {
			if
		}
		
		submitText.charAt(i);
		return false;
	}
	
}

class EmailFieldEvaluation implements FieldEvaluation{

	@Override
	public boolean isValid(String submitText) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
