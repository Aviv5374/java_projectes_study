package strategyHW‬;


public interface FieldEvaluation{
	boolean isValid(String submitText);
}

class NumberFieldEvaluation implements FieldEvaluation{

	@Override
	public boolean isValid(String submitText) {
		// TODO Auto-generated method stub
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