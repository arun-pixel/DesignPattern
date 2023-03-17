package interpreterPattern;

import java.util.Date;

public class DayExpression extends Expression{

	public void evaluate(Interpreter interpreter) {

		String expression = interpreter.getExpression();
		Date date = interpreter.getDate();
		
		Integer day = new Integer(date.getDate());
		String tempExpression = expression.replaceAll("DD", day.toString());
		interpreter.setExpression(tempExpression);
	}

}
