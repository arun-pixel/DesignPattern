package interpreterPattern;

import java.util.Date;

public class YearExpression extends Expression{

	
	public void evaluate(Interpreter interpreter) {

		String expression = interpreter.getExpression();
		Date date = interpreter.getDate();
		
		Integer year = new Integer(date.getYear() + 1900);
		String tempExpression = expression.replaceAll("YYYY", year.toString());
		interpreter.setExpression(tempExpression);
		
	}

}
