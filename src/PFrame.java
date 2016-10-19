import java.awt.Color;

import javax.swing.JFrame;

public class PFrame extends JFrame
{
	public PFrame()
	{

		setLayout(null);
		setTitle("Paint");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(10, 10, 1000, 800);
		
		
		PCommand cmd = new PCommand();
		PPanel pp = new PPanel(cmd);
		PButtons pb = new PButtons(cmd);
		PToolBar pt = new PToolBar(cmd);
		PMenu pm = new PMenu(cmd);

		// ======= Size and colors of panels ==========

		// ---------------- PPanel --------------------
		pp.setBounds(120, 100, 800, 600);
		pp.setBackground(Color.white);

		// --------------- PButtons ------------------

		pb.setBounds(10, 100, 100, 400);
		pb.setBackground(Color.lightGray);

		// ---------------- PToolBar -----------------

		pt.setBounds(0, 30, 1000, 40);

		// ----------------- PMenu -------------------

		pm.setBounds(0, 0, 1000, 30);

		// ===========================================

		add(pp);
		add(pb);
		add(pt);
		add(pm);

		setVisible(true);
	}
}
