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
		g.fillOval(125, 200, 100, 200);
		
		
		//create ears
		g.fillOval(50, 70, 90, 90);
		g.fillOval(200, 70, 90, 90);
		
		//create head
		g.fillOval(105, 110, 130, 130);
		g.fillOval(110, 175, 120, 70);
		
		//create the face
		Color skin = new Color(255,234,199);
		g.setColor(skin);
		g.fillOval(125, 120, 60, 80);
		g.fillOval(155, 120, 60, 80);
		g.fillOval(115, 180, 110, 60);
		
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
		
		//create create eyes
		g.setColor(Color.BLACK);
		g.fillOval(151, 146, 15, 40);
		g.fillOval(173, 146, 15, 40);
				
		g.setColor(Color.WHITE);
		g.fillOval(152, 152, 12, 34);
		g.fillOval(175, 152, 12, 34);
				
		g.setColor(Color.BLACK);
		g.fillOval(152, 161, 10, 24);
		g.fillOval(174, 161, 10, 24);

		//nose line
		g.setColor(Color.BLACK);
		g.fillOval(150, 182, 40, 30);
		
		g.setColor(skin);
		g.fillOval(148, 184, 44, 28);
		
		//create nose
		g.setColor(Color.BLACK);
		g.fillOval(155, 186, 30, 25);
		
		g.setColor(Color.WHITE);
		g.fillOval(160, 190, 15, 10);
		
		g.setColor(Color.BLACK);
		g.fillOval(162, 192, 20, 10);
		
		//pants
		g.setColor(Color.RED);
		g.fillRect(125, 300, 100, 150);
		
		//buttons
		g.setColor(Color.BLACK);
		g.drawOval(135, 308, 33, 33);
		g.drawOval(173, 308, 33, 33);
		
		g.setColor(Color.WHITE);
		g.fillOval(137, 310, 31, 31);
		g.fillOval(175, 310, 31, 31);
		
		g.setColor(Color.BLACK);
		g.drawOval(139, 312, 26, 26);
		g.drawOval(177, 312, 26, 26);
		
		
		//shoes
		g.setColor(Color.YELLOW);
		g.fillOval(50, 380, 250, 50);
		
		g.setColor(Color.BLACK);
		g.drawLine(175, 380, 175, 430);
		
		
	}

}
