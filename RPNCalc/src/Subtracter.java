import java.util.*;

public class Subtracter extends Operator {
	public Subtracter(Stack<Double> st) {
		super(st);
	}
	
	public void operate() {
		try {
			st.push(new Double(-st.pop() + st.pop()));
		}
		catch(EmptyStackException e) {
			throw new InvalidArgsException();
		}
	}

}
