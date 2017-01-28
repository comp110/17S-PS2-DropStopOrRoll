package comp110;

import comp110.toys.Die;

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