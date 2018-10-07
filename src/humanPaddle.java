import java.awt.Graphics;
import java.awt.Color;

public class humanPaddle implements paddle {
	
	double y, yVel;
	boolean upAccel, downAccel;
	int player, x;

	public humanPaddle(int player) {
		upAccel = false; downAccel = false;
		y = 210; yVel = 0;
		if(player == 1)
			x = 20;
		else
			x = 660;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.drawRect(x, (int)y, 20, 80);
	}
	
	public void move() {
		
	}
	
	public void setUpAccel(boolean input) {
		upAccel = input;
	}
	
	public void setDownAccel(boolean input) {
		downAccel = input;
	}
	
	public int getY() {
		return (int)y;
	}
}