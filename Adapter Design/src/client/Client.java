package client;

import adapters.SquareAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoundHole hole = new RoundHole(10);
		RoundPeg rpeg = new RoundPeg(10);
		if(hole.fits(rpeg)) {
			System.err.println("Roundpeg radious = 10 fits to RoundHole with radious = 10");
		}
		else
			System.err.println("Doesn't fit");
		
		SquarePeg peg1 = new SquarePeg(7);
		SquarePeg peg2 = new SquarePeg(25);
		SquareAdapter peg1Ad = new SquareAdapter(peg1);
		SquareAdapter peg2Ad = new SquareAdapter(peg2);
		
		if(hole.fits(peg1Ad)) {
			System.err.println("Squarepeg width = 7 fits to RoundHole with radious = 10");
		}
		else
			System.err.println("Squarepeg peg1 doesn't fit.");
		
		if(hole.fits(peg2Ad)) {
			System.err.println("Squarepeg width = 25 fits to RoundHole with radious = 10");
		}
		else
			System.err.println("Squarepeg peg2 doesn't fit");

	}

}
