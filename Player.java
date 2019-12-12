import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Mover{

	int x;
	int y;
	
	int width  = 30;
	int height = 30;
	//Rectangle rect;
	
	public Player(int x, int y) {
		super(x, y);
		//rect = new Rectangle(x, y, width, height);
	}
	
	public void jump() {
		setVelocity(0, -4);
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
	
	public boolean overlaps(Rectangle r) {
		return (y+height >= r.y) && (r.y+r.height >= y) && (x+width >= r.x) && (r.x+r.width >= x);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(this.x, this.y, width, height);
		g.setColor(Color.GREEN);
		g.drawRect(this.x, this.y, width, height);
		
		g.setColor(Color.BLACK);
	}
}
