package general;

import java.awt.Rectangle;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class Character {

	private Status Status = null;
	public int jump = 0;
	private String Name = null;
	private Characters NameEnum;
    protected String[] Sprite = new String[10]; // 1. Normal 2. Hit 3. Block 
    											// 4. Jump   5. Special
    public int Height;
    public int Width;
	private boolean blocked = false;

	private int maxLife = 100;
	private int Life = maxLife;
	private Weapon Weapon = null;

	Character(Status _current, String _Name, int _Life, Weapon _Weapon) {
		Name = _Name;
		Status = _current;
		Life = _Life;
		Weapon = _Weapon;
		if (Name.equals(new String("Tom"))) NameEnum=Characters.Tom;
		if (Name.equals(new String("Emma"))) NameEnum=Characters.Emma;
		if (Name.equals(new String("Lady Lara"))) NameEnum=Characters.Lady_Lara;
		if (Name.equals(new String("Sigmund"))) NameEnum=Characters.Sigmund;


	}

	
	String getName() {
		return this.Name;
	}

	String[] getSprites() {
		return this.Sprite;
	}

	int getLife() {
		return this.Life;
	}

	Weapon getWeapon() {
		return this.Weapon;
	}

	void setLife(int nLife) {
		this.Life = nLife;
	}

	void setWeapon(Weapon W) {
		this.Weapon = W;
	}

	public boolean isHit(Character enemy) {
		Status me = this.getStatus();
		Status him = enemy.getStatus();
		if ((me.getPosition().getX() < him.getPosition().getX()) && (him.isViewLeft())) {
			return this.collision(enemy);
		} else {
			if (!him.isViewLeft())
				return this.collision(enemy);
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
		if ((this.getStatus().getPosition().getX() + Width) < (1280 - settings.deltaMove)) {
			this.getStatus()
					.getPosition()
					.setX((this.getStatus().getPosition().getX())
							+ settings.deltaMove);
			
			this.getStatus().setViewLeft(false); // walk Animation, view right
			this.getStatus().setSpriteID(0+5*this.getStatus().ViewLeftToInt());
		}
	}

	public void MoveLeft() {
		this.blocked=false;
		if (this.getStatus().getPosition().getX() > settings.deltaMove) {
			this.getStatus().getPosition().setX((this.getStatus().getPosition().getX())-settings.deltaMove);
			this.getStatus().setViewLeft(true); // walk Animation, view left
			this.getStatus().setSpriteID(0+5*this.getStatus().ViewLeftToInt());
			
		}
	}

	public void Jump() {
		this.blocked=false;
		if (this.Status.getPosition().getY()==320) {
			  this.jump+=5;
						   		
			this.getStatus().getPosition().setY((this.getStatus().getPosition().getY()) + settings.deltaMove);
			this.getStatus().setSpriteID(3+5*this.getStatus().ViewLeftToInt()); // Jump Animation
		}
	}

		
	public void Wait() {
	}

	public void Hit(Character enemy) {
		
		this.blocked=false;
		this.getStatus().setSpriteID(1+5*this.getStatus().ViewLeftToInt()); // Hit Animation
		if (enemy.isHit(this))
			{switch (enemy.NameEnum) {
		case Emma:	try {
				Sound hit = new Sound("../gamejam/src/Sound/Wheelchair_Hit.ogg");
				hit.play(1,3);
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case Lady_Lara: try {
			Sound hit = new Sound("../gamejam/src/Sound/Domina_Hit.ogg");
			hit.play(1,3);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			break;
		case Sigmund: try {
			Sound hit = new Sound("../gamejam/src/Sound/Rentner_Hit.ogg");
			hit.play(1,3);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			break;
		case Tom: try {
			Sound hit = new Sound("../gamejam/src/Sound/Lili_Hit.ogg");
			hit.play(1,3);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			break;
		default:
			break;
			
			
		}
			if (enemy.blocked)
				enemy.Life -= settings.deltaHit; // looses Life, if hit
		enemy.Life -= 4 * settings.deltaHit;}else {
			switch (this.NameEnum) {
			case Emma:	try {
					Sound hit = new Sound("../gamejam/src/Sound/Wheelchair_Attack.ogg");
					hit.play(1,3);
				} catch (SlickException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case Lady_Lara: try {
				Sound hit = new Sound("../gamejam/src/Sound/Domina_Attack.ogg");
				hit.play(1,3);
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
			case Sigmund: try {
				Sound hit = new Sound("../gamejam/src/Sound/Rentner_Attack.ogg");
				hit.play(1,3);
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
			case Tom: try {
				Sound hit = new Sound("../gamejam/src/Sound/Lili_Attack.ogg");
				hit.play(1,3);
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
			default:
				break;
				
				
			}}
		

	}

	public void Block() {
		this.Status.setSpriteID(2+5*this.getStatus().ViewLeftToInt());
		this.blocked=true;

	}


	public void UseSkill(Character enemy) {
		this.blocked=false;
		this.getStatus().setSpriteID(4+5*this.getStatus().ViewLeftToInt()); // Hit Animation
		if (enemy.isHit(this))
			if (enemy.blocked)
				enemy.Life -= settings.deltaHit*Weapon.getStrength(); // looses Life, if hit
		enemy.Life -= 4 * settings.deltaHit*Weapon.getStrength(); }

	
	
	public boolean isAlive() {
		if (this.Life>0) return true;
		return false;
	}
	
	public boolean collision(Character a) {
    	Rectangle r1 = new Rectangle(this.Status.getPosition().getX(),this.Status.getPosition().getY(),this.Width,this.Height);
    	Rectangle r2 = new Rectangle(a.Status.getPosition().getX(),a.Status.getPosition().getY(),a.Width,a.Height);
    	return r1.intersects(r2);    	
       	
         
    }
	public void updateSize() {}
	public void setSprites() {}
	
	
	
	}