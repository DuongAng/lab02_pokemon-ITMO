package pokemons;

import moves.*;

public class Sawsbuck extends Deerling {
	public Sawsbuck(String name, int level) {
	super(name, level);
	setStats(80, 100, 70, 60, 70, 95);
	addMove(new SwordsDance());
	}
}
