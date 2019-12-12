import java.awt.Graphics;
import java.awt.Image;

public class Soldier extends Sprite{

	int x;
	int y;
	Mover mover = new Mover(x, y);
	
	public Soldier(int x, int y) {
		super(x, y, "g_dn_1.gif");
	}
	
	public void jump() {
		mover.setVelocity(0, -2);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	
	
	/*
	public void draw(Graphics g) {
		g.drawImage(img, x, y, observer)
	}
	*/
}
