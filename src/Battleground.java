import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Battleground {
	public static void main(String[] args) {
		Battle b = new Battle();
		Genesect p1 = new Genesect("number1", 1);
		Genesect p2 = p1;
//		 p2 = new Deerling("number 2",1);
//		Sawsbuck p3 = new Sawsbuck("number 3", 1);
//		Oddish p4 = new Oddish("number 4", 1);
//		Gloom p5 = new Gloom("number 5", 1);
//		Vileplume p6 = new Vileplume("number 6", 1);
		
		b.addAlly(p1);
		b.addFoe(p2);
//		b.addAlly(p3);
//		
//		b.addFoe(p4);
//		b.addFoe(p5);
//		b.addFoe(p6);
//		
		b.go();
		
	}
}
