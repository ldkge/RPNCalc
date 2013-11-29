import java.awt.HeadlessException;
import java.awt.TextField;


public class Display extends TextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean reset;

	public Display() throws HeadlessException {
		reset = new Boolean(true);
	}

	public Display(String text) throws HeadlessException {
		super(text);
		reset = new Boolean(true);
	}

	public Display(int columns) throws HeadlessException {
		super(columns);
		reset = new Boolean(true);
	}

	public Display(String text, int columns) throws HeadlessException {
		super(text, columns);
		reset = new Boolean(true);
	}
	
	public void appendText(char c) {
		String val = this.getText();
		
		if(isReset() && val.compareTo("0") != 0 && val.compareTo("Error") != 0) {
			setText(val + c);
		}
		else {
			setText(String.valueOf(c));
		}
	}
	
	@Override
	public void setText(String t) {
		if(this.getText().length() == 0) {
			super.setText("0");
		}
		else {
			super.setText(t);
		}
	}
	
	public void trimText() {
		if(isReset() && this.getText().compareTo("Error") != 0) {
			setText(this.getText().substring(0, this.getText().length()-1));
		}
		else {
			clearText();
		}
	}
	
	public void resetText() {
		reset = false;
	}
	
	private Boolean isReset() {
		return reset == false ? !(reset = !reset) : true;
	}
	
	public void clearText() {
		setText("0");
	}

}
