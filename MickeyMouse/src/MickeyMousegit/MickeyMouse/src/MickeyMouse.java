import java.awt.*;
public class MickeyMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawingPanel panel = new DrawingPanel(400, 410);
		panel.setBackground(Color.CYAN);
		Graphics g = panel.getGraphics();
		
		//create arms
		g.setColor(Color.BLACK);
		
		//create legs
		
		//create body
		g.fillOval(100, 200, 150, 200);
		
		
		//create ears
		g.fillOval(50, 70, 90, 90);
		g.fillOval(200, 70, 90, 90);
		
		//create head
		g.fillOval(110, 110, 120, 130);
		g.fillOval(110, 175, 120, 70);
		
		//create the face
		Color skin = new Color(255,234,199);
		g.setColor(skin);
		g.fillOval(120, 130, 60, 100);
		g.fillOval(160, 130, 60, 100);
		g.fillOval(115, 180, 110, 60);
		
		//create create eyes
		g.setColor(Color.BLACK);
		g.fillOval(139, 142, 19, 40);
		g.fillOval(175, 142, 19, 40);
		
		g.setColor(Color.WHITE);
		g.fillOval(141, 148, 14, 34);
		g.fillOval(177, 148, 14, 34);
		
		g.setColor(Color.BLACK);
		g.fillOval(144, 157, 14, 14);
		g.fillOval(175, 157, 14, 14);
		
		//create mouth
		g.setColor(skin);
		g.fillOval(135, 205, 70, 50);
				
		g.setColor(Color.BLACK);
		g.fillOval(150, 190, 40, 50);
		g.drawOval(137, 180, 65, 50);
		
		g.setColor(Color.RED);
		g.fillOval(156, 191, 30, 47);
		
		g.setColor(skin);
		g.fillOval(136, 175, 68, 55);
		
		//create nose
		g.setColor(Color.BLACK);
		g.fillOval(145, 182, 45, 25);
		
		g.setColor(Color.WHITE);
		g.fillOval(150, 186, 15, 10);
		
		g.setColor(Color.BLACK);
		g.fillOval(152, 188, 25, 10);
		
		//pants
		g.setColor(Color.RED);
		g.fillRect(100, 300, 150, 150);
		
		//buttons
		g.setColor(Color.BLACK);
		g.drawOval(118, 308, 42, 42);
		g.drawOval(188, 308, 42, 42);
		
		g.setColor(Color.WHITE);
		g.fillOval(120, 310, 40, 40);
		g.fillOval(190, 310, 40, 40);
		
		g.setColor(Color.BLACK);
		g.drawOval(122, 312, 35, 35);
		g.drawOval(192, 312, 35, 35);
		
		
		//shoes
		g.setColor(Color.YELLOW);
		g.fillOval(50, 380, 250, 50);
		
		g.setColor(Color.BLACK);
		g.drawLine(175, 380, 175, 430);
		
		
	}

}
