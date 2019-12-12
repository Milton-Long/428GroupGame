import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Sprite {

	int x;
	int y;
	
	Image image;
	
	public Sprite(int x, int y, String filename) {
		this.x = x;
		this.y = y;
		image = loadImage(filename);
		
	}
	
	public Image loadImage(String filename) {
		return Toolkit.getDefaultToolkit().getImage(filename);
	}
	
	public void moveUpBy(int dy) {
		y -= dy;
			
	}
	
	public void moveDownBy(int dy) {
		y += dy;
		
	}
	
	public void moveLeftBy(int dx) {
		x -= dx;
		
	}
	
	public void moveRightBy(int dx) {
		x += dx;
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(image, x, y, null);
	}
}
