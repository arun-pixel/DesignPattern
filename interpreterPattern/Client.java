package interpreterPattern;

import java.util.ArrayList;
import java.util.Date;

public class Client {
	
	public static void main( String[] args )
	{

		Interpreter interpreter = new Interpreter();
		
		interpreter.setExpression("YYYY-MM-DD");
		interpreter.setDate(new Date());

			ArrayList<Expression> expressionOrderList = getExpressionOrder(interpreter);

			System.out.println("Input : " + interpreter.getExpression() + " : " + new Date());

			for(Expression expression : expressionOrderList )
			{
				expression.evaluate(interpreter);
					System.out.println(expression.getClass().getName() + " Evaluated     : "
					                + interpreter.getExpression());

			}

			System.out.println("Output : " + interpreter.getExpression());
	}

	private static ArrayList<Expression> getExpressionOrder(Interpreter interpreter )
	{
			ArrayList<Expression> expressionOrderList = new ArrayList<Expression>();
			String[] strArray = interpreter.getExpression().split("-");
			for( String string : strArray )
			{
					if( string.equals("MM") )
					{
							expressionOrderList.add(new MonthExpression());
					}
					else if( string.equals("DD") )
					{
							expressionOrderList.add(new DayExpression());
					}
					else
					{
							expressionOrderList.add(new YearExpression());
					}

			}
			return expressionOrderList;
	}

}
