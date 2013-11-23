package general;

import java.awt.Rectangle;

public class Status {
        private Position Position = null;
        private int SpriteID = 0;
        private int Width = 240;
        private int Height = 360;
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

        public int getWidth() {
                return Width;
        }

        public void setWidth(int width) {
                Width = width;
        }

        public int getHeight() {
                return Height;
        }

        public void setHeight(int height) {
                Height = height;
        }

        public void setSize() {
                switch (this.getSpriteID()) {



                case 0:					//idle
                        Width = 120;
                        Height = 320;
                        break;

                case 1:					//Hit
                        Width = 240;
                        break;

                case 2:					//block
                        Width = 240;
                        break;

                case 3:					//jump
                        Width = 120;
                        break;

                case 4:					//special
                        Width = 240;
                        break;
                
                case 5:					//idle
                		Width = 240;
                		break;
                    
                    
                case 6:					//hit
                		Width = 240;
                		break;
                    
                case 7:					//block
                		Width = 240;
                    	break;
                    
                case 8:					//jump
                		Width = 240;
                		break;
                    
                case 9:					//special
                		Width = 240;
                		break;
                    
                default:
                        Width = 240;
                        break;

                }
        }

        public Position[] getVerteces() {
                Position[] out = new Position[4];
                out[0] = this.getPosition();
                out[1] = this.getPosition();
                out[1].setX(out[1].getX() + this.getWidth());
                out[2] = this.getPosition();
                out[2].setY(out[2].getY() + this.getHeight());
                out[3] = out[2];
                out[3].setY(out[3].getY() + this.getWidth());
                return out;
        }
        
        public boolean collision(Status a) {
        	Rectangle r1 = new Rectangle(this.getPosition().getX(),this.getPosition().getY(),this.Width,this.Height);
        	Rectangle r2 = new Rectangle(a.getPosition().getX(),a.getPosition().getY(),a.Width,a.Height);
        	return r1.intersects(r2);    	
           	
             
        }
        
        public int ViewLeftToInt() {
        if (this.viewLeft) return 1;
        else return 0;
        }
        
       
           
        	
        

}