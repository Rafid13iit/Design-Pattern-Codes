package square;

public class SquarePeg {
	public double width;
	public SquarePeg(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getRadious() {
		double result;
		result = (this.width * this.width);
		return result;
	}

	

}
