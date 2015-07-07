package tv.lksbrm.templegame;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import tv.lksbrm.templegame.gui.Frame;
import tv.lksbrm.templegame.weapon.Weapon;

public class Player
{
	
	public Frame mainframe = new Frame("Game");

	public int coins;
	public String name;
	public int health;
	public int level;
	public double exp;
	public int x;
	public int y;
	public static PlayerCanvas pc = new PlayerCanvas();
	
	public ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	
	
	public ImageIcon texture = new ImageIcon(getClass().getResource("Playerstay.png"));

	
	public Player(String name, int coins, int health, int level, double exp)
	{
		this.name = name;
		this.coins = coins;
		this.health = health;
		this.level = level;
		this.exp = exp;
	

	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	public void addWeapon(Weapon w)
	{
		weapons.add(w);
	}
	public ArrayList<Weapon> getWeapons()
	{
		return weapons;
	}
	public ImageIcon getTexture()
	{
		return texture;
		
	}
	public void setTexture(ImageIcon ic)
	{
		texture = ic;
	}
	public int getX()
	{
		return x;
		
	}
	public int getY()
	{
		return y;
		
	}
	public void setX(int pixel)
	{
		x = pixel;
		updatePosition();
	}
	public void setY(int pixel)
	{
		y = pixel;
		updatePosition();
	}
	public void updatePosition()
	{
	
		
	
		
		Main.PLAYER.setBounds((int) x,(int) y, 240, 704);
        Main.frame.add(Main.PLAYER);
		
	}
}
