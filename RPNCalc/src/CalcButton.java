import java.awt.*;
import java.awt.event.ActionListener;

public class CalcButton extends Button {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalcButton(String name, Rectangle bounds, ActionListener handler, Frame frame) {
		super(name);
		
		this.setBounds(bounds);
		this.addActionListener(handler);
		
		frame.add(this);
	}
}
