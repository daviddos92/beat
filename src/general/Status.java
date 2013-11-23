package general;

public class Status {
	Position Position = null;
	int SpriteID = 0;
	int Width=0;
	int Height=0;
		
	Status(Position c, int ID) {
		Position=c;
		SpriteID=ID;
		
		switch (ID) {
			
			case 0: 
				Width=0;
				Height=0;
			break;
			
			case 1: 
				Width=0;
				Height=0;
			break;
			
			case 2: 
				Width=0;
				Height=0;
			break;
			
			case 3: 
				Width=0;
				Height=0;
			break;
			
			case 4: 
				Width=0;
				Height=0;
			break;
			
			default:
				Width=0;
				Height=0;
			break;
				
		}
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
			Width=0;
			Height=0;
			break;
	
		case 1: 
			Width=0;
			Height=0;
			break;
	
		case 2: 
			Width=0;
			Height=0;
		break;
	
		case 3: 
			Width=0;
			Height=0;
		break;
	
		case 4: 
			Width=0;
			Height=0;
		break;
	
		default:
			Width=0;
			Height=0;
		break;
	}
		
	}

}
