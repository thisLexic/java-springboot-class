package app.components;

import org.springframework.stereotype.Component;

@Component
public class MultiplierComponent {

	public double multiply(double a, double b)
	{
		return a*b;
	}
}
