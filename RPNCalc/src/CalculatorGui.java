import java.awt.*;
import java.awt.event.*;

public class CalculatorGui extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Operand op;
    Adder add;
	Subtracter sub;
	Multiplier mult;
	Divider div;
	ResultPresenter eq;
	private TextField display;

	public CalculatorGui(Operand op, Adder add, Subtracter sub,
			Multiplier mult, Divider div, ResultPresenter eq) {
		super("RPNCalc");
		this.setLayout(null);
		this.setSize(420, 250);
		this.setResizable(false);
		
		
		this.op = op;
		this.add = add;
		this.mult = mult;
		this.div = div;
		this.eq = eq;
		
		for(int i = 0; i < ButtonInitializer.name.length; i++)
		{
			Button button = new Button(ButtonInitializer.name[i]);
			button.addActionListener(new ButtonHandler(this));
			button.setBounds(ButtonInitializer.bounds[i][0], ButtonInitializer.bounds[i][1], 50, 30);
			this.add(button);
		}
		
		display = new TextField("0",14);
	    display.setEditable(false);
	    display.setBounds(65, 38, 290, 32);
	    this.add(display);
				
		this.setVisible(true);
		this.addWindowListener(new CloseWindowAndExit());
	}
	
	public TextField getDisplay() {
		return display;
	}
}

class CloseWindowAndExit extends WindowAdapter {
	public void windowClosing(WindowEvent closeWindowAndExit) {
		System.exit(0);
	}
}

class ButtonHandler implements ActionListener {
	CalculatorGui cgui;
	
	public ButtonHandler(CalculatorGui cgui) {
		this.cgui = cgui;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(isNumber(((Button)arg0.getSource()).getLabel())) {
			cgui.op.addDigit(((Button)arg0.getSource()).getLabel().toCharArray()[0]);
		}
		else {
			switch(((Button)arg0.getSource()).getLabel().toCharArray()[0]) {
			case 'D': cgui.op.deleteLastDigit(); break;
			case 'E': cgui.op.complete(); break;
			case 'C': cgui.op.reset(); break;
			case '+': cgui.add.operate(); break;
			case '-': cgui.sub.operate(); break;
			case '*': cgui.mult.operate(); break;
			case '/': cgui.div.operate(); break;
			case '=': cgui.eq.operate(); break;
			case '.': cgui.op.addDigit(((Button)arg0.getSource()).getLabel().toCharArray()[0]); break;
			}
		}
	}
	
	private boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
}

class ButtonInitializer {
	public static final String[] name = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Enter", "Del", "C", "+", "-", "*", "/", "=", "."};
	public static final int[][] bounds = new int[][]{{65, 194}, {65, 156}, {125, 156}, {185, 156}, {65, 118}, {125, 118}, {185, 118}, {65, 80}, {125, 80}, {185,80}, {305, 80}, {185, 194}, {305, 118}, {245, 80}, {245, 118}, {245, 156}, {245, 194}, {305, 156}, {125, 194}};
}
