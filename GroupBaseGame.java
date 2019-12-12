import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.event.*;
import java.applet.Applet;

public abstract class GroupBaseGame extends Applet implements Runnable, KeyListener {

	public static  double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	public static double screenHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	
	
	Image offscreen;
	Graphics offscreen_g;
	
	Thread thread;
	
	public static final int UP    = KeyEvent.VK_UP;
	public static final int DN    = KeyEvent.VK_DOWN;
	public static final int LT    = KeyEvent.VK_LEFT;
	public static final int RT    = KeyEvent.VK_RIGHT;
	public static final int SPACE = KeyEvent.VK_SPACE;
	
	public static final int ENTER = KeyEvent.VK_ENTER;
	public static final int _P    = KeyEvent.VK_P;
	public static final int _K    = KeyEvent.VK_K;
	
	
	public boolean[] pressed = new boolean[1024];
	
	public abstract void initialize();
	public void init() {
		initialize();
		
		offscreen = createImage((int)screenWidth, (int)screenWidth);
		offscreen_g = offscreen.getGraphics();
		addKeyListener(this);
		thread = new Thread(this);
		
		thread.start();
	}
	
	
	
	public abstract void inGameLoop();
	@Override
	public void run() {
		while(true) {
			inGameLoop();
			repaint();
			
			try {
				thread.sleep(16);
			}catch(Exception x) {
				
			}
		}
	}
	
	public void update(Graphics g) {
		offscreen_g.clearRect(0, 0, (int)screenWidth, (int)screenWidth);
		paint(offscreen_g);
		g.drawImage(offscreen, 0, 0, null);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		pressed[e.getKeyCode()] = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		pressed[e.getKeyCode()] = false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
