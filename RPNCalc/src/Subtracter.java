import java.util.Stack;

public class Subtracter extends Operator {
	public Subtracter(Stack<Double> st) {
		super(st);
	}
	
	public void operate() {
		st.push(new Double(-st.pop() + st.pop()));
	}

}
