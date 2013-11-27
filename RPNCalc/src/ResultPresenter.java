import java.util.Stack;

public class ResultPresenter extends Operator {
	public ResultPresenter(Stack<Double> st) {
		super(st);
	}
		
	public void operate() {
		display.setText(st.pop().toString());
	}
	
	public void setResultPresenter(CalculatorGui cgui) {
		display = cgui.getDisplay();
	}

}
