package general;

public class Status {
        private Position Position = null;
        private int SpriteID = 0;
        private int Width = 0;
        private int Height = 0;
        private boolean viewLeft = false;

        Status(Position c, int ID, boolean left) {
                Position = c;
                SpriteID = ID;
                viewLeft = left;

                switch (ID) {

                case 0:
                        Width = 0;
                        Height = 0;
                        break;

                case 1:
                        Width = 0;
                        Height = 0;
                        break;

                case 2:
                        Width = 0;
                        Height = 0;
                        break;

                case 3:
                        Width = 0;
                        Height = 0;
                        break;

                case 4:
                        Width = 0;
                        Height = 0;
                        break;

                default:
                        Width = 0;
                        Height = 0;
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

                case 0:
                        Width = 0;
                        Height = 0;
                        break;

                case 1:
                        Width = 0;
                        Height = 0;
                        break;

                case 2:
                        Width = 0;
                        Height = 0;
                        break;

                case 3:
                        Width = 0;
                        Height = 0;
                        break;

                case 4:
                        Width = 0;
                        Height = 0;
                        break;

                default:
                        Width = 0;
                        Height = 0;
                        break;
                }
        }

        public Position[] getVerteces() {
                Position[] out = new Position[4];
                out[2] = this.getPosition();
                out[3] = this.getPosition();
                out[3].setX(out[3].getX() + this.getWidth());
                out[0] = this.getPosition();
                out[0].setY(out[0].getY() + this.getHeight());
                out[1] = out[0];
                out[1].setY(out[1].getY() + this.getWidth());
                return out;
        }
        
        public boolean collision(Status a) {
                Position [] first  =this.getVerteces();
                Position [] second =a.getVerteces();
                
                if (first[1].getX()<second[0].getX()) return false;
                if (second[1].getX()<first[0].getX()) return false;
                if (first[0].getY()<second[2].getY()) return false;
                if (second[0].getY()<first[2].getY()) return false;
                return true;
        }

}