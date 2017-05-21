package test4;

public class FieldEvaluator {
private FieldEvaluation evaluateStrategy;
	
	public FieldEvaluation getEvaluateStrategy() {
		return evaluateStrategy;
	}

	public void setEvaluateStrategy(FieldEvaluation newEvaluateStrategy) {
		this.evaluateStrategy = newEvaluateStrategy;
	}

	public String evaluate(String submitNumber,String submitEmail) {
		try {
			setEvaluateStrategy(new NumberFieldEvaluation());
			if(!evaluateStrategy.isValid(submitNumber)) throw new FieldEvaluationException();
			setEvaluateStrategy(new EmailFieldEvaluation());
			if(!evaluateStrategy.isValid(submitEmail)) throw new FieldEvaluationException();
			return "Welcome";
		} catch (FieldEvaluationException e) {
			return "One of the parnetrs isn't valid. pleace try again.";
		}
		
	}
}
