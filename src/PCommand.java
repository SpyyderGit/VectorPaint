import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PCommand implements ActionListener
{
	public PData data = new PData();

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String getCmd = e.getActionCommand();

		switch (getCmd)
		{
		case "black":
			data.color = Color.BLACK;
			break;
		case "red":
			data.color = Color.red;
			break;
		case "green":
			data.color = Color.green;
			break;
		case "yellow":
			data.color = Color.yellow;
			break;
		case "blue":
			data.color = Color.blue;
			break;
		case "orange":
			data.color = Color.ORANGE;
			break;

		case "cyan":
			data.color = Color.CYAN;
			break;
		case "magenta":
			data.color = Color.MAGENTA;
			break;
		case "lastik":
			data.color = Color.white;
			break;
		case "clear":
			data.color = Color.white;
			break;
		case "chooser":
			data.color = JColorChooser.showDialog(null, "coloe", Color.BLACK);
			break;
		case "exit":
			System.exit(0);
			break;
		}
	}
}
