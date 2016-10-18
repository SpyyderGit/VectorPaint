import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class PButtons extends JPanel
{

	PCommand cmd;

	public PButtons(PCommand cmd)
	{
		this.cmd = cmd;
		setLayout(null);
		setBounds(10, 100, 100, 400);
		setBackground(Color.lightGray);
		setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

		JButton btnRed = new JButton();
		btnRed.setBounds(10, 10, 40, 40);
		btnRed.setBackground(Color.red);
		btnRed.setBorder(BorderFactory.createLoweredBevelBorder());
		btnRed.setActionCommand("red");
		btnRed.addActionListener(cmd);
		add(btnRed);

		JButton btnBlack = new JButton();
		btnBlack.setBounds(55, 10, 40, 40);
		btnBlack.setBackground(Color.black);
		btnBlack.setBorder(BorderFactory.createLoweredBevelBorder());
		btnBlack.setActionCommand("black");
		btnBlack.addActionListener(cmd);
		add(btnBlack);

		JButton btnBlue = new JButton();
		btnBlue.setBounds(10, 60, 40, 40);
		btnBlue.setBackground(Color.blue);
		btnBlue.setBorder(BorderFactory.createLoweredBevelBorder());
		btnBlue.setActionCommand("blue");
		btnBlue.addActionListener(cmd);
		add(btnBlue);

		JButton btnOr = new JButton();
		btnOr.setBounds(55, 60, 40, 40);
		btnOr.setBackground(Color.ORANGE);
		btnOr.setBorder(BorderFactory.createLoweredBevelBorder());
		btnOr.setActionCommand("orange");
		btnOr.addActionListener(cmd);
		add(btnOr);

		JButton btnGreen = new JButton();
		btnGreen.setBounds(10, 110, 40, 40);
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setBorder(BorderFactory.createLoweredBevelBorder());
		btnGreen.setActionCommand("green");
		btnGreen.addActionListener(cmd);
		add(btnGreen);

		JButton btnYellow = new JButton();
		btnYellow.setBounds(55, 110, 40, 40);
		btnYellow.setBackground(Color.yellow);
		btnYellow.setBorder(BorderFactory.createLoweredBevelBorder());
		btnYellow.setActionCommand("yellow");
		btnYellow.addActionListener(cmd);
		add(btnYellow);

		JButton btnCyan = new JButton();
		btnCyan.setBounds(10, 160, 40, 40);
		btnCyan.setBackground(Color.cyan);
		btnCyan.setBorder(BorderFactory.createLoweredBevelBorder());
		btnCyan.setActionCommand("cyan");
		btnCyan.addActionListener(cmd);
		add(btnCyan);

		JButton btnMag = new JButton();
		btnMag.setBounds(55, 160, 40, 40);
		btnMag.setBackground(Color.MAGENTA);
		btnMag.setBorder(BorderFactory.createLoweredBevelBorder());
		btnMag.setActionCommand("magenta");
		btnMag.addActionListener(cmd);
		add(btnMag);

		JButton btnLastik = new JButton();
		btnLastik.setBounds(10, 210, 40, 40);
		btnLastik.setBackground(Color.white);
		btnLastik.setText("Lastik");
		btnLastik.setBorder(BorderFactory.createLoweredBevelBorder());
		btnLastik.setActionCommand("lastik");
		btnLastik.addActionListener(cmd);
		add(btnLastik);

		JButton btnClear = new JButton();
		btnClear.setBounds(55, 210, 40, 40);
		btnClear.setBackground(Color.white);
		btnClear.setText("Clear");
		btnClear.setBorder(BorderFactory.createLoweredBevelBorder());
		btnClear.setActionCommand("clear");
		btnClear.addActionListener(cmd);
		add(btnClear);

		JButton btnSave = new JButton("Save");
		btnSave.setBounds(10, 260, 80, 40);
		btnSave.addActionListener(cmd.save);
		add(btnSave);

		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(10, 310, 80, 40);
		add(btnLoad);
	}
}
