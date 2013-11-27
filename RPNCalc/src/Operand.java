import java.awt.TextField;
import java.util.Stack;


public class Operand {
	private String val;
	private Stack<Double> st;
	private TextField display;
	
	public Operand(Stack<Double> st) {
		val = new String();
		this.st = st;
	}
	
	public void addDigit(char d) {
		val += d;
		display.setText(val);
	}
	
	public void deleteLastDigit() {
		try {
			val = val.substring(0, val.length()-1);
			display.setText(val);
		}
		catch(Exception e) {
			
		}
	}
	
	public void complete() {
		st.push(new Double(val));
		val = ""; 
	}
	
	public void reset() {
		val = "";
		st.empty();
		display.setText(val);
	}
	
	public void set(String val) {
		this.val = val;
		display.setText(val);
	}
	
	public void setDisplay(TextField display) {
		this.display = display;
	}

	public TextField getDisplay() {
		return display;
	}
}
