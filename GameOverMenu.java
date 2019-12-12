import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GameOverMenu {

	Background gameover = new Background(0, 0, "BG.png");
	
	public void draw(Graphics g) {
		gameover.draw(g);
		
		Font oldfont = g.getFont();
		Font newfont = new Font("Arial", Font.BOLD, 60);
		g.setFont(newfont);
		
		g.setColor(Color.RED);
		g.drawString("Game Over", 500, 200);
		
		g.setColor(Color.DARK_GRAY);
		g.drawString("Press \"K\" To Exit", 420, 400);
		
		g.setFont(oldfont);
		g.setColor(Color.BLACK);
	}
}
