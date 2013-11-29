import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import java.util.Stack;

public abstract class Operator implements ActionListener {
	public TextField display;
	public Stack<Double> st;
	
	public Operator(Stack<Double> st) {
		this.st = st;
	}
	
	public abstract void operate() throws EmptyStackException;

	public void setDisplay(TextField display) {
		this.display = display;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			operate();
		}
		catch(EmptyStackException e1) {
			st.empty();
			display.setText("Error");
		}
		catch(ArithmeticException e2) {
			st.empty();
			display.setText("Error");
		}
	}
}
