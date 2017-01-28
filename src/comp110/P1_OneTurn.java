package comp110;

import comp110.toys.Die;

/*
 * Author: <YOUR NAME>
 *
 * ONYEN: <YOUR ONYEN>
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been 
 * received or given in the completion of this work. I collaborated with
 * no one other than official COMP110 UTAs on this code.
 */
public class P1_OneTurn {

	public static void main(String[] args) {

		Console console = new Console("One Turn Drop, Stop, or Roll");
		console.speed(0.5);

		Die die = new Die();

		console.print("Welcome to One Turn Drop, Stop, and Roll");
		console.alert("Press OK to begin.");

		// Do not change the code above. Begin your work after this comment.

		console.print("Game Over");

	}

}