import java.util.Stack;
/*This class will show the results*/
public class ResultPresenter extends Operator {
	public ResultPresenter(Stack<Double> st) {
		super(st);
	}
		
	public void operate() {
		try {
			getDisplay().setText(st.pop().toString());
		}
		catch(Exception e) {
			
		}
	}

}
