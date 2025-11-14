package tower_defense;

public abstract class Enemy implements IEnemy{
	
	int healthPoints;
	int damage;
	int gold;
	
	public Enemy(int healthPoints, int damage, int gold) {
		
		this.healthPoints = healthPoints;
		this.damage = damage;
		this.gold = gold;
		
	}
	
	//getters and setters
	
	//can be decreased by Tower
	public int getHealthpoints() {
		return this.healthPoints;
	}
		
		
	//can be decreased by Tower
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
		
		
	//how much Damage they will do to Player Health Points
	public int getDamage() {
		return this.damage;
	}
		
		
	//the amount of Gold that Player receives for killing
	public int getGold() {
		return this.gold;
	}

}
