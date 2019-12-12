import java.awt.Font;
import java.awt.Graphics;

public class StartMenu {

	//This background image is tentative, change will better image if possible
	Background startmenu = new Background(0, 0, "BG.png");
	
	public void draw(Graphics g) {
		startmenu.draw(g);
		Font oldfont = g.getFont();
		Font newfont = new Font("Arial", Font.BOLD, 60);
		g.setFont(newfont);
		g.drawString("Platform Game", 500, 200);
		g.drawString("Press \"Enter\" To Start", 420, 400);
		g.setFont(oldfont);
	}
}
