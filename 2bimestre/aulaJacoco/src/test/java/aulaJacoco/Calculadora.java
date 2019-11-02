package aulaJacoco;

public class Calculadora {
	
	public Float dividir(Float x, Float y) {
		
		Float returnedVal;
		try {
			returnedVal = x/y;
			if(y.equals(0.0f))
				throw new ArithmeticException();
		} catch (ArithmeticException ae) {
			returnedVal = 0f;
		}
		return returnedVal;
	}
}
