import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Image;
//import java.awt.Toolkit;

public class Background {

	int x;
	int y;
	Image image;
	
	public Background(int x, int y, String filename) {
		this.x = x;
		this.y = y;
		image = Toolkit.getDefaultToolkit().getImage(filename);
	}
	
	public void draw(Graphics g) {
		g.drawImage(image, x, y, null);
	}
}
