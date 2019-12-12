import java.awt.Font;
import java.awt.Graphics;

public class PauseMenu {

	Background pausemenu = new Background(0, 0, "BG.png");
	
	public void draw(Graphics g) {
		pausemenu.draw(g);
		
		Font oldfont = g.getFont();
		Font newfont = new Font("Arial", Font.BOLD, 60);
		g.setFont(newfont);
		g.drawString("Paused", 500, 200);
		g.drawString("Press \"K\" To Exit", 420, 400);
		g.setFont(oldfont);
	}
}
