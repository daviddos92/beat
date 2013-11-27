package general;

public class input {
	
	Player one = null;
	Player two = null;

	input(Player _one,Player _two) {
		one=_one;
		two=_two;
	}
	
	input(Character c1,Character c2,control p1t, control p2t) {
	one = new Player(p1t,c1,c2);
	two = new Player(p2t,c2,c1);
	}
	
	public void round() {
		one.Round();
		two.Round();
	}
}
