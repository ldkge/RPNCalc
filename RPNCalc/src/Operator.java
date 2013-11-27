import java.awt.TextField;
import java.util.Stack;


public abstract class Operator {
	public TextField display;
	public Stack<Double> st;
	
	public Operator(Stack<Double> st) {
		this.st = st;
	}
	
	abstract void operate();

	public void setDisplay(TextField display) {
		this.display = display;
	}

	public TextField getDisplay() {
		return display;
	}
}
