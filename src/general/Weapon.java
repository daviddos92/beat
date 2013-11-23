package general;

public class Weapon {
	
	int Strength = 1;
	
	static String Weapon[]= {"../GameJam/src/Weapons_Models/axe.png",
		"../GameJam/src/Weapons_Models/axe.png",
		"../GameJam/src/Weapons_Models/axe.png",
		"../GameJam/src/Weapons_Models/axe.png",
		"../GameJam/src/Weapons_Models/axe.png"} ;
	
	
	
	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public static String getRandomWeapon() {
		return Weapon[(int) Math.random() *5];
		
	}
}
