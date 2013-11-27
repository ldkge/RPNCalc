import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public abstract class Operator implements ActionListener {
	public TextField display;
	public Stack<Double> st;
	
	public Operator(Stack<Double> st) {
		this.st = st;
	}
	
	public abstract void operate();

	public void setDisplay(TextField display) {
		this.display = display;
	}
	
	public void actionPerformed(ActionEvent e) {
		operate();
	}
}
