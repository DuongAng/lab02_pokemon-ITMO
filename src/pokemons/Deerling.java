package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Deerling extends Pokemon {
	public Deerling(String name, int level) {
		super(name, level);
		setStats(60, 60, 50, 40, 50, 75);
		setType(Type.NORMAL, Type.GRASS);
		setMove(new Swagger(), new EnergyBall(), new DoubleTeam());
		
	}

}
