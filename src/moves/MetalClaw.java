package moves;

import ru.ifmo.se.pokemon.*;

public class MetalClaw extends PhysicalMove {
	public MetalClaw() {
		super(Type.STEEL, 50, 95);
	}

	@Override

	protected void applySelfEffects(Pokemon p) {
		if (Math.random() < 0.1) {
			if (p.getStat(Stat.ATTACK) < 6) {
				p.setMod(Stat.ATTACK, 1);
			}
		}
	}
	
	@Override
	
	protected String describe() {
		return "использует Metal Claw";
		
	}

}
