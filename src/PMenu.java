import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PMenu extends JPanel
{
	PCommand cmd;

	public PMenu(PCommand cmd)
	{
		this.cmd = cmd;
		setLayout(null);

		setBounds(0, 0, 1000, 30);
		JMenuBar jmb = new JMenuBar();
		jmb.setBounds(0, 0, 1000, 30);
		JMenu jmFile = new JMenu("File");
		ImageIcon icon = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\save.png");
		ImageIcon iconOpen = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\open.png");
		ImageIcon iconExit = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\exit.png");
		ImageIcon iconAbout = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\about.png");

		JMenuItem itmOpen = new JMenuItem("Open", iconOpen);
		itmOpen.addActionListener(cmd.load);
		
		JMenuItem itmSave = new JMenuItem("Save", icon);
		itmSave.addActionListener(cmd.save);
		
		JMenuItem itmExit = new JMenuItem("Exit", iconExit);
		itmExit.setActionCommand("exit");
		itmExit.addActionListener(cmd);

		jmFile.add(itmSave);
		jmFile.add(itmOpen);
		jmFile.add(itmExit);

		JMenu options = new JMenu("Options");

		JMenuItem w = new JMenuItem("Width reset");
		w.addActionListener(cmd.aStr);
		w.setActionCommand("reset");
		
		
		
		JMenuItem c = new JMenuItem("Color");
		c.setActionCommand("chooser");
		c.addActionListener(cmd);

		options.add(c);
		options.add(w);

		JMenu help = new JMenu("Help");
		JMenuItem ab = new JMenuItem("About", iconAbout);
		help.add(ab);
		jmb.add(jmFile);
		jmb.add(options);
		jmb.add(help);
		add(jmb);

	}

}
