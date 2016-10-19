import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PPanel extends JPanel implements MouseListener, MouseMotionListener
{
	int x = 0;
	int y = 0;

	PCommand cmd;

	public PPanel(PCommand cmd)
	{
		this.cmd = cmd;
		setLayout(null);
		
		
		addMouseListener(this);
		addMouseMotionListener(this);

	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		for (PLine p : cmd.pp)
		{
			p.paint((Graphics2D) g);
		}
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		cmd.pp.add(new PLine(x, y, e.getX(), e.getY(), cmd.data.w, cmd.data.color));
		x = e.getX();
		y = e.getY();
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
