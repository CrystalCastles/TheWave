package game;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{

	public String mouse = "";
	Image playNow, playNowButton, highScores, highScoresButton, exitGameButton, exitGame;
	int playNowButtonX = 300;
	int playNowButtonY = 170;
	int playNowX = 390;
	int playNowY = 190;
	int highScoresButtonX = 300;
	int highScoresButtonY = 290; 
	int highScoresX = 380;
	int highScoresY = 320;
	int exitGameButtonX = 200;
	int exitGameButtonY = 430;
	int exitGameX = 400;
	int exitGameY = 440;
	
	public Menu(int state){

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		playNowButton = new Image("res/playNowButton.png");
		playNow = new Image("res/playNow.png");
		highScoresButton = new Image("res/highScoresButton.png");
		highScores = new Image("res/highScores.png");
		exitGameButton = new Image("res/exitGameButton.png");
		exitGame = new Image("res/exitGame.png");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString(mouse, 0, 0); 
		g.drawImage(playNowButton, playNowButtonX, playNowButtonY);
		g.drawImage(playNow, playNowX, playNowY);
		g.drawImage(highScoresButton, highScoresButtonX, highScoresButtonY);
		g.drawImage(highScores, highScoresX, highScoresY);
		g.drawImage(exitGameButton, exitGameButtonX, exitGameButtonY);
		g.drawImage(exitGame, exitGameX, exitGameY);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		mouse = "x: " + xpos + " y: " + ypos;
		if((xpos>305 && xpos<387) && (ypos>342 && ypos<420)){ //play game
			if(input.isMouseButtonDown(0)){
				sbg.enterState(1);
			}
		}
		if((xpos>302 && xpos<380) && (ypos>192 && ypos<305)){ //high scores
			if(input.isMouseButtonDown(0)){
				sbg.enterState(2);
			}
		}
		if((xpos>320 && xpos<380) && (ypos>63 && ypos<165)){ //exit
			if(input.isMouseButtonDown(0)){
				System.exit(0);
			}
		}
 	}
	
	public int getID(){
		return 0;
	}

}
