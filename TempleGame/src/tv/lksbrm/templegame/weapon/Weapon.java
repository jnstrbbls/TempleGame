package tv.lksbrm.templegame.weapon;

public class Weapon 
{

	public String name;
	public int id;
	public int price;
	public int ammo;
	public WeaponType type;
	public String description;
	
	public Weapon(String name, int id, int price, int ammo, WeaponType type, String description)
	{
		this.name = name;
		this.id = id;
		this.price = price;
		this.ammo = ammo;
		this.type = type;
		this.description = description;
		
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}

	public int getAmmo() 
	{
		return ammo;
	}

	public void setAmmo(int ammo) 
	{
		this.ammo = ammo;
	}

	public WeaponType getType() 
	{
		return type;
	}

	public void setType(WeaponType type) 
	{
		this.type = type;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void onActivate()
	{
		
	}
	public void onEmptyMagazin()
	{
		
	}

	public void onUnbought()
	{
		
	}
	
	public void onLocked()
	{
		
	}
	


}
