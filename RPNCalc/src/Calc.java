import java.util.*;

public class Calc {
	public static Stack<Double> st = new Stack<Double>();
	private Adder add;
	private Subtracter sub;
	private Multiplier mult;
	private Divider div;
	private ResultPresenter eq;
	private Operand op;
	
	public Calc() {
		op = new Operand();
		add = new Adder();
		sub = new Subtracter();
		mult = new Multiplier();
		div = new Divider();
		eq = new ResultPresenter();
		new CalculatorGui(op, add, sub, mult, div, eq);
	}
	
	public static void main(String[] args) {
		new Calc();
	}
}
