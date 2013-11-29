import java.util.*;

public class Subtracter extends Operator {
	public Subtracter(Stack<Double> st) {
		super(st);
	}
	
	public void operate() throws EmptyStackException {
		st.push(new Double(-st.pop() + st.pop()));
	}

}
