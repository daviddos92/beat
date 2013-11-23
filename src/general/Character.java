package general;

import java.util.Calendar;

public class Character {

	private Status Status = null;
	private Position Position = null; // Position of left Foot
	private String Name = null;
	private String[] Sprite = new String[5]; // 1. Normal 2. Hit 3. Block 4.
												// Jump 5. Special
	private boolean blocked = false;

	private int maxLife = 100;
	private int Life = maxLife;
	private Weapon Weapon = null;

	Character(Status _current, String _Name, int _Life, Weapon _Weapon) {
		Name = _Name;
		Status = _current;
		Life = _Life;
		Weapon = _Weapon;

	}

	Character() {
	}

	String getName() {
		return this.Name;
	}

	String[] getSprites() {
		return this.Sprite;
	}

	String getNormalSprite() {
		return this.Sprite[0];
	}

	String getHitSprite() {
		return this.Sprite[1];
	}

	String getBlockSprite() {
		return this.Sprite[2];
	}

	String getJumpSprite() {
		return this.Sprite[3];
	}

	String getSpecialSprite() {
		return this.Sprite[4];
	}

	int getLife() {
		return this.Life;
	}

	Weapon getWeapon() {
		return this.Weapon;
	}

	void setSprites(String n, String h, String b, String j, String s) {
		this.Sprite[0] = n;
		this.Sprite[1] = h;
		this.Sprite[2] = b;
		this.Sprite[3] = j;
		this.Sprite[4] = s;
	}

	void setLife(int nLife) {
		this.Life = nLife;
	}

	void setWeapon(Weapon W) {
		this.Weapon = W;
	}

	void setPosition(Position p) {
		this.Position = p;
	}

	Position getPosition() {
		return this.Position;
	}

	public boolean isHit(Character enemy) {
		Status me = this.getStatus();
		Status him = enemy.getStatus();
		if (me.getPosition().getX() < him.getPosition().getX()) {
			return me.collision(him);
		} else {
			if (!him.isViewLeft())
				return me.collision(him);
		}
		return false;

	}

	public Status getStatus() {
		return Status;
	}

	public void setStatus(Status status) {
		Status = status;
	}

	public String[] getSprite() {
		return Sprite;
	}

	public void setSprite(String[] sprite) {
		Sprite = sprite;
	}

	public void MoveRight() {
		this.blocked=false;
		if (this.getStatus().getPosition().getX() + getStatus().getWidth() < (1280 - settings.deltaMove)) {
			this.getStatus()
					.getPosition()
					.setX((this.getStatus().getPosition().getX())
							+ settings.deltaMove);
			this.getStatus().setSpriteID(0);
			this.getStatus().setViewLeft(false); // walk Animation, view right
		}
	}

	public void MoveLeft() {
		this.blocked=false;
		if (this.getStatus().getPosition().getX() < settings.deltaMove) {
			this.getStatus().getPosition().setX((this.getStatus().getPosition().getX())-settings.deltaMove);
			this.getStatus().setSpriteID(0);
			this.getStatus().setViewLeft(true); // walk Animation, view left
		}
	}

	public void Jump() {
		this.blocked=false;
		if (true) {
			  ingame.jump+=20;
			
			
			  Calendar clock1 = Calendar.getInstance();  
		      long t1 = clock1.getTimeInMillis(); 
		      long t2=t1;
		      //do {  
		    	t1 = clock1.getTimeInMillis();  		
			this.getStatus().getPosition().setY((this.getStatus().getPosition().getY()) + settings.deltaMove);
			this.getStatus().setSpriteID(3); // Jump Animation
		//	System.out.println(this.getStatus().getPosition());
		} //while ((t1-t2)<1); }
	}

		
	public void Wait() {
	}

	public void Hit(Character enemy) {
		this.blocked=false;
		this.getStatus().setSpriteID(1); // Hit Animation
		if (enemy.isHit(this))
			if (enemy.blocked)
				enemy.Life -= settings.deltaHit; // looses Life, if hit
		enemy.Life -= 4 * settings.deltaHit;

	}

	public void Block() {
		this.Status.setSpriteID(2);
		this.blocked=true;

	}


	public void UseSkill(Character enemy) {
		this.blocked=false;
		this.getStatus().setSpriteID(4); // Hit Animation
		if (enemy.isHit(this))
			if (enemy.blocked)
				enemy.Life -= settings.deltaHit*Weapon.getStrength(); // looses Life, if hit
		enemy.Life -= 4 * settings.deltaHit*Weapon.getStrength(); }

	}