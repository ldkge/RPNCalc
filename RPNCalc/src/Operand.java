import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Operand implements ActionListener {
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
			display.setText(val.length() != 0 ? val : "0" );
		}
		catch(Exception e) {
			display.setText("0");
		}
	}
	
	public void complete() {
		st.push(new Double(val));
		val = ""; 
	}
	
	public void reset() {
		val = "";
		st.empty();
		display.setText("0");
	}
	
	public void set(String val) {
		this.val = val;
		display.setText(val);
	}
	
	public void setDisplay(TextField display) {
		this.display = display;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(isNumber(((Button)arg0.getSource()).getLabel())) {
			addDigit(((Button)arg0.getSource()).getLabel().toCharArray()[0]);
		}
		else {
			switch(((Button)arg0.getSource()).getLabel().toCharArray()[0]) {
			case 'D': deleteLastDigit(); break;
			case 'E': complete(); break;
			case 'C': reset(); break;
			case '.': addDigit(((Button)arg0.getSource()).getLabel().toCharArray()[0]); break;
			}
		}
	}
	
	private boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
}
