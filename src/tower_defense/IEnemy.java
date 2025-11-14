package tower_defense;

public interface IEnemy {
	
	//getters and setters
	
	//can be decreased by Tower
	int getHealthpoints();
			
			
	//can be decreased by Tower
	void setHealthPoints(int healthPoints);
			
	//how much Damage they will do to Player Health Points
	int getDamage();
			
			
	//the amount of Gold that Player receives for killing
	int getGold();

}
