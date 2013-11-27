import java.util.*;

public class Divider extends Operator {
	public Divider(Stack<Double> st) {
		super(st);
	}
	
	public void operate() {
		try {
			Double b = st.pop();
			Double a = st.pop();
			
			st.push(new Double(a/b));
		}
		catch(EmptyStackException e) {
			throw new InvalidArgsException();
		}
		catch(ArithmeticException e1) {
			display.setText("Error");
		}
	}
}
