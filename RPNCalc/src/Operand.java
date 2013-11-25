
public class Operand {
	private String val;
	
	public Operand() {
		val = new String();
	}
	
	public void addDigit(char d) {
		val += d;
		CalculatorGui.display.setText(val);
	}
	
	public void deleteLastDigit() {
		try {
			val = val.substring(0, val.length()-1);
			CalculatorGui.display.setText(val);
		}
		catch(Exception e) {
			
		}
	}
	
	public void complete() {
		Calc.st.push(new Double(val));
		val = ""; 
	}
	
	public void reset() {
		val = "";
		Calc.st.empty();
		CalculatorGui.display.setText(val);
	}
	
	public void set(String val) {
		this.val = val;
		CalculatorGui.display.setText(val);
	}
}
