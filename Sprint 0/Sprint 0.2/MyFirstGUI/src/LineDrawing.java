import javax.swing.*;
import java.awt.*;


class LineDrawing extends JComponent{
	
	//Line
		public void paint(Graphics g) {
			g.drawLine(0, 70, 300, 70);
			g.drawLine(0, 240, 300, 240);
		}

}