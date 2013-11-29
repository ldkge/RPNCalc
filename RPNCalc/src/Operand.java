import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Operand implements ActionListener {
	private Stack<Double> st;
	private Display display;
	
	public Operand(Stack<Double> st) {
		this.st = st;
	}
	
	public void addDigit(char d) {
		display.appendText(d);
	}
	
	public void deleteLastDigit() {
		try {
			display.trimText();
		}
		catch(Exception e) {
			display.clearText();
		}
	}
	
	public void complete() {
		try {
			st.push(new Double(display.getText()));
		}
		catch(Exception e) {
			
		}
		finally {
			display.resetText();
		}
		
		
	}
	
	public void reset() {
		st.empty();
		display.clearText();
	}
	
	public void setDisplay(Display display) {
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
