
public class Adder implements Operator {
	public void operate() {
		Calc.st.push(new Double(Calc.st.pop() + Calc.st.pop()));
	}
}
