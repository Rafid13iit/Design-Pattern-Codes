package adapters;

import round.RoundPeg;
import square.SquarePeg;

public class SquareAdapter extends RoundPeg {
	public SquarePeg peg;
	public SquareAdapter(SquarePeg peg) {
		this.peg = peg;
	}
	@Override
	public double getRadious() {
		double result;
		result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
		return result;
	}
	

}
