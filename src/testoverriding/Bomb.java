package testoverriding;

public class Bomb extends Weapon {
	@Override
	public void fire() {
		super.fire();
		System.out.println("슈웅 펑");
	}

}
