package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
	double maxHP=0;
	public Rest(double maxHP) {
		super(Type.PSYCHIC, 0, 0);
		this.maxHP=maxHP;
	}
	
	@Override 
	protected void applySelfEffects(Pokemon p) {
		Effect e1 = new Effect().turns(0).stat(Stat.HP, (int) (maxHP-p.getHP()));
		Effect e2 = new Effect().turns(2).condition(Status.SLEEP);
		p.addEffect(e1);
		p.setCondition(e2);
		
	}
	
	@Override
	protected String describe() {
		return "использует Rest";
	}

}
