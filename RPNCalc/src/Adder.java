import java.util.*;

public class Adder extends Operator {
	public Adder(Stack<Double> st) {
		super(st);
	}
	
	public void operate() throws EmptyStackException {
		st.push(new Double(st.pop() + st.pop()));
	}
}