package app.components;

import org.springframework.stereotype.Component;

@Component
public class AdderComponent {

	public double add(double a, double b)
	{
		return a+b;
	}
}
