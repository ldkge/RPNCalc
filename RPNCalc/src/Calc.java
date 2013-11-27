import java.util.*;

public class Calc {
	private Stack<Double> st;
	private Adder add;
	private Subtracter sub;
	private Multiplier mult;
	private Divider div;
	private ResultPresenter eq;
	private Operand op;
	private CalculatorGui cgui;
	
	public Calc() {
		st = new Stack<Double>();
		op = new Operand(st);
		add = new Adder(st);
		sub = new Subtracter(st);
		mult = new Multiplier(st);
		div = new Divider(st);
		eq = new ResultPresenter(st);
		cgui = new CalculatorGui(op, add, sub, mult, div, eq);
		op.setDisplay(cgui.getDisplay());
		add.setDisplay(cgui.getDisplay());
		sub.setDisplay(cgui.getDisplay());
		mult.setDisplay(cgui.getDisplay());
		div.setDisplay(cgui.getDisplay());
	}
	
	public static void main(String[] args) {
		new Calc();
	}
}
