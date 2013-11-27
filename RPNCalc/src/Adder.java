import java.util.*;

public class Adder extends Operator {
	public Adder(Stack<Double> st) {
		super(st);
	}
	
	public void operate() {
		try {
			st.push(new Double(st.pop() + st.pop()));
		}
		catch(EmptyStackException e) {
			st.empty();
			display.setText("Error");
			System.out.println(e.toString());
		}
	}
}