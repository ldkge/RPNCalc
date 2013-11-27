import java.util.Stack;

public class Multiplier extends Operator {
	public Multiplier(Stack<Double> st) {
		super(st);
	}
	
	public void operate() {
		st.push(new Double(st.pop() * st.pop()));
	}
}
