package strategyHW‬;

public class FieldEvaluator  {
	
	private FieldEvaluation evaluateStrategy;
	
	public FieldEvaluation getEvaluateStrategy() {
		return evaluateStrategy;
	}

	public void setEvaluateStrategy(FieldEvaluation newEvaluateStrategy) {
		this.evaluateStrategy = newEvaluateStrategy;
	}

	public boolean evaluate(String submitNumber,String submitEmail) {
		try {
			setEvaluateStrategy(new NumberFieldEvaluation());
			if(!evaluateStrategy.isValid(submitNumber)) throw new FieldEvaluationException();
			setEvaluateStrategy(new EmailFieldEvaluation());
			if(!evaluateStrategy.isValid(submitEmail)) throw new FieldEvaluationException();
			
		} catch (FieldEvaluationException e) {
			// TODO: handle exception
		}
		
	}
}