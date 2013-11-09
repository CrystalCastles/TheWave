package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Game extends StateBasedGame {
	
	public static final String gamename = "The Wave";
	public static final int menu = 0;
	public static final int play = 1;
	public static final int high = 2;
			
	
	public Game(String gamename) { //add name on top of window
		super(gamename);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
		this.addState(new High(high));
	}

	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.getState(high).init(gc, this);
		this.enterState(menu);
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try{
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(1000, 600, false);
			appgc.start();
		}catch(SlickException e){
			e.printStackTrace();
		}
	}

}
