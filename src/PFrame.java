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

		add(new PPanel(cmd));
		add(new PButtons(cmd));
		add(new PToolBar(cmd));
        add(new PMenu(cmd));
		
		setVisible(true);
	}
}
