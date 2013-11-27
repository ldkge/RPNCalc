import java.awt.*;
import java.awt.event.*;

public class CalculatorGui extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField display;

	public CalculatorGui(Operand op, Adder add, Subtracter sub,
			Multiplier mult, Divider div, ResultPresenter eq) {
		super("RPNCalc");
		this.setLayout(null);
		this.setSize(420, 250);
		this.setResizable(false);
		
		for(int i = 0; i < 14; i++) {
			new CalcButton(ButtonInitializer.name[i], new Rectangle(ButtonInitializer.bounds[i][0], ButtonInitializer.bounds[i][1], 50, 30), op, this);
		}
		
		new CalcButton(ButtonInitializer.name[14], new Rectangle(ButtonInitializer.bounds[14][0], ButtonInitializer.bounds[14][1], 50, 30), add, this);
		new CalcButton(ButtonInitializer.name[15], new Rectangle(ButtonInitializer.bounds[15][0], ButtonInitializer.bounds[15][1], 50, 30), sub, this);
		new CalcButton(ButtonInitializer.name[16], new Rectangle(ButtonInitializer.bounds[16][0], ButtonInitializer.bounds[16][1], 50, 30), mult, this);
		new CalcButton(ButtonInitializer.name[17], new Rectangle(ButtonInitializer.bounds[17][0], ButtonInitializer.bounds[17][1], 50, 30), div, this);
		new CalcButton(ButtonInitializer.name[18], new Rectangle(ButtonInitializer.bounds[18][0], ButtonInitializer.bounds[18][1], 50, 30), eq, this);
		
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

class ButtonInitializer {
	public static final String[] name = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "Enter", "Del", "C", "+", "-", "*", "/", "="};
	public static final int[][] bounds = new int[][]{{65, 194}, {65, 156}, {125, 156}, {185, 156}, {65, 118}, {125, 118}, {185, 118}, {65, 80}, {125, 80}, {185,80}, {125, 194}, {305, 80}, {185, 194}, {305, 118}, {245, 80}, {245, 118}, {245, 156}, {245, 194}, {305, 156}};
}
