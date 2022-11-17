package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Genesect extends Pokemon {
	public Genesect(String name, int level) {
		super(name, level);
		setStats(71, 120, 95, 120, 95, 99);
		setType(Type.BUG, Type.STEEL);
		setMove(new MetalSound(), new MetalClaw(), new Thunderbolt(), new Screech());
	}
}
