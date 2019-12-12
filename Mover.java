
public class Mover {

	int x;
	int y;
	
	int velocityx = 0;
	int velocityy = 0;
	
	int accelx = 0;
	int accely = 0;
	
	public Mover(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public void move() {
		x += velocityx;
		y += velocityy;
	}
	
	public void accelerate() {
		velocityx += accelx;
		velocityy += accely;
	}
	
	public void update() {
		move();
		accelerate();
	}
	
	public void setVelocity(int x, int y) {
		velocityx = x;
		velocityy = y;
	}
	
	public void setAcceleration(int x, int y) {
		accelx = x;
		accely = y;
	}
	
	public void setPostion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getPositionX() {
		return x;
	}
	
	public int getpostionY() {
		return y;
	}
}
