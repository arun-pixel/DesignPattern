package interpreterPattern;

import java.util.Date;

public class MonthExpression extends Expression{

	public void evaluate(Interpreter interpreter) {

		String expression = interpreter.getExpression();
		Date date = interpreter.getDate();
		
		Integer month = new Integer(date.getMonth()+1);
		String tempExpression = expression.replaceAll("MM", month.toString());
		interpreter.setExpression(tempExpression);
		
	}

}
