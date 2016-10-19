import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;

import javax.swing.JPanel;

public class PLine
{
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	int width = 1;
	int color;

	public PLine(int x1, int y1, int x2, int y2, int width, int color)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
		this.width = width;

	}

	void paint(Graphics2D gg)
	{
		gg.drawLine(x1, y1, x2, y2);
		Color setCol = new Color(color);
		gg.setColor(setCol);
		gg.setStroke(new BasicStroke(width));
	}
}
