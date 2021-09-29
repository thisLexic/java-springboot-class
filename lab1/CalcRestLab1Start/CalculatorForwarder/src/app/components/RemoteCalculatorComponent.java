package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RemoteCalculatorComponent {

	@Autowired
	RemoteAdd addC;

	@Autowired
	RemoteSubtract subtractC;
	
	@Autowired
	RemoteMultiply multiplyC;
	
	@Autowired
	RemoteDivide divideC;
	
	@Autowired
	RemoteSqrt sqrtC;
	
	public String add(double a, double b) throws Exception
	{
		String reply = addC.add(a, b);
				
		if (reply.equals("False")) {
			throw new RuntimeException("Invalid Input");
		}
		return reply;
	}

	public String subtract(double a, double b) throws Exception
	{
		String reply = subtractC.subtract(a, b);
				
		if (reply.equals("False")) {
			throw new RuntimeException("Invalid Input");
		}
		return reply;
	}

	public String multiply(double a, double b) throws Exception
	{

		String reply = multiplyC.multiply(a, b);
				
		if (reply.equals("False")) {
			throw new RuntimeException("Invalid Input");
		}
		return reply;
	}

	public String divide(double a, double b) throws Exception
	{
		String reply = divideC.divide(a, b);
				
		if (reply.equals("False")) {
			throw new RuntimeException("Invalid Input");
		}
		return reply;
	}

	public String sqrt(double a) throws Exception
	{
		String reply = sqrtC.sqrt(a);
				
		if (reply.equals("False")) {
			throw new RuntimeException("Invalid Input");
		}
		return reply;
	}
}
