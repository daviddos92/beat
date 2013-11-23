package general;

public class Status {
        private Position Position = null;
        private int SpriteID = 0;
        private boolean viewLeft = false;

        Status(Position c, int ID, boolean left) {
                Position = c;
                SpriteID = ID;
                viewLeft = left;
                
        }

        public boolean isViewLeft() {
                return viewLeft;
        }

        public void setViewLeft(boolean viewLeft) {
                this.viewLeft = viewLeft;
        }

        public Position getPosition() {
                return Position;
        }

        public void setPosition(Position Position) {
                this.Position = Position;
        }

        public int getSpriteID() {
                return SpriteID;
        }

        public void setSpriteID(int spriteID) {
                SpriteID = spriteID;
        }
    
        public int ViewLeftToInt() {
        if (this.viewLeft) return 1;
        else return 0;
        }
        
       
           
        	
        

}