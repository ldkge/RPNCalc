import java.util.Stack;

public class ResultPresenter extends Operator {
	public ResultPresenter(Stack<Double> st) {
		super(st);
	}
		
	public void operate() {
		getDisplay().setText(st.pop().toString());
	}

}
