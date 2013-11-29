import java.util.*;

public class Divider extends Operator {
	public Divider(Stack<Double> st) {
		super(st);
	}
	
	public void operate() throws EmptyStackException, ArithmeticException {
		Double b = st.pop();
		Double a = st.pop();
			
		st.push(new Double(a/b));
	}
}
