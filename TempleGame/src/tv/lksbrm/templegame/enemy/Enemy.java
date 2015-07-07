package tv.lksbrm.templegame.enemy;

public class Enemy 
{

	public String name;
	public int id;
	public int health;
	public EnemyType type;
	public double xp;
	
	public Enemy(String name, int id, int health, EnemyType type, double xp)
	{
		this.name = name;
		this.id = id;
		this.health = health;
		this.type = type;
		this.xp = xp;
	}

	public String getName()
	{
		return name;
	}
	
	public double getXP()
	{
		return xp;
	}

	public Integer getId()
	{
		return id;
	}
	
	public Integer getHealth()
	{
		return health;
	}
	
	public EnemyType getType()
	{
		return type;
	}
 
	public boolean isDefeated()
	{
		if(health == 0)
		{
			return true;
		} else {
			return false;
		}
	}
	
	public void onDefeat()
	{
		
	}
	
	public void onHit()
	{
		
	}
	
	public void spawn()
	{
		
	}
}
