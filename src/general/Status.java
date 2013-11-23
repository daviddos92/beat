package general;

public class Status {
        private Position Position = null;
        private int SpriteID = 0;
        private int Width = 240;
        private int Height = 320;
        private boolean viewLeft = false;

        Status(Position c, int ID, boolean left) {
                Position = c;
                SpriteID = ID;
                viewLeft = left;

                switch (ID) {

                case 0:					//idle
                        Width = 120;
                        Height = 320;
                        break;

                case 1:					//Hit
                        Width = 0;
                        Height = 0;
                        break;

                case 2:					//block
                        Width = 240;
                        Height = 320;
                        break;

                case 3:					//jump
                        Width = 120;
                        Height = 320;
                        break;

                case 4:					//special
                        Width = 240;
                        Height = 320;
                        break;

                default:
                        Width = 240;
                        Height = 320;
                        break;

                }
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
                        Width = 0;
                        Height = 0;
                        break;

                case 2:					//block
                        Width = 240;
                        Height = 320;
                        break;

                case 3:					//jump
                        Width = 120;
                        Height = 320;
                        break;

                case 4:					//special
                        Width = 240;
                        Height = 320;
                        break;

                default:
                        Width = 240;
                        Height = 320;
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
                Position [] first  =this.getVerteces();
                Position [] second =a.getVerteces();
                
                if (!(first[1].getX()<second[0].getX())) return true;
                if (!(second[1].getX()<first[0].getX())) return true;
                if (!(first[0].getY()<second[2].getY())) return true;
                if (!(second[0].getY()<first[2].getY())) return true;
                return false;
        }

}