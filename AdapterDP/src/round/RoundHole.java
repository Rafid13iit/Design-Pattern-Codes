package round;

public class RoundHole {
	public double radious;
	
	public RoundHole(double radious) {
		this.radious = radious;
	}
	public double getRadious() {
		return radious;
	}
	
	public boolean fits(RoundPeg peg) {
		boolean result;
		result = (this.getRadious() >= peg.getRadious());
		return result;
	}

}
