package app.components;

import org.springframework.stereotype.Component;

@Component
public class CalculatorComponent {

	public double add(double a, double b)
	{
		return a+b;
	}

	public double subtract(double a, double b)
	{
		return a-b;
	}

	public double multiply(double a, double b)
	{
		return a*b;
	}

	public double divide(double a, double b)
	{
		return a/b;
	}

	public double sqrt(double a)
	{
		return  Math.sqrt(a);
	}
}
