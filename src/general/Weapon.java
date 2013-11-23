package general;

public class Weapon {        
        private int strength;
        private String sprite;
        
        public Weapon(int strength_, String sprite_){
        	strength=strength_;
        	sprite=sprite_;
        }
		public int getStrength() {
			return strength;
		}
		public void setStrength(int strength) {
			this.strength = strength;
		}
		public String getSprite() {
			return sprite;
		}
		public void setSprite(String sprite) {
			this.sprite = sprite;
		}
}
