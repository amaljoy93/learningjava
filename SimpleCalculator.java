package assignements;

public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;

	public   double getFirstNumber() {
		return this.firstNumber;
	 
	}
	public double getSecondNumber() {
		return this.secondNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber=firstNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber=secondNumber;
	}
	public double getAdditionResult() {
		return (secondNumber+firstNumber);
	}
	public double getSubtractionResult() {
		return (secondNumber-firstNumber);
	}
	public double getMultiplicationResult() {
		return (secondNumber*firstNumber);
	}
	public double getDivisionResult() {
		if(secondNumber==0) {
			return 0;
		}
		return (firstNumber/secondNumber);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(45);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(45);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());

	}

}
