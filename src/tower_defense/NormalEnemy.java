package tower_defense;

public class NormalEnemy extends Enemy{
	
	public NormalEnemy() {
		super(EnemyConsts.BasicEnemy.healthPoints, 
				EnemyConsts.BasicEnemy.damage, 
				EnemyConsts.BasicEnemy.gold);
	}

}
