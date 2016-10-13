import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class PToolBar extends JPanel
{
	PCommand cmd;

	public PToolBar(PCommand cmd)
	{
		this.cmd = cmd;

		setLayout(null);

		setBounds(0, 30, 1000, 40);
		JToolBar jtb = new JToolBar();
		jtb.setLayout(null);
		jtb.setBounds(0, 10, 1000, 40);

		JButton btnW = new JButton("Width");
		btnW.setBounds(120, 0, 70, 30);
		jtb.add(btnW);

		JButton btnColor = new JButton("Colors");
		btnColor.setBounds(190, 0, 70, 30);
		btnColor.setActionCommand("chooser");
		btnColor.addActionListener(cmd);
		jtb.add(btnColor);

		JButton btnRed = new JButton("");
		btnRed.setBounds(290, 0, 30, 30);
		btnRed.setBackground(Color.red);
		btnRed.setActionCommand("red");
		btnRed.addActionListener(cmd);
		jtb.add(btnRed);

		JButton btnBlack = new JButton("");
		btnBlack.setBounds(330, 0, 30, 30);
		btnBlack.setBackground(Color.BLACK);
		btnBlack.setActionCommand("black");
		btnBlack.addActionListener(cmd);
		jtb.add(btnBlack);

		JButton btnBlue = new JButton("");
		btnBlue.setBounds(370, 0, 30, 30);
		btnBlue.setBackground(Color.blue);
		btnBlue.setActionCommand("blue");
		btnBlue.addActionListener(cmd);
		jtb.add(btnBlue);

		JButton btnOrange = new JButton("");
		btnOrange.setBounds(410, 0, 30, 30);
		btnOrange.setBackground(Color.orange);
		btnOrange.setActionCommand("orange");
		btnOrange.addActionListener(cmd);
		jtb.add(btnOrange);

		JButton btnGreen = new JButton("");
		btnGreen.setBounds(450, 0, 30, 30);
		btnGreen.setBackground(Color.green);
		btnGreen.setActionCommand("green");
		btnGreen.addActionListener(cmd);
		jtb.add(btnGreen);

		JButton btnYellow = new JButton("");
		btnYellow.setBounds(490, 0, 30, 30);
		btnYellow.setBackground(Color.yellow);
		btnYellow.setActionCommand("yellow");
		btnYellow.addActionListener(cmd);
		jtb.add(btnYellow);

		JButton btnCyan = new JButton("");
		btnCyan.setBounds(530, 0, 30, 30);
		btnCyan.setBackground(Color.cyan);
		btnCyan.setActionCommand("cyan");
		btnCyan.addActionListener(cmd);
		jtb.add(btnCyan);

		JButton btnMagenta = new JButton("");
		btnMagenta.setBounds(570, 0, 30, 30);
		btnMagenta.setBackground(Color.magenta);
		btnMagenta.setActionCommand("magenta");
		btnMagenta.addActionListener(cmd);
		jtb.add(btnMagenta);

		add(jtb);
	}
}
