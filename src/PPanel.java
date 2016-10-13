import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PPanel extends JPanel implements MouseListener, MouseMotionListener
{
	int x = 0;
	int y = 0;
	ArrayList<PLine> pp = new ArrayList<PLine>();

	PCommand cmd;

	public PPanel(PCommand cmd)
	{
		this.cmd = cmd;
		setLayout(null);
		setBounds(120, 100, 800, 600);
		setBackground(Color.white);
		addMouseListener(this);
		addMouseMotionListener(this);

	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		for (PLine p : pp)
		{
			p.paint((Graphics2D) g);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		pp.add(new PLine(x, y, e.getX(), e.getY(), cmd.data.color, 1));
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{

	}

	@Override
	public void mouseClicked(MouseEvent e)
	{

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{

	}

	@Override
	public void mouseExited(MouseEvent e)
	{

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{

	}
}
