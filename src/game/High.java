package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class High extends BasicGameState{

	public High(int state){

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("High!", 100, 100);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
	}
	
	public int getID(){
		return 2;
	}

}


