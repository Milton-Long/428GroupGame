import java.awt.Graphics;
import java.awt.Rectangle;

public class MainGame extends GroupBaseGame {

	Soldier joe = new Soldier(500, 500);
	StartMenu smenu;
	PauseMenu pmenu;
	
	Rectangle bottomwall = new Rectangle(0, 600, 1000, 20);
	
	Player fp;
	
	public enum STATE{
		START, IN_GAME, PAUSED, GAME_OVER;
	}
	
	public STATE state = STATE.START;
	
	@Override
	public void initialize() {
		smenu = new StartMenu();
		pmenu = new PauseMenu();
		fp = new Player(500, 500);
		fp.setAcceleration(0, -2);
		//joe.mover.setAcceleration(0, 1);
		
	}

	@Override
	public void inGameLoop() {
		if(state == STATE.START) {
			if(pressed[ENTER])
				state = STATE.IN_GAME;
			if(pressed[_K])
				System.exit(1);
		}
		
		//The actual game goes in this if statement
		if(state == STATE.IN_GAME) {
			if(pressed[_P])
				state = STATE.PAUSED;
			
			if(pressed[UP])
				fp.moveUpBy(4);
			if(pressed[DN])
				fp.moveDownBy(4);
			if(pressed[LT])
				fp.moveLeftBy(4);
			if(pressed[RT])
				fp.moveRightBy(4);
			if(pressed[SPACE])
				fp.jump();
		}
		
		if(state == STATE.PAUSED) {
			if(pressed[_K])
				System.exit(1);
			
		}
		
		if(state == STATE.GAME_OVER) {
			
		}
		
		//joe.mover.update();
		fp.update();
		
		/*if(bottomwall.contains(joe.x, joe.y)) {
			joe.setY(joe.getY() - bottomwall.y);
		}*/
		
		if(fp.overlaps(bottomwall)) {
			fp.setPostion(fp.x, fp.y - bottomwall.y);
		}
			
		
	}
	
	public void paint(Graphics g) {
		if(state == STATE.START) {
			//g.drawString("Start Screen", 200, 500);
			smenu.draw(g);
		}
		
		//Draws whatever is happening in the "IN_GAME state i.e. the actual game after the start menu"
		if(state == STATE.IN_GAME) {
			//joe.draw(g);
			//g.drawString(" (int)screenWidth " + screenWidth + "screenHeight " + screenHeight , 250, 400);
			
			fp.draw(g);
			g.drawRect(bottomwall.x, bottomwall.y, bottomwall.width, bottomwall.height);
		}
		
		//Draws whatever is in the pause menu
		if(state == STATE.PAUSED) {
			pmenu.draw(g);
		}
		
		if(state == STATE.GAME_OVER) {
			
		}
		
		
	}

}
