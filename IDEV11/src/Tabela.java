import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Tabela extends JPanel {

	public Tabela() {

		JButton browse = new JButton("Browse");
		JButton delete = new JButton("Obrisi");
		add(browse);
		add(delete);
		JTable tabela = new JTable(new DefaultTableModel(new Object[] { "Naziv", "Putanja" }, 0));
		browse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jf = new JFileChooser("C:\\Users\\lab3\\Downloads");
				int selected = jf.showOpenDialog(null);
				File izabran = jf.getSelectedFile();
				if (selected == JFileChooser.APPROVE_OPTION) {
					String[] rows = { izabran.getName(), izabran.getPath() };

					DefaultTableModel model = (DefaultTableModel) tabela.getModel();
					model.addRow(rows);
					System.out.println("approved");
				} else if (selected == JFileChooser.CANCEL_OPTION) {
					System.out.println("cancel");
				}

			}
		});
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int selektovan = tabela.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) tabela.getModel();
				model.removeRow(selektovan);

			}
		});

		add(new JScrollPane(tabela));
		setLayout(new FlowLayout());

	}
}
