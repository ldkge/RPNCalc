
public class Divider implements Operator {
	public void operate() {
		Double b = Calc.st.pop();
		Double a = Calc.st.pop();
		
		Calc.st.push(new Double(a/b));
	}
}
