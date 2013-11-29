import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import java.util.Stack;

public abstract class Operator implements ActionListener {
	private Display display;
	public Stack<Double> st;
	
	public Operator(Stack<Double> st) {
		this.st = st;
	}
	
	public abstract void operate() throws EmptyStackException;

	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public Display getDisplay() {
		return display;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			operate();
		}
		catch(Exception e1) {
			st.empty();
			display.setText("Error");
		}
	}
}
