import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PCommand implements ActionListener
{

	public PData data = new PData();
	public ActionStroke aStr = new ActionStroke();
	public Save save = new Save();
	public Load load = new Load();

	ArrayList<PLine> pp = new ArrayList<PLine>();

	JLabel lbl = new JLabel("Current size of line: 1 px");
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String getCmd = e.getActionCommand();

		switch (getCmd) {
		case "black":
			data.color = Color.BLACK.getRGB();
			
			break;
		case "red":
			data.color = Color.red.getRGB();
						
			break;
		case "green":
			data.color = Color.green.getRGB();
			break;
		case "yellow":
			data.color = Color.yellow.getRGB();
			break;
		case "blue":
			data.color = Color.blue.getRGB();
			break;
		case "orange":
			data.color = Color.ORANGE.getRGB();
			break;

		case "cyan":
			data.color = Color.CYAN.getRGB();
			break;
		case "magenta":
			data.color = Color.MAGENTA.getRGB();

			break;
		case "lastik":
			data.color = Color.white.getRGB();
			break;

		case "width":
			data.w = 1;
			break;

		case "clear":
			data.color = Color.white.getRGB();
			break;

		case "chooser":
			data.color = JColorChooser.showDialog(null, "color", Color.black).getRGB();
			break;
		case "exit":
			System.exit(0);
			break;
		}
	}

	class Save implements ActionListener
	{
		String str = "Lines: [";
		JFileChooser fc = new JFileChooser("D:/");
		File f;

		@Override
		public void actionPerformed(ActionEvent arg0)
		{

			int ret = fc.showDialog(null, "Сохранить файл в: ");
			if (ret == JFileChooser.APPROVE_OPTION)
			{

				f = fc.getSelectedFile();
			}

			for (PLine p : pp)
			{
				str += "{x1:" + p.x1 + "," + "y1:" + p.y1 + "," + "x2:" + p.x2 + "," + "y2:" + p.y2 + ",w:" + p.width
						+ "," + "c:" + p.color + "}";
			}
			str += "]";

			BufferedWriter bw = null;
			try
			{
				bw = new BufferedWriter(new FileWriter(f));
				bw.append(str);
				bw.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	class Load implements ActionListener
	{
		String str = null;
		JFileChooser fc = new JFileChooser("D:/");
		File f;
		String[] s;
		int x11 = 0;
		int y11 = 0;
		int x22 = 0;
		int y22 = 0;
		int w = 0;
		int c = 0;

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			int ret = fc.showDialog(null, "Загрузить");

			if (ret == JFileChooser.APPROVE_OPTION)
			{
				f = fc.getSelectedFile();
			}

			BufferedReader reader = null;
			try
			{
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
				while ((str = reader.readLine()) != null)
				{
					s = str.split("\\{|\\}");
				}

				for (int i = 0; i < s.length - 1; i++)
				{
					if (s[i].equals("") || s[i].indexOf("x") < 0)
					{
						continue;
					}
					else
					{
						x11 = Integer.parseInt(s[i].substring((s[i].indexOf("x1:") + 3), s[i].indexOf("y1") - 1));
						y11 = Integer.parseInt(s[i].substring((s[i].indexOf("y1:") + 3), s[i].indexOf("x2") - 1));
						x22 = Integer.parseInt(s[i].substring((s[i].indexOf("x2:") + 3), s[i].indexOf("y2") - 1));
						y22 = Integer.parseInt(s[i].substring((s[i].indexOf("y2:") + 3), s[i].indexOf("w") - 1));
						w = Integer.parseInt(s[i].substring((s[i].indexOf("w:") + 2), s[i].indexOf("c") - 1));
						c = Integer.parseInt(s[i].substring((s[i].indexOf("c:") + 2)));

						pp.add(new PLine(x11, y11, x22, y22, w, c));
					}
				}
			}
			catch (FileNotFoundException e1)
			{
				JOptionPane.showMessageDialog(null, "Файл не найден");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	class ActionStroke implements ActionListener
	{
		public int i = data.w;

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String str = e.getActionCommand();

			switch (str) {
			case "plus":
				i++;
				data.w = i;
				lbl.setText("Current size of line: " + i + " px");
				break;
			case "minus":
				if (i > 1)
				{
					i--;
					data.w = i;
					lbl.setText("Current size of line: " + i + " px");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Достигнут минимальный размер линии");
				}
				break;
			case "reset":
				i = 1;
				data.w = i;
				lbl.setText("Current size of line: " + i + " px");
				break;
			}
		}
	}
}